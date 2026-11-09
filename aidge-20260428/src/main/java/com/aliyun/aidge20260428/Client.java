// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428;

import com.aliyun.tea.*;
import com.aliyun.aidge20260428.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Aidge";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aidge", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously adds content to a display knowledge base in batches.</p>
     * 
     * @param tmpReq AddDisplayKnowledgeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDisplayKnowledgeResponse
     */
    public AddDisplayKnowledgeResponse addDisplayKnowledgeWithOptions(AddDisplayKnowledgeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddDisplayKnowledgeShrinkRequest request = new AddDisplayKnowledgeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.records)) {
            request.recordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.records, "Records", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ragId)) {
            query.put("RagId", request.ragId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordsShrink)) {
            query.put("Records", request.recordsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDisplayKnowledge"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDisplayKnowledgeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously adds content to a display knowledge base in batches.</p>
     * 
     * @param request AddDisplayKnowledgeRequest
     * @return AddDisplayKnowledgeResponse
     */
    public AddDisplayKnowledgeResponse addDisplayKnowledge(AddDisplayKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDisplayKnowledgeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Virtual try-on for clothing:</strong>
     * Supports various clothing categories such as tops, bottoms, jumpsuits, and dresses. After you upload a model image and a product image, the service generates a natural and realistic try-on effect to intuitively display how the clothing looks on the model.</li>
     * <li><strong>Virtual try-on for shoes and hats:</strong>
     * Supports virtual try-on for products such as shoes and hats. The service intelligently matches the position and proportion of the product based on the model\&quot;s pose and body parts to present a coordinated and realistic wearing effect.</li>
     * <li><strong>E-commerce product display and marketing:</strong>
     * Helps merchants quickly generate model try-on images for different products, reducing the costs of traditional photography, outfit changes, and post-production, and improving the production efficiency of product images.</li>
     * <li><strong>Online shopping experience optimization:</strong>
     * Allows consumers to preview the wearing effect of products through virtual try-on, providing a more intuitive understanding of the style, matching, and overall effect of the products, which assists in purchase decisions and enhances the shopping experience.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>First, you need to provide a model image and a product image. The system uses the model image as the try-on subject and applies the clothing from the product image to the model:</strong><ul>
     * <li>a. Model image: The image of the person who will virtually try on the clothing.</li>
     * <li>b. Product image: The image of the clothing, shoes, or hat to be worn by the model.</li>
     * </ul>
     * </li>
     * <li><strong>Second, you can select the corresponding product type based on the actual product. Supported types include tops, bottoms, jumpsuits, dresses, shoes, and hats:</strong><ul>
     * <li>a. Specify product type: You can directly specify the type of the current product, and the system will process it according to the specified type.</li>
     * <li>b. Automatic type recognition: If you do not specify the product type, the system automatically recognizes the product category in the product image and performs the virtual try-on based on the recognition result.</li>
     * </ul>
     * </li>
     * <li><strong>Finally, the system generates a virtual try-on image by combining the model image, product image, and product type to display the wearing effect of the product on the model:</strong><ul>
     * <li>a. Preserve model details: The generation process does not alter the appearance, hairstyle, pose, body shape, or other details of the person in the original model image.</li>
     * <li>b. Maintain image consistency: The background, composition, lighting, and overall visual effect of the original model image remain unchanged. Only the wearing area corresponding to the product is processed.</li>
     * <li>c. Generate try-on effect: The product is naturally applied to the model, fitting the person\&quot;s pose and body structure to generate a coordinated and realistic virtual try-on image.</li>
     * </ul>
     * </li>
     * </ul>
     * <h2>Examples</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Type</strong></th>
     * <th><strong>Model image</strong></th>
     * <th><strong>Clothing image</strong></th>
     * <th><strong>Try-on result image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Tops</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/e4273b03-0d3b-4e98-b8f3-8713fccee303.png" alt="lQLPJv-OKUNDSxvNBojNA62wAMWEBuiTUuMKXnNidWFWAA_941_1672.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/d9ab77f7-8791-4fa5-8d76-4fda3e2e1310.png" alt="Front view of male model in shirt-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/42982786-73ee-4d23-a8d0-551f7a18be22.png" alt="7c1c0c04-9828-940f-b86d-c08f7ec8fb97_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Bottoms</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/f79a31cb-08bd-4b59-be9d-9b9aa3f60230.png" alt="Bootcut jeans-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/297f29eb-7bc9-49a5-b4f7-114375a0f312.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Shoes</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/bb9804b5-0ab9-485b-829b-d54708377fd2.png" alt="Front view of male model\\&quot;s shoes-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/8e54fdc3-7a86-4e3b-aa1d-f3741ce7658c.png" alt="91d7b8c4-fc31-9a7f-8b6e-3bec5e62efb3_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Jumpsuits</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/7f5cec40-a884-4640-8339-6109305dfa1d.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/635096eb-f2b2-4fd8-91d8-4c7e2e7d7ad1.png" alt="20c8b46a-213e-985c-aab2-d56f8752f3a4_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Dresses</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/3d4a6de0-95d2-40cf-9105-48b5e899e0d3.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/a3cbb609-db71-47d6-8ac6-884f18c6596f.png" alt="45b630e6-4e9d-9bf0-bb4e-224b30a91f77_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Hats</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/ac26f38e-acc7-49d1-a4ec-a51b54e4bd66.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/34176b57-3aa8-4b6e-8d0f-808ae953654a.png" alt="Hat-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/949b4c28-8821-4aa5-a2b4-e4acc1e57b9b.png" alt="881f02f3-12f5-95dd-b651-98fab6e30fa0_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates a virtual try-on image by applying a clothing item to a model based on the provided clothing and model images. This AI-powered image generation API service replaces the model\&quot;s existing clothing with the specified item while preserving the model\&quot;s pose, facial features, and other background details. It ensures a realistic and well-fitted appearance of the clothing on the model. You can obtain the processed image by providing the URLs of the original images.</p>
     * 
     * @param request AiTryOnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AiTryOnResponse
     */
    public AiTryOnResponse aiTryOnWithOptions(AiTryOnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clothImageUrl)) {
            query.put("ClothImageUrl", request.clothImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clothType)) {
            query.put("ClothType", request.clothType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelImageUrl)) {
            query.put("ModelImageUrl", request.modelImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AiTryOn"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AiTryOnResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Virtual try-on for clothing:</strong>
     * Supports various clothing categories such as tops, bottoms, jumpsuits, and dresses. After you upload a model image and a product image, the service generates a natural and realistic try-on effect to intuitively display how the clothing looks on the model.</li>
     * <li><strong>Virtual try-on for shoes and hats:</strong>
     * Supports virtual try-on for products such as shoes and hats. The service intelligently matches the position and proportion of the product based on the model\&quot;s pose and body parts to present a coordinated and realistic wearing effect.</li>
     * <li><strong>E-commerce product display and marketing:</strong>
     * Helps merchants quickly generate model try-on images for different products, reducing the costs of traditional photography, outfit changes, and post-production, and improving the production efficiency of product images.</li>
     * <li><strong>Online shopping experience optimization:</strong>
     * Allows consumers to preview the wearing effect of products through virtual try-on, providing a more intuitive understanding of the style, matching, and overall effect of the products, which assists in purchase decisions and enhances the shopping experience.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>First, you need to provide a model image and a product image. The system uses the model image as the try-on subject and applies the clothing from the product image to the model:</strong><ul>
     * <li>a. Model image: The image of the person who will virtually try on the clothing.</li>
     * <li>b. Product image: The image of the clothing, shoes, or hat to be worn by the model.</li>
     * </ul>
     * </li>
     * <li><strong>Second, you can select the corresponding product type based on the actual product. Supported types include tops, bottoms, jumpsuits, dresses, shoes, and hats:</strong><ul>
     * <li>a. Specify product type: You can directly specify the type of the current product, and the system will process it according to the specified type.</li>
     * <li>b. Automatic type recognition: If you do not specify the product type, the system automatically recognizes the product category in the product image and performs the virtual try-on based on the recognition result.</li>
     * </ul>
     * </li>
     * <li><strong>Finally, the system generates a virtual try-on image by combining the model image, product image, and product type to display the wearing effect of the product on the model:</strong><ul>
     * <li>a. Preserve model details: The generation process does not alter the appearance, hairstyle, pose, body shape, or other details of the person in the original model image.</li>
     * <li>b. Maintain image consistency: The background, composition, lighting, and overall visual effect of the original model image remain unchanged. Only the wearing area corresponding to the product is processed.</li>
     * <li>c. Generate try-on effect: The product is naturally applied to the model, fitting the person\&quot;s pose and body structure to generate a coordinated and realistic virtual try-on image.</li>
     * </ul>
     * </li>
     * </ul>
     * <h2>Examples</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Type</strong></th>
     * <th><strong>Model image</strong></th>
     * <th><strong>Clothing image</strong></th>
     * <th><strong>Try-on result image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Tops</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/e4273b03-0d3b-4e98-b8f3-8713fccee303.png" alt="lQLPJv-OKUNDSxvNBojNA62wAMWEBuiTUuMKXnNidWFWAA_941_1672.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/d9ab77f7-8791-4fa5-8d76-4fda3e2e1310.png" alt="Front view of male model in shirt-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/42982786-73ee-4d23-a8d0-551f7a18be22.png" alt="7c1c0c04-9828-940f-b86d-c08f7ec8fb97_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Bottoms</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/f79a31cb-08bd-4b59-be9d-9b9aa3f60230.png" alt="Bootcut jeans-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/297f29eb-7bc9-49a5-b4f7-114375a0f312.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Shoes</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/bb9804b5-0ab9-485b-829b-d54708377fd2.png" alt="Front view of male model\\&quot;s shoes-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/8e54fdc3-7a86-4e3b-aa1d-f3741ce7658c.png" alt="91d7b8c4-fc31-9a7f-8b6e-3bec5e62efb3_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Jumpsuits</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/7f5cec40-a884-4640-8339-6109305dfa1d.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/635096eb-f2b2-4fd8-91d8-4c7e2e7d7ad1.png" alt="20c8b46a-213e-985c-aab2-d56f8752f3a4_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Dresses</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/3d4a6de0-95d2-40cf-9105-48b5e899e0d3.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/a3cbb609-db71-47d6-8ac6-884f18c6596f.png" alt="45b630e6-4e9d-9bf0-bb4e-224b30a91f77_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Hats</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/ac26f38e-acc7-49d1-a4ec-a51b54e4bd66.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/34176b57-3aa8-4b6e-8d0f-808ae953654a.png" alt="Hat-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/949b4c28-8821-4aa5-a2b4-e4acc1e57b9b.png" alt="881f02f3-12f5-95dd-b651-98fab6e30fa0_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates a virtual try-on image by applying a clothing item to a model based on the provided clothing and model images. This AI-powered image generation API service replaces the model\&quot;s existing clothing with the specified item while preserving the model\&quot;s pose, facial features, and other background details. It ensures a realistic and well-fitted appearance of the clothing on the model. You can obtain the processed image by providing the URLs of the original images.</p>
     * 
     * @param request AiTryOnRequest
     * @return AiTryOnResponse
     */
    public AiTryOnResponse aiTryOn(AiTryOnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aiTryOnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>Optimizes cross-platform product materials for cross-border e-commerce sellers with a one-click, cost-effective service. Takes a product link from a source platform and outputs a full set of materials, including titles, attributes, main images, SKU images, detail images, and copy, tailored to the target platform requirements. Uses an official pre-built, lowest-cost workflow that focuses on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * <h2>Scenarios</h2>
     * <p>Applies to cost-sensitive, cross-platform listing scenarios that prioritize speed, volume, and low cost. Examples include broad listing from 1688 to TEMU, bulk listing of high-SKU inventory, entry-level AI processing capabilities provided by top sellers and ERP or SaaS platforms, and merchants with high daily processing volumes but low requirements for marketing performance.
     * Reduces AI generation steps by filtering images with watermarks or non-compliant elements and prioritizing clean original images. This helps merchants complete cross-platform listing at an extremely low call cost.</p>
     * <h2>Features</h2>
     * <p>This service uses the official pre-built lowest-cost product optimization workflow, covering the entire process from material acquisition, compliance filtering, and text optimization to image processing:</p>
     * <ol>
     * <li>Automatically parses 1688 product links and extracts multiple types of materials, including titles, SKUs, main images, detail images, and attributes.</li>
     * <li>Completes text filtering and SEO optimization based on the TEMU platform blacklist and compliance rules.</li>
     * <li>Intelligently identifies watermarks, logos, and Chinese copy in images, and prioritizes filtering and selecting clean original images. SKU images and a small number of main images are processed by using image translation capabilities to meet platform specifications. High-conversion images with marketing copy may be filtered out.</li>
     * <li>Completes category matching, attribute filling, and localized rewriting based on the requirements of the target platform.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Optimizes cross-platform product materials for cross-border e-commerce sellers with a one-click, cost-effective service. Takes a product link from a source platform and outputs a full set of materials, including titles, attributes, main images, SKU images, detail images, and copy, tailored to the target platform requirements. Uses an official pre-built, lowest-cost workflow that focuses on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * 
     * @param request AssetOptimizeLiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssetOptimizeLiteResponse
     */
    public AssetOptimizeLiteResponse assetOptimizeLiteWithOptions(AssetOptimizeLiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            query.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTrans)) {
            query.put("NeedTrans", request.needTrans);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productUrl)) {
            query.put("ProductUrl", request.productUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePlatform)) {
            query.put("SourcePlatform", request.sourcePlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPlatform)) {
            query.put("TargetPlatform", request.targetPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            query.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssetOptimizeLite"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssetOptimizeLiteResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>Optimizes cross-platform product materials for cross-border e-commerce sellers with a one-click, cost-effective service. Takes a product link from a source platform and outputs a full set of materials, including titles, attributes, main images, SKU images, detail images, and copy, tailored to the target platform requirements. Uses an official pre-built, lowest-cost workflow that focuses on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * <h2>Scenarios</h2>
     * <p>Applies to cost-sensitive, cross-platform listing scenarios that prioritize speed, volume, and low cost. Examples include broad listing from 1688 to TEMU, bulk listing of high-SKU inventory, entry-level AI processing capabilities provided by top sellers and ERP or SaaS platforms, and merchants with high daily processing volumes but low requirements for marketing performance.
     * Reduces AI generation steps by filtering images with watermarks or non-compliant elements and prioritizing clean original images. This helps merchants complete cross-platform listing at an extremely low call cost.</p>
     * <h2>Features</h2>
     * <p>This service uses the official pre-built lowest-cost product optimization workflow, covering the entire process from material acquisition, compliance filtering, and text optimization to image processing:</p>
     * <ol>
     * <li>Automatically parses 1688 product links and extracts multiple types of materials, including titles, SKUs, main images, detail images, and attributes.</li>
     * <li>Completes text filtering and SEO optimization based on the TEMU platform blacklist and compliance rules.</li>
     * <li>Intelligently identifies watermarks, logos, and Chinese copy in images, and prioritizes filtering and selecting clean original images. SKU images and a small number of main images are processed by using image translation capabilities to meet platform specifications. High-conversion images with marketing copy may be filtered out.</li>
     * <li>Completes category matching, attribute filling, and localized rewriting based on the requirements of the target platform.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Optimizes cross-platform product materials for cross-border e-commerce sellers with a one-click, cost-effective service. Takes a product link from a source platform and outputs a full set of materials, including titles, attributes, main images, SKU images, detail images, and copy, tailored to the target platform requirements. Uses an official pre-built, lowest-cost workflow that focuses on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * 
     * @param request AssetOptimizeLiteRequest
     * @return AssetOptimizeLiteResponse
     */
    public AssetOptimizeLiteResponse assetOptimizeLite(AssetOptimizeLiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assetOptimizeLiteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>A one-click cross-platform product material optimization service for cross-border e-commerce sellers (best effect edition). Input a 1688 product link to generate a complete set of materials, including titles, attributes, main images, SKU images, detail images, and copy, tailored to TEMU platform requirements.</p>
     * <h2>Scenarios</h2>
     * <p>Applicable to scenarios with high requirements for the quality and conversion performance of cross-platform product materials. Examples include categories highly dependent on marketing materials such as apparel, accessories, cosmetics, and home goods; brand merchants and high-ticket items that need to retain the tone of marketing images with copy; top sellers and ERP/SaaS platforms conducting localized operations across multiple languages and markets; and scenarios requiring category-specific materials, such as size charts and weight and dimension charts, to improve listing quality and conversion rates.</p>
     * <h2>Features</h2>
     * <p>This service uses the official pre-built best-effect product optimization workflow, covering the entire pipeline from material acquisition, diagnosis, filtering, and optimization to output:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract a full set of materials, including titles, SKUs, main images, detail images, and attributes, and intelligently diagnoses missing materials and optimization opportunities.</li>
     * <li>Uses LLMs for text compliance filtering, SEO keyword optimization, five-point description generation, and multilingual localization rewriting.</li>
     * <li>Invokes multiple capabilities for images, including intelligent recognition, intelligent background removal, intelligent object removal, Image Translation Pro, image outpainting, intelligent cropping, and high-definition upscaling.</li>
     * <li>Generates category-specific materials, such as size charts and weight and dimension charts for apparel.</li>
     * <li>Outputs a standardized product material package ready for direct listing.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product material optimization service for cross-border e-commerce sellers (optimal performance edition). This asynchronous operation takes 1688 product links as input and generates a full set of materials tailored to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copy. It uses officially pre-configured optimal workflows to maximize AI capabilities, retains and localizes brand marketing materials, and generates personalized materials such as size charts for categories like apparel.</p>
     * 
     * @param tmpReq AssetOptimizeProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssetOptimizeProResponse
     */
    public AssetOptimizeProResponse assetOptimizeProWithOptions(AssetOptimizeProRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AssetOptimizeProShrinkRequest request = new AssetOptimizeProShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNameList)) {
            request.columnNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNameList, "ColumnNameList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnNameListShrink)) {
            query.put("ColumnNameList", request.columnNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            query.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageModel)) {
            query.put("LanguageModel", request.languageModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTrans)) {
            query.put("NeedTrans", request.needTrans);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productUrl)) {
            query.put("ProductUrl", request.productUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePlatform)) {
            query.put("SourcePlatform", request.sourcePlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPlatform)) {
            query.put("TargetPlatform", request.targetPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            query.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssetOptimizePro"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssetOptimizeProResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>A one-click cross-platform product material optimization service for cross-border e-commerce sellers (best effect edition). Input a 1688 product link to generate a complete set of materials, including titles, attributes, main images, SKU images, detail images, and copy, tailored to TEMU platform requirements.</p>
     * <h2>Scenarios</h2>
     * <p>Applicable to scenarios with high requirements for the quality and conversion performance of cross-platform product materials. Examples include categories highly dependent on marketing materials such as apparel, accessories, cosmetics, and home goods; brand merchants and high-ticket items that need to retain the tone of marketing images with copy; top sellers and ERP/SaaS platforms conducting localized operations across multiple languages and markets; and scenarios requiring category-specific materials, such as size charts and weight and dimension charts, to improve listing quality and conversion rates.</p>
     * <h2>Features</h2>
     * <p>This service uses the official pre-built best-effect product optimization workflow, covering the entire pipeline from material acquisition, diagnosis, filtering, and optimization to output:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract a full set of materials, including titles, SKUs, main images, detail images, and attributes, and intelligently diagnoses missing materials and optimization opportunities.</li>
     * <li>Uses LLMs for text compliance filtering, SEO keyword optimization, five-point description generation, and multilingual localization rewriting.</li>
     * <li>Invokes multiple capabilities for images, including intelligent recognition, intelligent background removal, intelligent object removal, Image Translation Pro, image outpainting, intelligent cropping, and high-definition upscaling.</li>
     * <li>Generates category-specific materials, such as size charts and weight and dimension charts for apparel.</li>
     * <li>Outputs a standardized product material package ready for direct listing.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product material optimization service for cross-border e-commerce sellers (optimal performance edition). This asynchronous operation takes 1688 product links as input and generates a full set of materials tailored to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copy. It uses officially pre-configured optimal workflows to maximize AI capabilities, retains and localizes brand marketing materials, and generates personalized materials such as size charts for categories like apparel.</p>
     * 
     * @param request AssetOptimizeProRequest
     * @return AssetOptimizeProResponse
     */
    public AssetOptimizeProResponse assetOptimizePro(AssetOptimizeProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assetOptimizeProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <p>Cross-platform product listing attribute filling: When merchants list products across platforms, the source platform and the TEMU platform have different attribute fields required for different categories, and there are complex hierarchical associated options (such as material -&gt; wood type -&gt; density). Manual filling is time-consuming and error-prone. This service automatically understands product information and intelligently fills in various attributes. It is suitable for scenarios such as automated batch product listing for top sellers, ERP/SaaS platform integration, and quick product listing for SMB merchants.</p>
     * <h1>Features</h1>
     * <p>Users input the product title, source category, product details, SKU, product attributes, and product images (up to 10). The system uses multimodal AI to understand the semantic and visual features of the product and completes two core tasks: 1. Matches the precise category path of the product on the TEMU platform. 2. Automatically fills in the required attributes under the category (such as material, battery properties, size, and connectivity) and returns the confidence level and filling reason for each attribute. The API operates in synchronous mode and returns results immediately after the call.</p>
     * <h1>Comparison</h1>
     * <p>Take the attributes of a USB fan as an example:
     * | <strong>1688 attribute</strong> | <strong>1688 attribute value</strong> | <strong>TEMU attribute</strong> | <strong>TEMU attribute value</strong> | <strong>Is it an existing</strong></p>
     * <p><strong>1688 attribute?</strong> |
     * | --- | --- | --- | --- | --- |
     * | Brand | Other | Power supply method | USB charging (built-in battery) | No |
     * | Battery life | 3-6h (inclusive) | Rechargeable battery | Lithium battery | No |
     * | Additional features | Digital display | Battery capacity (mAh) | 4000 | Yes |
     * | Built-in battery capacity | 2000mAh-4000mAh (inclusive) | Fan features | High-speed features | No |
     * | Item number | X699 | Control method | Button | Yes |
     * | Main downstream platforms | eBay, Amazon, Wish, AliExpress, Independent site, LAZADA, Other | Finish type | Painted | Yes |
     * | Has licensable own brand | No | Recommended use | Cooling | No |
     * | Dimensions | 65\*60\*171 | Fan design | Wearable fan | No |
     * | Suitable gift-giving occasions | Personal gifts | Included components | None | No |
     * | Shell craftsmanship | Spraying (UV paint, rubber paint, metallic paint, piano baking paint, pearlescent powder) | Material | Plastic | No |
     * | Package volume | 65\*60\*171 | Special features | Portable | No |
     * | Exterior dimensions | 51\*36\*34 | Indoor/outdoor use | Both indoor and outdoor | No |
     * | Wind speed gears | 3 gears | Brand name | None | No |
     * | Operation method | Standard button |  |  |  |
     * | Fan blade material | ABS |  |  |  |
     * | Power supply method | USB |  |  |  |
     * | Built-in battery | Built-in battery |  |  |  |
     * | Patented source | No |  |  |  |
     * | Color | X699 fan-yellow, X699 fan-light purple, X699 fan-sky blue, X699 fan-orange, X699 fan-light green, Standard small fan |  |  |  |
     * | Main sales regions | Japan and South Korea, Africa, South Korea, Japan, Europe, South America, Southeast Asia, North America, Northeast Asia, Middle East, Latin America, Europe and America, Other |  |  |  |
     * | Exclusive source for cross-border export | Yes |  |  |  |
     * | Style | Fresh |  |  |  |
     * | Motor type | Brushless motor |  |  |  |
     * | Noise | 36dB(A)-45dB(A) (inclusive) |  |  |  |
     * | Net weight | 125g |  |  |  |
     * | Number of fan blades | 6 or more |  |  |  |
     * | Fan category | Handheld fan |  |  |  |</p>
     * 
     * <b>summary</b> : 
     * <p>Provides an intelligent cross-platform product category attribute filling service based on multimodal large models. Accepts product information from a source platform, automatically matches the category on a target platform, and intelligently fills all required attribute fields under the category to provide a one-stop solution for category selection and attribute filling during product listing. (Synchronous)</p>
     * 
     * @param tmpReq CategoryAttributeMatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CategoryAttributeMatchResponse
     */
    public CategoryAttributeMatchResponse categoryAttributeMatchWithOptions(CategoryAttributeMatchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CategoryAttributeMatchShrinkRequest request = new CategoryAttributeMatchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageUrl)) {
            request.imageUrlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageUrl, "ImageUrl", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlShrink)) {
            body.put("ImageUrl", request.imageUrlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemSpec)) {
            body.put("ItemSpec", request.itemSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sku)) {
            body.put("Sku", request.sku);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCategory)) {
            body.put("SourceCategory", request.sourceCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePlatform)) {
            body.put("SourcePlatform", request.sourcePlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPlatform)) {
            body.put("TargetPlatform", request.targetPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CategoryAttributeMatch"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CategoryAttributeMatchResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <p>Cross-platform product listing attribute filling: When merchants list products across platforms, the source platform and the TEMU platform have different attribute fields required for different categories, and there are complex hierarchical associated options (such as material -&gt; wood type -&gt; density). Manual filling is time-consuming and error-prone. This service automatically understands product information and intelligently fills in various attributes. It is suitable for scenarios such as automated batch product listing for top sellers, ERP/SaaS platform integration, and quick product listing for SMB merchants.</p>
     * <h1>Features</h1>
     * <p>Users input the product title, source category, product details, SKU, product attributes, and product images (up to 10). The system uses multimodal AI to understand the semantic and visual features of the product and completes two core tasks: 1. Matches the precise category path of the product on the TEMU platform. 2. Automatically fills in the required attributes under the category (such as material, battery properties, size, and connectivity) and returns the confidence level and filling reason for each attribute. The API operates in synchronous mode and returns results immediately after the call.</p>
     * <h1>Comparison</h1>
     * <p>Take the attributes of a USB fan as an example:
     * | <strong>1688 attribute</strong> | <strong>1688 attribute value</strong> | <strong>TEMU attribute</strong> | <strong>TEMU attribute value</strong> | <strong>Is it an existing</strong></p>
     * <p><strong>1688 attribute?</strong> |
     * | --- | --- | --- | --- | --- |
     * | Brand | Other | Power supply method | USB charging (built-in battery) | No |
     * | Battery life | 3-6h (inclusive) | Rechargeable battery | Lithium battery | No |
     * | Additional features | Digital display | Battery capacity (mAh) | 4000 | Yes |
     * | Built-in battery capacity | 2000mAh-4000mAh (inclusive) | Fan features | High-speed features | No |
     * | Item number | X699 | Control method | Button | Yes |
     * | Main downstream platforms | eBay, Amazon, Wish, AliExpress, Independent site, LAZADA, Other | Finish type | Painted | Yes |
     * | Has licensable own brand | No | Recommended use | Cooling | No |
     * | Dimensions | 65\*60\*171 | Fan design | Wearable fan | No |
     * | Suitable gift-giving occasions | Personal gifts | Included components | None | No |
     * | Shell craftsmanship | Spraying (UV paint, rubber paint, metallic paint, piano baking paint, pearlescent powder) | Material | Plastic | No |
     * | Package volume | 65\*60\*171 | Special features | Portable | No |
     * | Exterior dimensions | 51\*36\*34 | Indoor/outdoor use | Both indoor and outdoor | No |
     * | Wind speed gears | 3 gears | Brand name | None | No |
     * | Operation method | Standard button |  |  |  |
     * | Fan blade material | ABS |  |  |  |
     * | Power supply method | USB |  |  |  |
     * | Built-in battery | Built-in battery |  |  |  |
     * | Patented source | No |  |  |  |
     * | Color | X699 fan-yellow, X699 fan-light purple, X699 fan-sky blue, X699 fan-orange, X699 fan-light green, Standard small fan |  |  |  |
     * | Main sales regions | Japan and South Korea, Africa, South Korea, Japan, Europe, South America, Southeast Asia, North America, Northeast Asia, Middle East, Latin America, Europe and America, Other |  |  |  |
     * | Exclusive source for cross-border export | Yes |  |  |  |
     * | Style | Fresh |  |  |  |
     * | Motor type | Brushless motor |  |  |  |
     * | Noise | 36dB(A)-45dB(A) (inclusive) |  |  |  |
     * | Net weight | 125g |  |  |  |
     * | Number of fan blades | 6 or more |  |  |  |
     * | Fan category | Handheld fan |  |  |  |</p>
     * 
     * <b>summary</b> : 
     * <p>Provides an intelligent cross-platform product category attribute filling service based on multimodal large models. Accepts product information from a source platform, automatically matches the category on a target platform, and intelligently fills all required attribute fields under the category to provide a one-stop solution for category selection and attribute filling during product listing. (Synchronous)</p>
     * 
     * @param request CategoryAttributeMatchRequest
     * @return CategoryAttributeMatchResponse
     */
    public CategoryAttributeMatchResponse categoryAttributeMatch(CategoryAttributeMatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.categoryAttributeMatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Provides an intelligent cross-platform product category matching service based on large language models. Accepts product information from a source platform, automatically matches the optimal category on the target platform, and returns a confidence score and matching rationale to help merchants quickly select categories for cross-platform product listing. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <p>Cross-platform product listing: After sourcing products, merchants list them on a target platform and need to map the products to the correct categories in the target platform\&quot;s category tree. Manual category selection requires familiarity with the target platform\&quot;s complete category system, which is time-consuming, labor-intensive, and error-prone. Incorrect category matching can lead to product delisting and other issues.
     * This service automatically completes category mapping and is suitable for scenarios such as batch calls from self-built systems of top sellers, integration of automated product listing workflows into ERP/SaaS platforms, and quick listing of single products by SMB merchants.
     * The current version only supports TEMU as the target platform. It does not currently support directly retrieving product information from the source platform, requiring users to manually input parameters. Future updates will add this capability and expand support for more source and target platforms.</p>
     * <h2>Features</h2>
     * <p>Users input fields such as the product title, source category, product details, SKU information, and product attributes. The system uses an AI model to understand the product semantics and matches the most appropriate category path from the full category tree of the TEMU platform. The returned results include the complete category path (CategoryPath), category name (CategoryName), confidence score (0-100), and matching rationale. The API operates in synchronous mode and returns results immediately after the call, making it suitable for embedding in real-time business workflows.</p>
     * <h2>Examples</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source platform</strong></th>
     * <th><strong>Image</strong></th>
     * <th><strong>Source platform category</strong></th>
     * <th><strong>Target platform</strong></th>
     * <th><strong>Target platform category</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1688</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/jP2lRYjv7234mO8g/img/69a226e8-aff1-4891-bb0a-c47c1ea397ae.png" alt="done-image-245c58c8-a9fc-4e32-b959-8b4bcd52b264.png"></td>
     * <td>USB fans, mini fans</td>
     * <td>TEMU</td>
     * <td>Home Appliances</td>
     * </tr>
     * <tr>
     * <td>\&gt;Heating, Cooling &amp; Air Quality Appliances</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Electric Fans</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;USB Fans</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>1688</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/jP2lRYjv7234mO8g/img/8a546f7d-826e-43d6-b5f3-12d1edef8897.png" alt="image.png"></td>
     * <td>Bracelets</td>
     * <td>TEMU</td>
     * <td>Clothing, Shoes &amp; Jewelry</td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Accessories</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Bracelets &amp; Bangles</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Charms &amp; Charm Bracelets</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Charm Bracelets</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Chain Charm Bracelets</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides an intelligent cross-platform product category matching service based on large language models. Accepts product information from a source platform, automatically matches the optimal category on the target platform, and returns a confidence score and matching rationale to help merchants quickly select categories for cross-platform product listing. (Synchronous)</p>
     * 
     * @param request CategoryMatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CategoryMatchResponse
     */
    public CategoryMatchResponse categoryMatchWithOptions(CategoryMatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemSpec)) {
            query.put("ItemSpec", request.itemSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sku)) {
            query.put("Sku", request.sku);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCategory)) {
            query.put("SourceCategory", request.sourceCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePlatform)) {
            query.put("SourcePlatform", request.sourcePlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPlatform)) {
            query.put("TargetPlatform", request.targetPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CategoryMatch"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CategoryMatchResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Provides an intelligent cross-platform product category matching service based on large language models. Accepts product information from a source platform, automatically matches the optimal category on the target platform, and returns a confidence score and matching rationale to help merchants quickly select categories for cross-platform product listing. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <p>Cross-platform product listing: After sourcing products, merchants list them on a target platform and need to map the products to the correct categories in the target platform\&quot;s category tree. Manual category selection requires familiarity with the target platform\&quot;s complete category system, which is time-consuming, labor-intensive, and error-prone. Incorrect category matching can lead to product delisting and other issues.
     * This service automatically completes category mapping and is suitable for scenarios such as batch calls from self-built systems of top sellers, integration of automated product listing workflows into ERP/SaaS platforms, and quick listing of single products by SMB merchants.
     * The current version only supports TEMU as the target platform. It does not currently support directly retrieving product information from the source platform, requiring users to manually input parameters. Future updates will add this capability and expand support for more source and target platforms.</p>
     * <h2>Features</h2>
     * <p>Users input fields such as the product title, source category, product details, SKU information, and product attributes. The system uses an AI model to understand the product semantics and matches the most appropriate category path from the full category tree of the TEMU platform. The returned results include the complete category path (CategoryPath), category name (CategoryName), confidence score (0-100), and matching rationale. The API operates in synchronous mode and returns results immediately after the call, making it suitable for embedding in real-time business workflows.</p>
     * <h2>Examples</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source platform</strong></th>
     * <th><strong>Image</strong></th>
     * <th><strong>Source platform category</strong></th>
     * <th><strong>Target platform</strong></th>
     * <th><strong>Target platform category</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1688</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/jP2lRYjv7234mO8g/img/69a226e8-aff1-4891-bb0a-c47c1ea397ae.png" alt="done-image-245c58c8-a9fc-4e32-b959-8b4bcd52b264.png"></td>
     * <td>USB fans, mini fans</td>
     * <td>TEMU</td>
     * <td>Home Appliances</td>
     * </tr>
     * <tr>
     * <td>\&gt;Heating, Cooling &amp; Air Quality Appliances</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Electric Fans</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;USB Fans</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>1688</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/jP2lRYjv7234mO8g/img/8a546f7d-826e-43d6-b5f3-12d1edef8897.png" alt="image.png"></td>
     * <td>Bracelets</td>
     * <td>TEMU</td>
     * <td>Clothing, Shoes &amp; Jewelry</td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Accessories</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Bracelets &amp; Bangles</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Charms &amp; Charm Bracelets</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Charm Bracelets</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;Women\&quot;s Fashion Chain Charm Bracelets</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides an intelligent cross-platform product category matching service based on large language models. Accepts product information from a source platform, automatically matches the optimal category on the target platform, and returns a confidence score and matching rationale to help merchants quickly select categories for cross-platform product listing. (Synchronous)</p>
     * 
     * @param request CategoryMatchRequest
     * @return CategoryMatchResponse
     */
    public CategoryMatchResponse categoryMatch(CategoryMatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.categoryMatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously deletes content from a display knowledge base in batches.</p>
     * 
     * @param tmpReq DeleteDisplayKnowledgeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDisplayKnowledgeResponse
     */
    public DeleteDisplayKnowledgeResponse deleteDisplayKnowledgeWithOptions(DeleteDisplayKnowledgeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDisplayKnowledgeShrinkRequest request = new DeleteDisplayKnowledgeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordIds)) {
            request.recordIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordIds, "RecordIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ragId)) {
            query.put("RagId", request.ragId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordIdsShrink)) {
            query.put("RecordIds", request.recordIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDisplayKnowledge"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDisplayKnowledgeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously deletes content from a display knowledge base in batches.</p>
     * 
     * @param request DeleteDisplayKnowledgeRequest
     * @return DeleteDisplayKnowledgeResponse
     */
    public DeleteDisplayKnowledgeResponse deleteDisplayKnowledge(DeleteDisplayKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDisplayKnowledgeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p><strong>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the floor display area inference product.</strong></p>
     * <ul>
     * <li>This operation infers the actual dimensions (the lengths of the two sides) and floor area of a floor display based on the provided overall image of the floor display, the SKU knowledge base, and the position information of products in the image.</li>
     * <li>Make sure that the knowledge base corresponding to the provided <code>RagId</code> belongs to the caller and is in the <code>AVAILABLE</code> state.</li>
     * <li>The <code>Products</code> array must contain at least one product item, and the <code>Boxes</code> array under each product item must contain at least one bounding box.</li>
     * <li>All coordinate values are represented in a normalized coordinate system ranging from 0 to 1000. Make sure that the input satisfies the <code>Left &lt; Right</code> and <code>Top &lt; Bottom</code> conditions.</li>
     * <li>Set a reasonable timeout period (recommended maximum of 300 seconds) when calling this API to prevent failures caused by network latency or high processing complexity.</li>
     * <li>For calls in the production environment, use the POP Action method for access. Internal REST addresses are mainly used for joint debugging during the development and testing phases.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calculates the side lengths and floor area of a floor display based on the floor display image and product bounding boxes.</p>
     * 
     * @param tmpReq DiduiAreaDeductionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiduiAreaDeductionResponse
     */
    public DiduiAreaDeductionResponse diduiAreaDeductionWithOptions(DiduiAreaDeductionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DiduiAreaDeductionShrinkRequest request = new DiduiAreaDeductionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.products)) {
            request.productsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.products, "Products", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productsShrink)) {
            query.put("Products", request.productsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ragId)) {
            query.put("RagId", request.ragId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetImageUrl)) {
            query.put("TargetImageUrl", request.targetImageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiduiAreaDeduction"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiduiAreaDeductionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p><strong>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the floor display area inference product.</strong></p>
     * <ul>
     * <li>This operation infers the actual dimensions (the lengths of the two sides) and floor area of a floor display based on the provided overall image of the floor display, the SKU knowledge base, and the position information of products in the image.</li>
     * <li>Make sure that the knowledge base corresponding to the provided <code>RagId</code> belongs to the caller and is in the <code>AVAILABLE</code> state.</li>
     * <li>The <code>Products</code> array must contain at least one product item, and the <code>Boxes</code> array under each product item must contain at least one bounding box.</li>
     * <li>All coordinate values are represented in a normalized coordinate system ranging from 0 to 1000. Make sure that the input satisfies the <code>Left &lt; Right</code> and <code>Top &lt; Bottom</code> conditions.</li>
     * <li>Set a reasonable timeout period (recommended maximum of 300 seconds) when calling this API to prevent failures caused by network latency or high processing complexity.</li>
     * <li>For calls in the production environment, use the POP Action method for access. Internal REST addresses are mainly used for joint debugging during the development and testing phases.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calculates the side lengths and floor area of a floor display based on the floor display image and product bounding boxes.</p>
     * 
     * @param request DiduiAreaDeductionRequest
     * @return DiduiAreaDeductionResponse
     */
    public DiduiAreaDeductionResponse diduiAreaDeduction(DiduiAreaDeductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.diduiAreaDeductionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Scenarios</em>*</p>
     * <ul>
     * <li>Floor display area evaluation: Infers the area of the bounding rectangle based on the overall photo of the floor display and the actual dimensions of the products.</li>
     * <li>Multi-SKU mixed layout analysis: Uses the dimensions of different products to infer the side lengths.</li>
     * <li>Area result review: Verifies the results by combining the original image, product assets, and the returned side lengths and area.
     * <strong>Features</strong></li>
     * <li>SKU asset-driven: Specifies the asset knowledge base by using ragId. Each participating product must have a name, positive length, width, and height, and at least one HTTPS reference image.</li>
     * <li>Phased area inference: Sequentially forms decision edges, SKU projections, dimension accumulation, and the final area.</li>
     * <li>Unified units: SKU asset dimensions are stored in centimeters. The resulting side lengths are output in meters and the area in square meters.</li>
     * <li>Completeness and numerical validation: Returns a failure if assets are missing, no valid bounding boxes are found, or the area does not meet product consistency.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Analyzes the area of floor displays based on product recognition, SKU asset knowledge bases, and dedicated area reasoning model building. The product first locates products in the floor display, reads the actual dimensions and reference images of the corresponding SKUs, and infers the side lengths and area of the bounding rectangle of the floor display. This feature is suitable for evaluating the scale of floor displays in stores and for inspection and review.</p>
     * 
     * @param request DiduiAreaDeductionProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiduiAreaDeductionProResponse
     */
    public DiduiAreaDeductionProResponse diduiAreaDeductionProWithOptions(DiduiAreaDeductionProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ragId)) {
            query.put("RagId", request.ragId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiduiAreaDeductionPro"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiduiAreaDeductionProResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Scenarios</em>*</p>
     * <ul>
     * <li>Floor display area evaluation: Infers the area of the bounding rectangle based on the overall photo of the floor display and the actual dimensions of the products.</li>
     * <li>Multi-SKU mixed layout analysis: Uses the dimensions of different products to infer the side lengths.</li>
     * <li>Area result review: Verifies the results by combining the original image, product assets, and the returned side lengths and area.
     * <strong>Features</strong></li>
     * <li>SKU asset-driven: Specifies the asset knowledge base by using ragId. Each participating product must have a name, positive length, width, and height, and at least one HTTPS reference image.</li>
     * <li>Phased area inference: Sequentially forms decision edges, SKU projections, dimension accumulation, and the final area.</li>
     * <li>Unified units: SKU asset dimensions are stored in centimeters. The resulting side lengths are output in meters and the area in square meters.</li>
     * <li>Completeness and numerical validation: Returns a failure if assets are missing, no valid bounding boxes are found, or the area does not meet product consistency.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Analyzes the area of floor displays based on product recognition, SKU asset knowledge bases, and dedicated area reasoning model building. The product first locates products in the floor display, reads the actual dimensions and reference images of the corresponding SKUs, and infers the side lengths and area of the bounding rectangle of the floor display. This feature is suitable for evaluating the scale of floor displays in stores and for inspection and review.</p>
     * 
     * @param request DiduiAreaDeductionProRequest
     * @return DiduiAreaDeductionProResponse
     */
    public DiduiAreaDeductionProResponse diduiAreaDeductionPro(DiduiAreaDeductionProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.diduiAreaDeductionProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>Designed specifically for document translation, this feature supports translation across more than 400 language pairs (including bridged pairs) and meets the needs of multi-scenario, multi-page, and high-complexity document translation. Scanned documents are not currently supported.
     * It excels in the following aspects:</p>
     * <ul>
     * <li>Content accuracy: Ensures translation accuracy and the accuracy of parameters and units.</li>
     * <li>Structural integrity: Maintains overall layout continuity and restores page margins and layouts.</li>
     * </ul>
     * <h2>Scenarios</h2>
     * <p>Cross-border e-commerce product manuals, contracts, agreements, business proposals, qualification documents, teaching materials, and courseware.</p>
     * <h2>Features</h2>
     * <ul>
     * <li>Supports PDF and Word formats, and supports source documents containing multiple languages. For the detailed language list, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.</li>
     * <li>Supports the translation of text in images within documents, as well as complex translation scenarios such as other charts and special symbols.</li>
     * <li>Supports highly restored layout after translation.</li>
     * <li>Supports up to 100 pages for a single PDF file and up to 100 pages for a single Word file.</li>
     * <li>Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-null value). This is commonly used in scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API operation, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you have more requirements, contact the platform for processing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates documents across more than 400 language pairs, including bridged pairs, to meet the needs of multi-scenario, multi-page, and high-complexity document translation. Scanned documents are not currently supported. This feature excels in the following aspects: - Content accuracy: Ensures translation accuracy and the accuracy of parameters and units. - Structural integrity: Maintains overall layout continuity and restores page margins and layouts.</p>
     * 
     * @param request DocumentTranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DocumentTranslateResponse
     */
    public DocumentTranslateResponse documentTranslateWithOptions(DocumentTranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DocumentTranslate"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DocumentTranslateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>Designed specifically for document translation, this feature supports translation across more than 400 language pairs (including bridged pairs) and meets the needs of multi-scenario, multi-page, and high-complexity document translation. Scanned documents are not currently supported.
     * It excels in the following aspects:</p>
     * <ul>
     * <li>Content accuracy: Ensures translation accuracy and the accuracy of parameters and units.</li>
     * <li>Structural integrity: Maintains overall layout continuity and restores page margins and layouts.</li>
     * </ul>
     * <h2>Scenarios</h2>
     * <p>Cross-border e-commerce product manuals, contracts, agreements, business proposals, qualification documents, teaching materials, and courseware.</p>
     * <h2>Features</h2>
     * <ul>
     * <li>Supports PDF and Word formats, and supports source documents containing multiple languages. For the detailed language list, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.</li>
     * <li>Supports the translation of text in images within documents, as well as complex translation scenarios such as other charts and special symbols.</li>
     * <li>Supports highly restored layout after translation.</li>
     * <li>Supports up to 100 pages for a single PDF file and up to 100 pages for a single Word file.</li>
     * <li>Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-null value). This is commonly used in scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API operation, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you have more requirements, contact the platform for processing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates documents across more than 400 language pairs, including bridged pairs, to meet the needs of multi-scenario, multi-page, and high-complexity document translation. Scanned documents are not currently supported. This feature excels in the following aspects: - Content accuracy: Ensures translation accuracy and the accuracy of parameters and units. - Structural integrity: Maintains overall layout continuity and restores page margins and layouts.</p>
     * 
     * @param request DocumentTranslateRequest
     * @return DocumentTranslateResponse
     */
    public DocumentTranslateResponse documentTranslate(DocumentTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.documentTranslateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><strong>Product introduction</strong></h2>
     * <p>E-commerce video replication is an AI video service designed for product content production, covering video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion expression, and scaled production. It supports targeted replacement of products or persons based on viral video templates. By preserving the original actions, camera pacing, and marketing structure, it rapidly generates multiple content versions to reduce shooting, editing, and adaptation costs.</p>
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><strong>Video material replication:</strong> Uses an existing e-commerce video as a template and replaces only the specified product or person in the video, preserving the original camera work, pacing, and marketing expression as much as possible. This is suitable for producing materials with multiple SKUs, models, regions, and versions.</li>
     * <li><strong>Rapid material generation for new products:</strong> For newly launched products, it reduces the need for live-action shooting, studio setup, post-production editing, and repetitive production. It rapidly deploys video materials for new products, helping merchants shorten the launch cycle from spotting a viral video to breaking down the script and shooting new content.</li>
     * <li><strong>Product explanation and selling point expression:</strong> Suitable for products such as apparel, beauty and personal care, food and beverage, home and daily necessities, consumer electronics, and small home appliances. It can replicate the explanation structure, demonstration actions, and camera pacing based on the selling points of the original video to generate explanation videos tailored for the conversion of new products.</li>
     * <li><strong>Multi-selling point and multi-version testing:</strong> Rapidly generates multiple versions based on different product selling points, target audiences, scripts, camera work, and visual styles, supporting merchants in conducting content testing and iterating on advertising materials.</li>
     * </ul>
     * <h2><strong>Service capabilities</strong></h2>
     * <h3><strong>Core capabilities</strong></h3>
     * <ul>
     * <li><p><strong>Supports two replacement modes:</strong></p>
     * <ul>
     * <li><p><strong>Product replacement (</strong><code>product_replacement</code><strong>)</strong>: Preserves the identity, actions, scene, and sales structure of the original video host, and replaces the original product with the target product.</p>
     * </li>
     * <li><p><strong>Person replacement (</strong><code>person_replacement</code><strong>)</strong>: Preserves the product, actions, scene, and sales structure of the original video, and replaces the person on camera with the target person from reference images or descriptions.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Supports two generation modes:</strong></p>
     * <ul>
     * <li><p><strong>Reference generation (</strong><code>reference</code><strong>)</strong>: 1:1 replication. Uses the original video as a complete reference to automatically generate a new video with the same duration. It preserves the original script, storyboard, actions, scene, and pacing, and only performs targeted replacement of specified content such as persons or products.</p>
     * </li>
     * <li><p><strong>Rebuild generation (</strong><code>rebuild</code><strong>)</strong>: Breaks down the script, storyboard, and key elements of the original video, retains only core content such as specified persons or products, and then redesigns and generates a new video. It is not limited by the duration of the original video and supports inputting a target duration.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Fully automated end-to-end generation with zero prompt engineering threshold</strong>: Only requires the reference video and target product or person images. The system automatically completes the entire process of video understanding, script planning, storyboard design, first-frame generation, and video synthesis.</p>
     * </li>
     * <li><p><strong>Product understanding and information structuring</strong>: Identifies product categories, appearance, materials, colors, structures, and key components, and combines them with the titles, attributes, and selling points provided by merchants to generate usable video expression information.</p>
     * </li>
     * <li><p><strong>Template video element replacement</strong>: Supports replacing products or persons within the authorized scope, and defines the replacement scope and protection scope to minimize changes in non-target areas.</p>
     * </li>
     * <li><p><strong>Product subject consistency</strong>: Maintains the stability of the product\&quot;s shape, color, texture, pattern, packaging, and logo across different camera shots, angles, actions, and scenes as much as possible.</p>
     * </li>
     * <li><p><strong>Product fidelity</strong>: Multi-round VL quality inspection locks the product state (color, texture, structure, print) throughout the process to prevent product feature drift.</p>
     * </li>
     * <li><p><strong>Selling point script and storyboard replication</strong>: Replicates the selling point planning, video structure, camera shot sequence, demonstration actions, voiceover content, and ending style based on the original video.</p>
     * </li>
     * <li><p><strong>Commercial model adaptation</strong>: Supports matching corresponding model images and demonstration methods based on product style, fit, target audience, and market demand.</p>
     * </li>
     * <li><p><strong>Quality verification and result feedback</strong>: Performs multi-dimensional checks on the product subject, person, apparel, text, image integrity, audio, and overall usability, and outputs result information for manual review.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>E-commerce video replication is an AI video service designed for product content production, covering video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion expression, and scaled production. It supports targeted replacement of products or persons based on viral video templates. By preserving the original actions, camera pacing, and marketing structure, it rapidly generates multiple content versions to reduce shooting, editing, and adaptation costs.</p>
     * 
     * @param tmpReq EcomVideoRecreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EcomVideoRecreationResponse
     */
    public EcomVideoRecreationResponse ecomVideoRecreationWithOptions(EcomVideoRecreationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EcomVideoRecreationShrinkRequest request = new EcomVideoRecreationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.output)) {
            request.outputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.output, "Output", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputShrink)) {
            query.put("Output", request.outputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EcomVideoRecreation"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EcomVideoRecreationResponse());
    }

    /**
     * <b>description</b> :
     * <h2><strong>Product introduction</strong></h2>
     * <p>E-commerce video replication is an AI video service designed for product content production, covering video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion expression, and scaled production. It supports targeted replacement of products or persons based on viral video templates. By preserving the original actions, camera pacing, and marketing structure, it rapidly generates multiple content versions to reduce shooting, editing, and adaptation costs.</p>
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><strong>Video material replication:</strong> Uses an existing e-commerce video as a template and replaces only the specified product or person in the video, preserving the original camera work, pacing, and marketing expression as much as possible. This is suitable for producing materials with multiple SKUs, models, regions, and versions.</li>
     * <li><strong>Rapid material generation for new products:</strong> For newly launched products, it reduces the need for live-action shooting, studio setup, post-production editing, and repetitive production. It rapidly deploys video materials for new products, helping merchants shorten the launch cycle from spotting a viral video to breaking down the script and shooting new content.</li>
     * <li><strong>Product explanation and selling point expression:</strong> Suitable for products such as apparel, beauty and personal care, food and beverage, home and daily necessities, consumer electronics, and small home appliances. It can replicate the explanation structure, demonstration actions, and camera pacing based on the selling points of the original video to generate explanation videos tailored for the conversion of new products.</li>
     * <li><strong>Multi-selling point and multi-version testing:</strong> Rapidly generates multiple versions based on different product selling points, target audiences, scripts, camera work, and visual styles, supporting merchants in conducting content testing and iterating on advertising materials.</li>
     * </ul>
     * <h2><strong>Service capabilities</strong></h2>
     * <h3><strong>Core capabilities</strong></h3>
     * <ul>
     * <li><p><strong>Supports two replacement modes:</strong></p>
     * <ul>
     * <li><p><strong>Product replacement (</strong><code>product_replacement</code><strong>)</strong>: Preserves the identity, actions, scene, and sales structure of the original video host, and replaces the original product with the target product.</p>
     * </li>
     * <li><p><strong>Person replacement (</strong><code>person_replacement</code><strong>)</strong>: Preserves the product, actions, scene, and sales structure of the original video, and replaces the person on camera with the target person from reference images or descriptions.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Supports two generation modes:</strong></p>
     * <ul>
     * <li><p><strong>Reference generation (</strong><code>reference</code><strong>)</strong>: 1:1 replication. Uses the original video as a complete reference to automatically generate a new video with the same duration. It preserves the original script, storyboard, actions, scene, and pacing, and only performs targeted replacement of specified content such as persons or products.</p>
     * </li>
     * <li><p><strong>Rebuild generation (</strong><code>rebuild</code><strong>)</strong>: Breaks down the script, storyboard, and key elements of the original video, retains only core content such as specified persons or products, and then redesigns and generates a new video. It is not limited by the duration of the original video and supports inputting a target duration.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Fully automated end-to-end generation with zero prompt engineering threshold</strong>: Only requires the reference video and target product or person images. The system automatically completes the entire process of video understanding, script planning, storyboard design, first-frame generation, and video synthesis.</p>
     * </li>
     * <li><p><strong>Product understanding and information structuring</strong>: Identifies product categories, appearance, materials, colors, structures, and key components, and combines them with the titles, attributes, and selling points provided by merchants to generate usable video expression information.</p>
     * </li>
     * <li><p><strong>Template video element replacement</strong>: Supports replacing products or persons within the authorized scope, and defines the replacement scope and protection scope to minimize changes in non-target areas.</p>
     * </li>
     * <li><p><strong>Product subject consistency</strong>: Maintains the stability of the product\&quot;s shape, color, texture, pattern, packaging, and logo across different camera shots, angles, actions, and scenes as much as possible.</p>
     * </li>
     * <li><p><strong>Product fidelity</strong>: Multi-round VL quality inspection locks the product state (color, texture, structure, print) throughout the process to prevent product feature drift.</p>
     * </li>
     * <li><p><strong>Selling point script and storyboard replication</strong>: Replicates the selling point planning, video structure, camera shot sequence, demonstration actions, voiceover content, and ending style based on the original video.</p>
     * </li>
     * <li><p><strong>Commercial model adaptation</strong>: Supports matching corresponding model images and demonstration methods based on product style, fit, target audience, and market demand.</p>
     * </li>
     * <li><p><strong>Quality verification and result feedback</strong>: Performs multi-dimensional checks on the product subject, person, apparel, text, image integrity, audio, and overall usability, and outputs result information for manual review.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>E-commerce video replication is an AI video service designed for product content production, covering video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion expression, and scaled production. It supports targeted replacement of products or persons based on viral video templates. By preserving the original actions, camera pacing, and marketing structure, it rapidly generates multiple content versions to reduce shooting, editing, and adaptation costs.</p>
     * 
     * @param request EcomVideoRecreationRequest
     * @return EcomVideoRecreationResponse
     */
    public EcomVideoRecreationResponse ecomVideoRecreation(EcomVideoRecreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ecomVideoRecreationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Scenarios</em>*</p>
     * <ol>
     * <li>Inspection photo review: Screens store-submitted photos for recapture risks.</li>
     * <li>Screen or printed photo recapture verification: Localizes visible screens, printed photos, and other media.</li>
     * <li>Review clue display: Annotates products and visible clues on the original image to assist in manual review.
     * <strong>Features</strong></li>
     * <li>General recapture detection: Outputs a Boolean result for isFake.</li>
     * <li>Review element localization: Distinguishes physical products, screens, printed photos, and visible recapture clues. Products inside screens are not repeatedly output as physical products.</li>
     * <li>Separate presentation of clues and conclusions: Localization text only describes visible phenomena and does not directly use normal reflections or standard packaging prints as recapture evidence.
     * Supports a single HTTPS image input. The supplementary localization returns up to 12 targets. Each target includes a category, a bounding box, and visible text of up to 24 characters. The coverage field indicates whether the localization is complete.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Detects whether an image is recaptured and localizes main physical products, screen display areas, printed photos, and visible recapture clues based on recapture recognition and multimodal large model element localization. It is suitable for risk screening and manual review of store inspection photos across multiple categories.</p>
     * 
     * @param request GeneralRephotographyDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GeneralRephotographyDetectionResponse
     */
    public GeneralRephotographyDetectionResponse generalRephotographyDetectionWithOptions(GeneralRephotographyDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GeneralRephotographyDetection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GeneralRephotographyDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Scenarios</em>*</p>
     * <ol>
     * <li>Inspection photo review: Screens store-submitted photos for recapture risks.</li>
     * <li>Screen or printed photo recapture verification: Localizes visible screens, printed photos, and other media.</li>
     * <li>Review clue display: Annotates products and visible clues on the original image to assist in manual review.
     * <strong>Features</strong></li>
     * <li>General recapture detection: Outputs a Boolean result for isFake.</li>
     * <li>Review element localization: Distinguishes physical products, screens, printed photos, and visible recapture clues. Products inside screens are not repeatedly output as physical products.</li>
     * <li>Separate presentation of clues and conclusions: Localization text only describes visible phenomena and does not directly use normal reflections or standard packaging prints as recapture evidence.
     * Supports a single HTTPS image input. The supplementary localization returns up to 12 targets. Each target includes a category, a bounding box, and visible text of up to 24 characters. The coverage field indicates whether the localization is complete.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Detects whether an image is recaptured and localizes main physical products, screen display areas, printed photos, and visible recapture clues based on recapture recognition and multimodal large model element localization. It is suitable for risk screening and manual review of store inspection photos across multiple categories.</p>
     * 
     * @param request GeneralRephotographyDetectionRequest
     * @return GeneralRephotographyDetectionResponse
     */
    public GeneralRephotographyDetectionResponse generalRephotographyDetection(GeneralRephotographyDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generalRephotographyDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Product introduction</h1>
     * <p>Generates or rewrites e-commerce product copy, including titles, short highlights, search keywords, bullet points, and product descriptions, based on product information or existing copy. Adapts the content type and length to the requirements of the target platform.
     * Supports Chinese and English input materials and optional multilingual translation, making it suitable for domestic product listing, cross-border product distribution, and product copy localization. Uses synchronous calls and processes one copy type for one product per request.</p>
     * <h1>Scenarios</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Scenario</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Same-platform localization</td>
     * <td>Select rewrite to translate as needed while retaining the original facts and structural type.</td>
     * </tr>
     * <tr>
     * <td>Cross-platform content adaptation</td>
     * <td>Select the target platform to generate or rewrite content according to its configuration limits. The source platform of the input is not required.</td>
     * </tr>
     * <tr>
     * <td>New product material creation</td>
     * <td>Select generate to create the target content type based on product information. Categories and attributes can be used to supplement facts.</td>
     * </tr>
     * <tr>
     * <td>Batch operation tool integration</td>
     * <td>The caller submits requests product by product. The workflow itself does not provide batch task or queuing APIs.</td>
     * </tr>
     * </tbody></table>
     * <h1>Features</h1>
     * <h2>Core capabilities</h2>
     * <p>This capability supports the creation of various copy content types for domestic and cross-border e-commerce scenarios. It can generate titles, detailed descriptions, keywords, highlights, and descriptions that comply with the content rules (such as length requirements and writing styles) of different platforms, and supports cross-language creation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Content type</th>
     * <th>Platform</th>
     * <th></th>
     * <th></th>
     * <th></th>
     * <th></th>
     * <th></th>
     * <th>Target language</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Amazon</td>
     * <td>Temu</td>
     * <td>TikTok</td>
     * <td>Shopify</td>
     * <td>Wildberries</td>
     * <td>Tmall</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>title</strong></td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>Covers languages in popular regions:</td>
     * </tr>
     * <tr>
     * <td>Chinese (zh), English (en), Russian (ru), German (de), French (fr), Korean (ko), Italian (it), Thai (th), Arabic (ar), Turkish (tr), Hebrew (he), Ukrainian (uk), Polish (pl), Japanese (ja), Dutch (nl), Portuguese (pt), Spanish (es), Malay (ms), Bulgarian (bg), Indonesian (id), and Vietnamese (vi).</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>highlight</strong></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td>✓</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>bulletPoint</strong></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>keywords</strong></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>description</strong></td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Based on the different content inputs provided by users, two production modes are supported:</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>Mode</strong></td>
     * <td><strong>Description</strong></td>
     * <td><strong>Recommended scenario</strong></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>---</td>
     * <td>---</td>
     * <td>---</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Generate</td>
     * <td>Reorganizes and writes copy based on product information.</td>
     * <td>You have only product parameters, attributes, or selling points, or other types of product information, and need to create new titles, keywords, product descriptions, or other copy.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Rewrite</td>
     * <td>Retains the original information and main structure while optimizing the expression.</td>
     * <td>You have existing product copy and want to adjust the wording, improve readability, or localize it with translation.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h1>Examples</h1>
     * <p>The following examples use the Amazon platform:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Content type</strong></th>
     * <th><strong>Source language</strong></th>
     * <th><strong>Source content</strong></th>
     * <th><strong>Target language</strong></th>
     * <th><strong>Generated result</strong></th>
     * <th><strong>Capability advantage</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>bulletPoint</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>[Vielseitiges Harz-Filtersystem\] Silikontrichter und Metallfiltergitter für 3D-Druck; Einfüllen von gebrauchtem lichtempfindlichem Harz in Flaschen mit 15 mm Halsweite</td>
     * <td>Extracts core selling points, retains key information such as bottle neck size, and presents them in German bullet points for quick reading.</td>
     * </tr>
     * <tr>
     * <td>description</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>[Vielseitiges Harz-Filtrationssystem\] Diese Kombination aus Silikontrichter und Metallfilternetz richtet sich an alle, die mit 3D-Druck arbeiten. Der flexible Silikontrichter passt sicher auf Standardflaschen mit einer Halsweite von 15 mm und ermöglicht ein sauberes Zurückfüllen von gebrauchtem lichtempfindlichem Harz ohne Kleckern. Das feine Metallfilter fängt verfestigte Partikel zuverlässig ab, sodass Ihr Harz frei von Verunreinigungen bleibt und seine Nutzbarkeit erhalten wird. Die robuste Konstruktion des Filters unterstützt eine gleichmäßige Durchflussrate beim Umfüllen.</td>
     * <td>Organizes the product purpose, usage, and filtration features into a coherent German introduction for easy understanding.</td>
     * </tr>
     * <tr>
     * <td>highlight</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>[Vielseitiges Harz-Filtrationssystem\] Silikontrichter, Metallfilternetz, für 3D-Druck-Harz</td>
     * <td>Condenses lengthy materials to highlight core components and purposes, making it easy to grasp product features at a glance.</td>
     * </tr>
     * <tr>
     * <td>keywords</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>Silikontrichter Metallfilter Harz Filterungssystem 3D Drucker Harz umfüllen Metall Sieb für Photosensitive Harze</td>
     * <td>Extracts German search terms related to materials, categories, and purposes, reducing manual organization and translation efforts.</td>
     * </tr>
     * <tr>
     * <td>title</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>Silikontrichter mit Metallfilter für 3D-Druck-Harz</td>
     * <td>Extracts the product name, core components, and purpose to generate a concise and clear German title.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates or rewrites e-commerce product copy, including titles, short highlights, search keywords, bullet points, and product descriptions, based on product information or existing copy. Adapts the content type and length to the requirements of the target platform. Supports Chinese and English input materials and optional multilingual translation, making it suitable for domestic product listing, cross-border product distribution, and product copy localization. Uses synchronous calls and processes one copy type for one product per request.</p>
     * 
     * @param request GenerateProductContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateProductContentResponse
     */
    public GenerateProductContentResponse generateProductContentWithOptions(GenerateProductContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bulletPointCount)) {
            query.put("BulletPointCount", request.bulletPointCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTranslation)) {
            query.put("EnableTranslation", request.enableTranslation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxLength)) {
            query.put("MaxLength", request.maxLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minLength)) {
            query.put("MinLength", request.minLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productAttributes)) {
            query.put("ProductAttributes", request.productAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCategory)) {
            query.put("ProductCategory", request.productCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            query.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateProductContent"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateProductContentResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Product introduction</h1>
     * <p>Generates or rewrites e-commerce product copy, including titles, short highlights, search keywords, bullet points, and product descriptions, based on product information or existing copy. Adapts the content type and length to the requirements of the target platform.
     * Supports Chinese and English input materials and optional multilingual translation, making it suitable for domestic product listing, cross-border product distribution, and product copy localization. Uses synchronous calls and processes one copy type for one product per request.</p>
     * <h1>Scenarios</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Scenario</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Same-platform localization</td>
     * <td>Select rewrite to translate as needed while retaining the original facts and structural type.</td>
     * </tr>
     * <tr>
     * <td>Cross-platform content adaptation</td>
     * <td>Select the target platform to generate or rewrite content according to its configuration limits. The source platform of the input is not required.</td>
     * </tr>
     * <tr>
     * <td>New product material creation</td>
     * <td>Select generate to create the target content type based on product information. Categories and attributes can be used to supplement facts.</td>
     * </tr>
     * <tr>
     * <td>Batch operation tool integration</td>
     * <td>The caller submits requests product by product. The workflow itself does not provide batch task or queuing APIs.</td>
     * </tr>
     * </tbody></table>
     * <h1>Features</h1>
     * <h2>Core capabilities</h2>
     * <p>This capability supports the creation of various copy content types for domestic and cross-border e-commerce scenarios. It can generate titles, detailed descriptions, keywords, highlights, and descriptions that comply with the content rules (such as length requirements and writing styles) of different platforms, and supports cross-language creation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Content type</th>
     * <th>Platform</th>
     * <th></th>
     * <th></th>
     * <th></th>
     * <th></th>
     * <th></th>
     * <th>Target language</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Amazon</td>
     * <td>Temu</td>
     * <td>TikTok</td>
     * <td>Shopify</td>
     * <td>Wildberries</td>
     * <td>Tmall</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>title</strong></td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>Covers languages in popular regions:</td>
     * </tr>
     * <tr>
     * <td>Chinese (zh), English (en), Russian (ru), German (de), French (fr), Korean (ko), Italian (it), Thai (th), Arabic (ar), Turkish (tr), Hebrew (he), Ukrainian (uk), Polish (pl), Japanese (ja), Dutch (nl), Portuguese (pt), Spanish (es), Malay (ms), Bulgarian (bg), Indonesian (id), and Vietnamese (vi).</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>highlight</strong></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td>✓</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>bulletPoint</strong></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>keywords</strong></td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>description</strong></td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td>✓</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Based on the different content inputs provided by users, two production modes are supported:</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><strong>Mode</strong></td>
     * <td><strong>Description</strong></td>
     * <td><strong>Recommended scenario</strong></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>---</td>
     * <td>---</td>
     * <td>---</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Generate</td>
     * <td>Reorganizes and writes copy based on product information.</td>
     * <td>You have only product parameters, attributes, or selling points, or other types of product information, and need to create new titles, keywords, product descriptions, or other copy.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Rewrite</td>
     * <td>Retains the original information and main structure while optimizing the expression.</td>
     * <td>You have existing product copy and want to adjust the wording, improve readability, or localize it with translation.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h1>Examples</h1>
     * <p>The following examples use the Amazon platform:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Content type</strong></th>
     * <th><strong>Source language</strong></th>
     * <th><strong>Source content</strong></th>
     * <th><strong>Target language</strong></th>
     * <th><strong>Generated result</strong></th>
     * <th><strong>Capability advantage</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>bulletPoint</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>[Vielseitiges Harz-Filtersystem\] Silikontrichter und Metallfiltergitter für 3D-Druck; Einfüllen von gebrauchtem lichtempfindlichem Harz in Flaschen mit 15 mm Halsweite</td>
     * <td>Extracts core selling points, retains key information such as bottle neck size, and presents them in German bullet points for quick reading.</td>
     * </tr>
     * <tr>
     * <td>description</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>[Vielseitiges Harz-Filtrationssystem\] Diese Kombination aus Silikontrichter und Metallfilternetz richtet sich an alle, die mit 3D-Druck arbeiten. Der flexible Silikontrichter passt sicher auf Standardflaschen mit einer Halsweite von 15 mm und ermöglicht ein sauberes Zurückfüllen von gebrauchtem lichtempfindlichem Harz ohne Kleckern. Das feine Metallfilter fängt verfestigte Partikel zuverlässig ab, sodass Ihr Harz frei von Verunreinigungen bleibt und seine Nutzbarkeit erhalten wird. Die robuste Konstruktion des Filters unterstützt eine gleichmäßige Durchflussrate beim Umfüllen.</td>
     * <td>Organizes the product purpose, usage, and filtration features into a coherent German introduction for easy understanding.</td>
     * </tr>
     * <tr>
     * <td>highlight</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>[Vielseitiges Harz-Filtrationssystem\] Silikontrichter, Metallfilternetz, für 3D-Druck-Harz</td>
     * <td>Condenses lengthy materials to highlight core components and purposes, making it easy to grasp product features at a glance.</td>
     * </tr>
     * <tr>
     * <td>keywords</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>Silikontrichter Metallfilter Harz Filterungssystem 3D Drucker Harz umfüllen Metall Sieb für Photosensitive Harze</td>
     * <td>Extracts German search terms related to materials, categories, and purposes, reducing manual organization and translation efforts.</td>
     * </tr>
     * <tr>
     * <td>title</td>
     * <td>en</td>
     * <td>[VERSATILE RESIN FILTRATION SYSTEM\] This silicone funnel and metal filter mesh combination is designed for all 3D printing enthusiasts. It is ideal for pouring used photosensitive resin back into standard bottles with a 15mm neck width ensuring a clean transfer every time. The durable metal filter effectively catches all solidified debris protecting your valuable resin from  and extending its usability.</td>
     * <td>de</td>
     * <td>Silikontrichter mit Metallfilter für 3D-Druck-Harz</td>
     * <td>Extracts the product name, core components, and purpose to generate a concise and clear German title.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates or rewrites e-commerce product copy, including titles, short highlights, search keywords, bullet points, and product descriptions, based on product information or existing copy. Adapts the content type and length to the requirements of the target platform. Supports Chinese and English input materials and optional multilingual translation, making it suitable for domestic product listing, cross-border product distribution, and product copy localization. Uses synchronous calls and processes one copy type for one product per request.</p>
     * 
     * @param request GenerateProductContentRequest
     * @return GenerateProductContentResponse
     */
    public GenerateProductContentResponse generateProductContent(GenerateProductContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateProductContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The image cropping service can resize input images to specified dimensions. It supports automatic identification of the main subject area and precisely crops images to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Multi-platform content distribution</strong>: Automatically generates content styles in various sizes to adapt to the different image size requirements of different platforms and scenarios.</p>
     * </li>
     * <li><p><strong>Content delivery</strong>: Automatically adjusts sizes for different ad slots on different platforms to highlight the main content, reduce blank space, and emphasize product features.</p>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><p>Automatically identifies the main subject area of an image for precise cropping.</p>
     * </li>
     * <li><p>Supports custom output sizes for cropping to adapt to different platforms and devices.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th>*<em>Cropped to 1000\<em>1000</em></em></th>
     * <th>*<em>Cropped to 3000\<em>2000</em></em></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/b356e8a7-cc18-41f7-8da5-dd25f48c6338.png" alt="done-image-5e6abdf1-3c64-48db-9301-a5a9db1f8cb1.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/969e0fb6-435c-47f9-aeb6-1624b5a43f3c.png" alt="a715a30a-b594-40db-9f7a-d620add9081c.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/cd6bbde6-e923-4fd1-b252-e5f299377fb8.png" alt="1e6569f3-a494-4e7c-94c8-439748992deb.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/6c4d02ea-c3bc-4865-9655-afc8c5f5c2ef.png" alt="done-image-0ff8edc4-5bd5-48ca-90ac-38e1701a4573.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/ac6b07f3-0dbf-48de-9fcc-f1450792f75f.png" alt="d026cfbc-207c-425b-b8c7-67cc7396c9c9.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/a3486b31-4cc3-4f23-b326-41ab0780a84e.png" alt="b9f62dd8-7379-45be-b130-eb534506e77a.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/a42cb77c-6f1c-4474-aeff-939f16d5f8dc.png" alt="done-image-8eade64e-c849-46f8-b2e3-29122e280e8c.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/62a89676-a424-4d2a-a174-72ed4ae107ed.png" alt="5d88645b-91b3-4e46-9ba4-5a16189d3ff8.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/ea22ead8-0eb8-4224-8f1e-319f64173912.png" alt="2afdf6cb-44ae-41f3-8d85-7416d2c8fc3c.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligently crops images to specified sizes by automatically identifying the main subject area and precisely cropping them to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
     * 
     * @param request ImageCroppingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageCroppingResponse
     */
    public ImageCroppingResponse imageCroppingWithOptions(ImageCroppingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHeight)) {
            query.put("TargetHeight", request.targetHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetWidth)) {
            query.put("TargetWidth", request.targetWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageCropping"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageCroppingResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The image cropping service can resize input images to specified dimensions. It supports automatic identification of the main subject area and precisely crops images to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Multi-platform content distribution</strong>: Automatically generates content styles in various sizes to adapt to the different image size requirements of different platforms and scenarios.</p>
     * </li>
     * <li><p><strong>Content delivery</strong>: Automatically adjusts sizes for different ad slots on different platforms to highlight the main content, reduce blank space, and emphasize product features.</p>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><p>Automatically identifies the main subject area of an image for precise cropping.</p>
     * </li>
     * <li><p>Supports custom output sizes for cropping to adapt to different platforms and devices.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th>*<em>Cropped to 1000\<em>1000</em></em></th>
     * <th>*<em>Cropped to 3000\<em>2000</em></em></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/b356e8a7-cc18-41f7-8da5-dd25f48c6338.png" alt="done-image-5e6abdf1-3c64-48db-9301-a5a9db1f8cb1.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/969e0fb6-435c-47f9-aeb6-1624b5a43f3c.png" alt="a715a30a-b594-40db-9f7a-d620add9081c.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/cd6bbde6-e923-4fd1-b252-e5f299377fb8.png" alt="1e6569f3-a494-4e7c-94c8-439748992deb.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/6c4d02ea-c3bc-4865-9655-afc8c5f5c2ef.png" alt="done-image-0ff8edc4-5bd5-48ca-90ac-38e1701a4573.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/ac6b07f3-0dbf-48de-9fcc-f1450792f75f.png" alt="d026cfbc-207c-425b-b8c7-67cc7396c9c9.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/a3486b31-4cc3-4f23-b326-41ab0780a84e.png" alt="b9f62dd8-7379-45be-b130-eb534506e77a.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/a42cb77c-6f1c-4474-aeff-939f16d5f8dc.png" alt="done-image-8eade64e-c849-46f8-b2e3-29122e280e8c.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/62a89676-a424-4d2a-a174-72ed4ae107ed.png" alt="5d88645b-91b3-4e46-9ba4-5a16189d3ff8.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/eYVOL5jBbQ7QJlpz/img/ea22ead8-0eb8-4224-8f1e-319f64173912.png" alt="2afdf6cb-44ae-41f3-8d85-7416d2c8fc3c.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligently crops images to specified sizes by automatically identifying the main subject area and precisely cropping them to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
     * 
     * @param request ImageCroppingRequest
     * @return ImageCroppingResponse
     */
    public ImageCroppingResponse imageCropping(ImageCroppingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageCroppingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The intelligent image matting feature automatically identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. It also provides multiple background options and custom size options to optimize product display effects. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Support secondary editing of materials</strong>: After separating the image subject from the background, you can further edit the image.</p>
     * </li>
     * <li><p><strong>Improve material processing efficiency</strong>: Quickly extract the subjects from various material images to facilitate background replacement, thereby improving the production efficiency of advertising images and marketing posters.</p>
     * </li>
     * </ul>
     * <h2>Features.</h2>
     * <h4>1. One-click accurate subject identification</h4>
     * <ul>
     * <li><p><strong>Automatic AI identification</strong>: Based on deep learning models, it intelligently distinguishes foreground subjects (such as portraits, products, and objects) from the background without manual outlining.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports accurate segmentation in complex scenarios (such as hair, transparent objects, and fur edges) with an accuracy rate of over 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization on edge jaggies and semi-transparent areas (such as smoke and glass) to retain natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, adapting to e-commerce and design scenarios.</p>
     * </li>
     * <li><p><strong>Custom background color support</strong>: Supports custom background colors.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image (input)</strong></th>
     * <th><strong>Result image (output)</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/62b39e16-5b30-469f-88cd-7f31ba790008.jpeg" alt="Main image 3.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/bfad041f-a8e0-4d6f-a2bf-999292ea9ebc.jpeg" alt="ae4cd8ce912c4d9fa171dc5217be576d_202605251928_0.5899999737739563.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/b201b356-24b8-4f98-babc-c7fe918bdc37.jpeg" alt="Main image 2.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/8b266603-e80a-42dd-9d3d-6fa9f0948e52.jpeg" alt="52033655bd054737960a87518655d935_202605251926_5.959999978542328.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/d3c0d876-42a0-4294-8ce5-2a20df2deab9.jpeg" alt="Main image 6.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/5677f55e-4fe3-4978-a676-1ce71ad604b0.jpeg" alt="abdecd31cc45450f83b33f9baf4499c6_202605251930_7.9700000286102295.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. This feature also provides multiple background options and custom size options to optimize product display effects. (Synchronous)</p>
     * 
     * @param request ImageMattingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageMattingResponse
     */
    public ImageMattingResponse imageMattingWithOptions(ImageMattingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backGroundType)) {
            query.put("BackGroundType", request.backGroundType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgColor)) {
            query.put("BgColor", request.bgColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHeight)) {
            query.put("TargetHeight", request.targetHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetWidth)) {
            query.put("TargetWidth", request.targetWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageMatting"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageMattingResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The intelligent image matting feature automatically identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. It also provides multiple background options and custom size options to optimize product display effects. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Support secondary editing of materials</strong>: After separating the image subject from the background, you can further edit the image.</p>
     * </li>
     * <li><p><strong>Improve material processing efficiency</strong>: Quickly extract the subjects from various material images to facilitate background replacement, thereby improving the production efficiency of advertising images and marketing posters.</p>
     * </li>
     * </ul>
     * <h2>Features.</h2>
     * <h4>1. One-click accurate subject identification</h4>
     * <ul>
     * <li><p><strong>Automatic AI identification</strong>: Based on deep learning models, it intelligently distinguishes foreground subjects (such as portraits, products, and objects) from the background without manual outlining.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports accurate segmentation in complex scenarios (such as hair, transparent objects, and fur edges) with an accuracy rate of over 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization on edge jaggies and semi-transparent areas (such as smoke and glass) to retain natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, adapting to e-commerce and design scenarios.</p>
     * </li>
     * <li><p><strong>Custom background color support</strong>: Supports custom background colors.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image (input)</strong></th>
     * <th><strong>Result image (output)</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/62b39e16-5b30-469f-88cd-7f31ba790008.jpeg" alt="Main image 3.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/bfad041f-a8e0-4d6f-a2bf-999292ea9ebc.jpeg" alt="ae4cd8ce912c4d9fa171dc5217be576d_202605251928_0.5899999737739563.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/b201b356-24b8-4f98-babc-c7fe918bdc37.jpeg" alt="Main image 2.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/8b266603-e80a-42dd-9d3d-6fa9f0948e52.jpeg" alt="52033655bd054737960a87518655d935_202605251926_5.959999978542328.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/d3c0d876-42a0-4294-8ce5-2a20df2deab9.jpeg" alt="Main image 6.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/5677f55e-4fe3-4978-a676-1ce71ad604b0.jpeg" alt="abdecd31cc45450f83b33f9baf4499c6_202605251930_7.9700000286102295.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. This feature also provides multiple background options and custom size options to optimize product display effects. (Synchronous)</p>
     * 
     * @param request ImageMattingRequest
     * @return ImageMattingResponse
     */
    public ImageMattingResponse imageMatting(ImageMattingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageMattingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <ul>
     * <li><p>Supports secondary editing of materials: After separating the image subject from the background, you can further edit the image.</p>
     * </li>
     * <li><p>Improves material processing efficiency: Quickly extracts the subjects of various material images to facilitate background replacement, thereby improving the production efficiency of advertising images and marketing posters.</p>
     * </li>
     * </ul>
     * <h1>Features.</h1>
     * <h4>1. One-click precise subject recognition</h4>
     * <ul>
     * <li><p><strong>AI-based automatic recognition</strong>: Based on deep learning models, intelligently distinguishes foreground subjects (portraits, products, objects, etc.) from the background without manual outlining.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports precise segmentation in complex scenarios (such as hair, transparent objects, and fur edges) with an accuracy rate of over 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization on edge jaggies and semi-transparent areas (such as smoke and glass) to retain natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, adapting to e-commerce and design scenarios.</p>
     * </li>
     * <li><p><strong>Supports custom background colors</strong></p>
     * </li>
     * </ul>
     * <h1>Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image (input)</strong></th>
     * <th><strong>Result image (output)</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/62b39e16-5b30-469f-88cd-7f31ba790008.jpeg" alt="Main image 3.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/bfad041f-a8e0-4d6f-a2bf-999292ea9ebc.jpeg" alt="ae4cd8ce912c4d9fa171dc5217be576d_202605251928_0.5899999737739563.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/b201b356-24b8-4f98-babc-c7fe918bdc37.jpeg" alt="Main image 2.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/8b266603-e80a-42dd-9d3d-6fa9f0948e52.jpeg" alt="52033655bd054737960a87518655d935_202605251926_5.959999978542328.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/d3c0d876-42a0-4294-8ce5-2a20df2deab9.jpeg" alt="Main image 6.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/5677f55e-4fe3-4978-a676-1ce71ad604b0.jpeg" alt="abdecd31cc45450f83b33f9baf4499c6_202605251930_7.9700000286102295.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Extracts the salient subject from an image by automatically identifying and separating it from the background, and returns the subject image with the background removed. This operation also provides multiple background options and custom size selections to optimize product display.</p>
     * 
     * @param request ImageMattingAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageMattingAsyncResponse
     */
    public ImageMattingAsyncResponse imageMattingAsyncWithOptions(ImageMattingAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backGroundType)) {
            query.put("BackGroundType", request.backGroundType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgColor)) {
            query.put("BgColor", request.bgColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHeight)) {
            query.put("TargetHeight", request.targetHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetWidth)) {
            query.put("TargetWidth", request.targetWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageMattingAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageMattingAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <ul>
     * <li><p>Supports secondary editing of materials: After separating the image subject from the background, you can further edit the image.</p>
     * </li>
     * <li><p>Improves material processing efficiency: Quickly extracts the subjects of various material images to facilitate background replacement, thereby improving the production efficiency of advertising images and marketing posters.</p>
     * </li>
     * </ul>
     * <h1>Features.</h1>
     * <h4>1. One-click precise subject recognition</h4>
     * <ul>
     * <li><p><strong>AI-based automatic recognition</strong>: Based on deep learning models, intelligently distinguishes foreground subjects (portraits, products, objects, etc.) from the background without manual outlining.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports precise segmentation in complex scenarios (such as hair, transparent objects, and fur edges) with an accuracy rate of over 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization on edge jaggies and semi-transparent areas (such as smoke and glass) to retain natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, adapting to e-commerce and design scenarios.</p>
     * </li>
     * <li><p><strong>Supports custom background colors</strong></p>
     * </li>
     * </ul>
     * <h1>Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image (input)</strong></th>
     * <th><strong>Result image (output)</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/62b39e16-5b30-469f-88cd-7f31ba790008.jpeg" alt="Main image 3.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/bfad041f-a8e0-4d6f-a2bf-999292ea9ebc.jpeg" alt="ae4cd8ce912c4d9fa171dc5217be576d_202605251928_0.5899999737739563.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/b201b356-24b8-4f98-babc-c7fe918bdc37.jpeg" alt="Main image 2.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/8b266603-e80a-42dd-9d3d-6fa9f0948e52.jpeg" alt="52033655bd054737960a87518655d935_202605251926_5.959999978542328.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/d3c0d876-42a0-4294-8ce5-2a20df2deab9.jpeg" alt="Main image 6.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/5677f55e-4fe3-4978-a676-1ce71ad604b0.jpeg" alt="abdecd31cc45450f83b33f9baf4499c6_202605251930_7.9700000286102295.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Extracts the salient subject from an image by automatically identifying and separating it from the background, and returns the subject image with the background removed. This operation also provides multiple background options and custom size selections to optimize product display.</p>
     * 
     * @param request ImageMattingAsyncRequest
     * @return ImageMattingAsyncResponse
     */
    public ImageMattingAsyncResponse imageMattingAsync(ImageMattingAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageMattingAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>The intelligent element recognition API is designed specifically for recognizing specific elements in e-commerce images. It deeply analyzes image details to help users quickly identify elements such as text, logos, watermarks, and text-containing color blocks in the main subject and background of an image, greatly improving the efficiency and accuracy of image filtering. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <p><strong>1. Intelligent image filtering and optimization:</strong>
     * Merchants and platforms can use the intelligent element recognition API to filter images and automatically identify images containing specific elements such as watermarks and logos. After filtering, you can further call the intelligent elimination API to optimize these images, improve image quality, and shorten the product release cycle.
     * <strong>2. Automated image processing and efficiency improvement:</strong>
     * Through the intelligent element recognition API, merchants and platforms can automate the image processing workflow to automatically identify and mark image elements that need optimization. This workflow reduces manual intervention and improves image processing efficiency.</p>
     * <h2>Features</h2>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, see the relevant examples in the elimination documentation (reserved text link).</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The rest of the image other than the product subject.</p>
     * </li>
     * <li><p>Text: Horizontal, vertical, or slanted English or Chinese text.</p>
     * </li>
     * <li><p>Logo: Logos or trademarks.</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, logos, images, URLs, store names, etc.</p>
     * </li>
     * <li><p>Text-containing color block: Color blocks containing text outside the subject.</p>
     * </li>
     * </ul>
     * <p><strong>2. The features of the intelligent element recognition API mainly include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether elements such as text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow collaboration: Used in combination with the intelligent elimination API. First, the intelligent element recognition API identifies the elements to be removed, and then the intelligent elimination API effectively removes them to ensure the accuracy and efficiency of image processing.</p>
     * </li>
     * </ul>
     * <h2>Technical advantages</h2>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the intelligent element recognition API can process a large number of images while maintaining fast response, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: Users can select the types of elements to be recognized as needed, including elements in the subject and non-subject areas, such as watermarks, logos, and text, to meet personalized recognition needs.</p>
     * </li>
     * </ul>
     * <h2>Result comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Recognition result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/bbd3dbca-9f91-4b57-a382-2701e90c0d46.png" alt="done-image-30091469-e1be-4d31-85de-18983a358a61.png"></td>
     * <td>[Subject]</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: true</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: false |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/6bcbd976-0de1-4b5e-855b-56e20a9c675c.png" alt="image-1781169602620.png"> | [Subject]</p>
     * </li>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: true</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: true |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Identifies specific elements in e-commerce images.</p>
     * 
     * @param tmpReq ImageRecognitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageRecognitionResponse
     */
    public ImageRecognitionResponse imageRecognitionWithOptions(ImageRecognitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImageRecognitionShrinkRequest request = new ImageRecognitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nonObjectDetectElements)) {
            request.nonObjectDetectElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nonObjectDetectElements, "NonObjectDetectElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectDetectElements)) {
            request.objectDetectElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectDetectElements, "ObjectDetectElements", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonObjectDetectElementsShrink)) {
            query.put("NonObjectDetectElements", request.nonObjectDetectElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectDetectElementsShrink)) {
            query.put("ObjectDetectElements", request.objectDetectElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnBorderPixel)) {
            query.put("ReturnBorderPixel", request.returnBorderPixel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnCharacter)) {
            query.put("ReturnCharacter", request.returnCharacter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnCharacterProp)) {
            query.put("ReturnCharacterProp", request.returnCharacterProp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnProductNum)) {
            query.put("ReturnProductNum", request.returnProductNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnProductProp)) {
            query.put("ReturnProductProp", request.returnProductProp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageRecognition"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageRecognitionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>The intelligent element recognition API is designed specifically for recognizing specific elements in e-commerce images. It deeply analyzes image details to help users quickly identify elements such as text, logos, watermarks, and text-containing color blocks in the main subject and background of an image, greatly improving the efficiency and accuracy of image filtering. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <p><strong>1. Intelligent image filtering and optimization:</strong>
     * Merchants and platforms can use the intelligent element recognition API to filter images and automatically identify images containing specific elements such as watermarks and logos. After filtering, you can further call the intelligent elimination API to optimize these images, improve image quality, and shorten the product release cycle.
     * <strong>2. Automated image processing and efficiency improvement:</strong>
     * Through the intelligent element recognition API, merchants and platforms can automate the image processing workflow to automatically identify and mark image elements that need optimization. This workflow reduces manual intervention and improves image processing efficiency.</p>
     * <h2>Features</h2>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, see the relevant examples in the elimination documentation (reserved text link).</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The rest of the image other than the product subject.</p>
     * </li>
     * <li><p>Text: Horizontal, vertical, or slanted English or Chinese text.</p>
     * </li>
     * <li><p>Logo: Logos or trademarks.</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, logos, images, URLs, store names, etc.</p>
     * </li>
     * <li><p>Text-containing color block: Color blocks containing text outside the subject.</p>
     * </li>
     * </ul>
     * <p><strong>2. The features of the intelligent element recognition API mainly include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether elements such as text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow collaboration: Used in combination with the intelligent elimination API. First, the intelligent element recognition API identifies the elements to be removed, and then the intelligent elimination API effectively removes them to ensure the accuracy and efficiency of image processing.</p>
     * </li>
     * </ul>
     * <h2>Technical advantages</h2>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the intelligent element recognition API can process a large number of images while maintaining fast response, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: Users can select the types of elements to be recognized as needed, including elements in the subject and non-subject areas, such as watermarks, logos, and text, to meet personalized recognition needs.</p>
     * </li>
     * </ul>
     * <h2>Result comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Recognition result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/bbd3dbca-9f91-4b57-a382-2701e90c0d46.png" alt="done-image-30091469-e1be-4d31-85de-18983a358a61.png"></td>
     * <td>[Subject]</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: true</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: false |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/6bcbd976-0de1-4b5e-855b-56e20a9c675c.png" alt="image-1781169602620.png"> | [Subject]</p>
     * </li>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: true</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: true |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Identifies specific elements in e-commerce images.</p>
     * 
     * @param request ImageRecognitionRequest
     * @return ImageRecognitionResponse
     */
    public ImageRecognitionResponse imageRecognition(ImageRecognitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageRecognitionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <ol>
     * <li>Intelligent image filtering and optimization:
     * Merchants and platforms can use the intelligent element recognition API to filter images and automatically identify images containing specific elements such as watermarks and logos. After filtering, they can further call the intelligent elimination API to optimize these images, improve image quality, and shorten the product release cycle.</li>
     * <li>Automated image processing and efficiency improvement:
     * Through the intelligent element recognition API, merchants and platforms can automate the image processing workflow and automatically identify and mark image elements that need to be optimized. This workflow reduces manual intervention and improves the efficiency of image processing.</li>
     * </ol>
     * <h1>Features</h1>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, see the relevant examples in the elimination documentation (reserved text link).</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The rest of the image other than the product subject.</p>
     * </li>
     * <li><p>Text: Horizontal, vertical, or slanted English or Chinese text.</p>
     * </li>
     * <li><p>Logo: A logo or trademark.</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, logos, images, URLs, or store names.</p>
     * </li>
     * <li><p>Text-containing color block: A color block containing text outside the subject.</p>
     * </li>
     * </ul>
     * <p><strong>2. The features of the intelligent element recognition API include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether elements such as text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow collaboration: Used in combination with the intelligent elimination API. The intelligent element recognition API first identifies the elements to be removed, and then the intelligent elimination API effectively removes them to ensure the accuracy and efficiency of image processing.</p>
     * </li>
     * </ul>
     * <p><strong>3. Technical advantages:</strong></p>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the intelligent element recognition API can process a large number of images while maintaining fast response, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: Users can select the types of elements to be recognized as needed, including elements in the subject and non-subject areas, such as watermarks, logos, and text, to meet personalized recognition needs.</p>
     * </li>
     * </ul>
     * <h1>Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Recognition result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/bbd3dbca-9f91-4b57-a382-2701e90c0d46.png" alt="done-image-30091469-e1be-4d31-85de-18983a358a61.png"></td>
     * <td>[Subject]</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: true</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: false |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/6bcbd976-0de1-4b5e-855b-56e20a9c675c.png" alt="image-1781169602620.png"> | [Subject]</p>
     * </li>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: true</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: true |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Identifies specific elements in e-commerce images. It deeply analyzes image details to help users quickly identify elements such as text, logos, watermarks, and text-containing color blocks in the main subject and background, significantly improving the efficiency and accuracy of image filtering.</p>
     * 
     * @param tmpReq ImageRecognitionAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageRecognitionAsyncResponse
     */
    public ImageRecognitionAsyncResponse imageRecognitionAsyncWithOptions(ImageRecognitionAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImageRecognitionAsyncShrinkRequest request = new ImageRecognitionAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nonObjectDetectElements)) {
            request.nonObjectDetectElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nonObjectDetectElements, "NonObjectDetectElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectDetectElements)) {
            request.objectDetectElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectDetectElements, "ObjectDetectElements", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonObjectDetectElementsShrink)) {
            query.put("NonObjectDetectElements", request.nonObjectDetectElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectDetectElementsShrink)) {
            query.put("ObjectDetectElements", request.objectDetectElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnBorderPixel)) {
            query.put("ReturnBorderPixel", request.returnBorderPixel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnCharacter)) {
            query.put("ReturnCharacter", request.returnCharacter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnCharacterProp)) {
            query.put("ReturnCharacterProp", request.returnCharacterProp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnProductNum)) {
            query.put("ReturnProductNum", request.returnProductNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnProductProp)) {
            query.put("ReturnProductProp", request.returnProductProp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageRecognitionAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageRecognitionAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <ol>
     * <li>Intelligent image filtering and optimization:
     * Merchants and platforms can use the intelligent element recognition API to filter images and automatically identify images containing specific elements such as watermarks and logos. After filtering, they can further call the intelligent elimination API to optimize these images, improve image quality, and shorten the product release cycle.</li>
     * <li>Automated image processing and efficiency improvement:
     * Through the intelligent element recognition API, merchants and platforms can automate the image processing workflow and automatically identify and mark image elements that need to be optimized. This workflow reduces manual intervention and improves the efficiency of image processing.</li>
     * </ol>
     * <h1>Features</h1>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, see the relevant examples in the elimination documentation (reserved text link).</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The rest of the image other than the product subject.</p>
     * </li>
     * <li><p>Text: Horizontal, vertical, or slanted English or Chinese text.</p>
     * </li>
     * <li><p>Logo: A logo or trademark.</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, logos, images, URLs, or store names.</p>
     * </li>
     * <li><p>Text-containing color block: A color block containing text outside the subject.</p>
     * </li>
     * </ul>
     * <p><strong>2. The features of the intelligent element recognition API include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether elements such as text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow collaboration: Used in combination with the intelligent elimination API. The intelligent element recognition API first identifies the elements to be removed, and then the intelligent elimination API effectively removes them to ensure the accuracy and efficiency of image processing.</p>
     * </li>
     * </ul>
     * <p><strong>3. Technical advantages:</strong></p>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the intelligent element recognition API can process a large number of images while maintaining fast response, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: Users can select the types of elements to be recognized as needed, including elements in the subject and non-subject areas, such as watermarks, logos, and text, to meet personalized recognition needs.</p>
     * </li>
     * </ul>
     * <h1>Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Recognition result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/bbd3dbca-9f91-4b57-a382-2701e90c0d46.png" alt="done-image-30091469-e1be-4d31-85de-18983a358a61.png"></td>
     * <td>[Subject]</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: true</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: false |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/vBPlN5j4yM2KVOdG/img/6bcbd976-0de1-4b5e-855b-56e20a9c675c.png" alt="image-1781169602620.png"> | [Subject]</p>
     * </li>
     * <li><p>Watermark: false</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: false</p>
     * </li>
     * <li><p>Text-containing color block: false</p>
     * </li>
     * </ul>
     * <p>[Non-subject]</p>
     * <ul>
     * <li><p>Watermark: true</p>
     * </li>
     * <li><p>Logo: false</p>
     * </li>
     * <li><p>Text: true</p>
     * </li>
     * <li><p>Text-containing color block: true |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Identifies specific elements in e-commerce images. It deeply analyzes image details to help users quickly identify elements such as text, logos, watermarks, and text-containing color blocks in the main subject and background, significantly improving the efficiency and accuracy of image filtering.</p>
     * 
     * @param request ImageRecognitionAsyncRequest
     * @return ImageRecognitionAsyncResponse
     */
    public ImageRecognitionAsyncResponse imageRecognitionAsync(ImageRecognitionAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageRecognitionAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>The intelligent image object removal product is customized for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and intrusive text overlays from e-commerce images. You can specify objects to be removed as needed to efficiently and accurately process large batches of images and simplify image editing. Supports synchronous and asynchronous modes.</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Efficient processing of e-commerce images:</strong></li>
     * </ul>
     * <p>Removes irrelevant visual elements to provide clearer and more focused product displays, enhancing the customer shopping experience.</p>
     * <ul>
     * <li><strong>Product information synchronization across multiple platforms:</strong></li>
     * </ul>
     * <p>When merchants list products on different e-commerce platforms, they can quickly remove specific text and intrusive text overlays to comply with the image specifications of different platforms.</p>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, clarify the definitions of the image subject and the image background. In actual use, when specifying the objects to be removed, you can choose the removal scope to be the image subject or the image background area. Both API and editor integration methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the rest of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the objects to be removed support the following four types: text, specific names, transparent text blocks, and intrusive text overlays. You can refer to the following examples to clarify your usage requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Result comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/AJdl65AyryVZyOke/img/4bd2c812-ed3c-45da-8a86-ebd29102f4b1.jpeg" alt="Main image 1 - Leopard print large capacity millennium single shoulder crossbody canvas bag.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/eff0eb1b-36df-431d-a010-3bb3b7348ff9.png" alt="image.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/c44ac17b-3fa4-4a6f-b411-90f1062b183b.jpeg" alt="Main image 1 - Handled ultra-short half-cover round-head French false nails.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/af779684-4aa5-49b0-8668-34ab8bd4bcc1.png" alt="image.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images. Tailored for e-commerce scenarios, it automatically identifies and removes text, specific names, transparent text blocks, and watermarks. You can specify objects to remove on demand to efficiently and accurately process large image batches and simplify image editing in synchronous or asynchronous mode.</p>
     * 
     * @param request ImageRemovalProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageRemovalProResponse
     */
    public ImageRemovalProResponse imageRemovalProWithOptions(ImageRemovalProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageRemovalPro"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageRemovalProResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>The intelligent image object removal product is customized for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and intrusive text overlays from e-commerce images. You can specify objects to be removed as needed to efficiently and accurately process large batches of images and simplify image editing. Supports synchronous and asynchronous modes.</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Efficient processing of e-commerce images:</strong></li>
     * </ul>
     * <p>Removes irrelevant visual elements to provide clearer and more focused product displays, enhancing the customer shopping experience.</p>
     * <ul>
     * <li><strong>Product information synchronization across multiple platforms:</strong></li>
     * </ul>
     * <p>When merchants list products on different e-commerce platforms, they can quickly remove specific text and intrusive text overlays to comply with the image specifications of different platforms.</p>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, clarify the definitions of the image subject and the image background. In actual use, when specifying the objects to be removed, you can choose the removal scope to be the image subject or the image background area. Both API and editor integration methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the rest of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the objects to be removed support the following four types: text, specific names, transparent text blocks, and intrusive text overlays. You can refer to the following examples to clarify your usage requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Result comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/AJdl65AyryVZyOke/img/4bd2c812-ed3c-45da-8a86-ebd29102f4b1.jpeg" alt="Main image 1 - Leopard print large capacity millennium single shoulder crossbody canvas bag.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/eff0eb1b-36df-431d-a010-3bb3b7348ff9.png" alt="image.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/c44ac17b-3fa4-4a6f-b411-90f1062b183b.jpeg" alt="Main image 1 - Handled ultra-short half-cover round-head French false nails.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/af779684-4aa5-49b0-8668-34ab8bd4bcc1.png" alt="image.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images. Tailored for e-commerce scenarios, it automatically identifies and removes text, specific names, transparent text blocks, and watermarks. You can specify objects to remove on demand to efficiently and accurately process large image batches and simplify image editing in synchronous or asynchronous mode.</p>
     * 
     * @param request ImageRemovalProRequest
     * @return ImageRemovalProResponse
     */
    public ImageRemovalProResponse imageRemovalPro(ImageRemovalProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageRemovalProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong>
     * Removes irrelevant visual elements to provide clearer and more focused product displays, enhancing the customer shopping experience.</li>
     * <li><strong>Multi-platform product information synchronization:</strong>
     * Quickly removes specific text and promotional watermarks when merchants list products on different e-commerce platforms, ensuring compliance with the image specifications of different platforms.</li>
     * </ul>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, understand the definitions of the image subject and the image background. In actual use, when specifying the objects to be removed, you can choose to remove objects from the image subject or the image background. Both API and editor integration methods are supported to meet different needs.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the rest of the image excluding the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the objects to be removed can be text, specific names, transparent text blocks, or promotional watermarks. You can refer to the following examples to clarify your requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Processed image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/AJdl65AyryVZyOke/img/4bd2c812-ed3c-45da-8a86-ebd29102f4b1.jpeg" alt="Main image 1 - Leopard print large capacity millennium single shoulder crossbody canvas bag.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/eff0eb1b-36df-431d-a010-3bb3b7348ff9.png" alt="image.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/c44ac17b-3fa4-4a6f-b411-90f1062b183b.jpeg" alt="Main image 1 - Handled ultra-short half-cover round-head French false nails.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/af779684-4aa5-49b0-8668-34ab8bd4bcc1.png" alt="image.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Removes text, specific names, transparent text blocks, and promotional watermarks from e-commerce images. This operation automatically identifies and removes these elements or allows you to specify the objects to be removed, enabling efficient and accurate processing of large batches of images and simplifying image editing.</p>
     * 
     * @param request ImageRemovalProAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageRemovalProAsyncResponse
     */
    public ImageRemovalProAsyncResponse imageRemovalProAsyncWithOptions(ImageRemovalProAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageRemovalProAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageRemovalProAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong>
     * Removes irrelevant visual elements to provide clearer and more focused product displays, enhancing the customer shopping experience.</li>
     * <li><strong>Multi-platform product information synchronization:</strong>
     * Quickly removes specific text and promotional watermarks when merchants list products on different e-commerce platforms, ensuring compliance with the image specifications of different platforms.</li>
     * </ul>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, understand the definitions of the image subject and the image background. In actual use, when specifying the objects to be removed, you can choose to remove objects from the image subject or the image background. Both API and editor integration methods are supported to meet different needs.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the rest of the image excluding the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the objects to be removed can be text, specific names, transparent text blocks, or promotional watermarks. You can refer to the following examples to clarify your requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Processed image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/AJdl65AyryVZyOke/img/4bd2c812-ed3c-45da-8a86-ebd29102f4b1.jpeg" alt="Main image 1 - Leopard print large capacity millennium single shoulder crossbody canvas bag.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/eff0eb1b-36df-431d-a010-3bb3b7348ff9.png" alt="image.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/c44ac17b-3fa4-4a6f-b411-90f1062b183b.jpeg" alt="Main image 1 - Handled ultra-short half-cover round-head French false nails.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/af779684-4aa5-49b0-8668-34ab8bd4bcc1.png" alt="image.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Removes text, specific names, transparent text blocks, and promotional watermarks from e-commerce images. This operation automatically identifies and removes these elements or allows you to specify the objects to be removed, enabling efficient and accurate processing of large batches of images and simplifying image editing.</p>
     * 
     * @param request ImageRemovalProAsyncRequest
     * @return ImageRemovalProAsyncResponse
     */
    public ImageRemovalProAsyncResponse imageRemovalProAsync(ImageRemovalProAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageRemovalProAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Product Introduction</h1>
     * <p>The intelligent image removal product is designed specifically for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and image blemishes from e-commerce images. You can specify objects to remove as needed, enabling efficient and precise batch processing of large volumes of images and simplifying image editing workflows. (Synchronous)</p>
     * <h1>Common scenarios</h1>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide clearer, more focused product displays and enhance the shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform product information synchronization:</strong></li>
     * </ul>
     * <p>When listing products across different e-commerce platforms, quickly remove specific text and image blemishes to comply with the image standards of each platform.</p>
     * <ul>
     * <li><strong>Marketing material preparation:</strong></li>
     * </ul>
     * <p>Easily remove existing promotional information and quickly update images with the latest campaign details.</p>
     * <blockquote>
     * <p>Note: Merchants or platforms can batch-remove impurities from images to optimize image quality. Use this product together with the Intelligent Recognition API (coming soon). First, filter out images that contain text, specific names, transparent text blocks, and image blemishes, and then use the Intelligent Removal API for batch removal. The Intelligent Recognition API focuses on &quot;recognition&quot;, while the Intelligent Removal API focuses on &quot;removal&quot;. By calling them in sequence, you can maximize removal effectiveness and reduce false removals and false identifications.</p>
     * </blockquote>
     * <h1>Features</h1>
     * <ol>
     * <li><p>First, understand the definitions of image subject and image background. When specifying objects to remove, you can choose whether the removal scope is the image subject or the image background area. Both API and editor access methods are supported to meet different requirements.</p>
     * <ol>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The remaining part of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>The following three types of removal targets are supported:</p>
     * <ol>
     * <li><p>Select by type only. You can select text, specific names, transparent text blocks, and image blemishes. Refer to the following examples to clarify your requirements and perform targeted operations.</p>
     * </li>
     * <li><p>(Upgrade) Specify images to remove. You can specify multiple images at a time.</p>
     * </li>
     * <li><p>(Upgrade) Specify text to remove. You can specify multiple text strings at a time.</p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>Processing flow: User submits the original image URL → OCR + VLM model detects text or image positions → Determines the coordinates of areas to repair → AI repairs and generates a clean image → Returns the result image URL.</p>
     * <h1>4. Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Removable objects in images</strong></th>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Text</td>
     * <td>*   Involves the image subject area</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code>![done-image-4a2a96c2-9ac6-4b35-b76b-a6eac303740f (1).png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d72a7982-e761-4b45-af1e-f8f90b3f1fc3.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/47428227-7523-432e-89ce-eba263e5ebda.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d69e38e4-5657-471d-aff6-1e6a4c269455.png" alt="359ddfcf-a2b1-4e59-ae54-5e76705d0adf.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/365024b4-4863-46d4-9013-bdd9408ea6b9.png" alt="c35611f8-dab4-4df2-8942-36d7375ed55f.png"> |
     * | Specific names | *   Involves the image subject area</p>
     * <pre><code>![done-image-aca80515-aca6-4f4e-9429-47c5dd6b811f.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ac35f8bc-d527-49de-8fba-cdeb71e3b058.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/2db445c8-6bdd-424e-b6a7-2ddb46e6786d.png" alt="done-image-29a89f03-964a-455e-968c-7c8d5282ebbb.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/36ace8aa-3b3b-4b1c-81e6-b691104262f0.png" alt="fd2db0ab-1b89-4085-b91d-99f40a1aea77.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/a7653a0c-d14e-4f97-9c2f-83327b43203f.png" alt="8726b148-ab74-4409-a6c1-4c50fcac3887.png"> |
     * | Transparent text blocks | *   Involves the image subject area</p>
     * <pre><code>![image.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0f6068f0-168a-47bd-9fcd-c38b9e520506.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c9ac2a4c-0aa3-40ee-8855-62a262364dbe.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/06ac537f-875a-48e2-8934-a84a79dfd8ff.jpeg" alt="8e84a5d6-da8c-4e3e-a705-71a66d0c78a2.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/05759aef-1720-41cd-8800-f7d0801e4d95.jpeg" alt="b05173e7-2ae5-494e-99d2-7111fc966fd5.jpeg"> |
     * | Image blemishes | *   Involves the image subject area</p>
     * <pre><code>![2.jpeg](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/bf1442f8-a9fa-40d3-bcb0-7a8a41b49b5d.jpeg)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0d68612e-845d-466f-8a4a-b85facea095b.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/621daadc-454f-41b4-9ac4-752d457034b6.jpeg" alt="b6ef803f-743f-4e61-b901-d1f68167186f.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |
     * | Specified image element removal (supports multiple image links) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/9297951f-53c1-4476-8c69-5c31df3fce21.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ef3f35aa-609f-454c-bba0-dd1710c83945.png" alt="image.png"> |
     * | Specified text removal (supports multiple text strings) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c784d8be-4b4d-4972-8b99-828c742b8f03.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/805423ca-bd0d-4d44-a18e-a7d7bfe88587.png" alt="image.png"> |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images. This product automatically identifies and removes text, specific names, transparent text blocks, and image blemishes from e-commerce images. You can specify objects to remove as needed, enabling efficient and precise batch processing of large volumes of images and simplifying image editing workflows. (Synchronous)</p>
     * 
     * @param tmpReq ImageRemoveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageRemoveResponse
     */
    public ImageRemoveResponse imageRemoveWithOptions(ImageRemoveRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImageRemoveShrinkRequest request = new ImageRemoveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nonObjectRemoveElements)) {
            request.nonObjectRemoveElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nonObjectRemoveElements, "NonObjectRemoveElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectRemoveElements)) {
            request.objectRemoveElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectRemoveElements, "ObjectRemoveElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userImage)) {
            request.userImageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userImage, "UserImage", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userText)) {
            request.userTextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userText, "UserText", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonObjectRemoveElementsShrink)) {
            query.put("NonObjectRemoveElements", request.nonObjectRemoveElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectRemoveElementsShrink)) {
            query.put("ObjectRemoveElements", request.objectRemoveElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userImageShrink)) {
            query.put("UserImage", request.userImageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTextShrink)) {
            query.put("UserText", request.userTextShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageRemove"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageRemoveResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Product Introduction</h1>
     * <p>The intelligent image removal product is designed specifically for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and image blemishes from e-commerce images. You can specify objects to remove as needed, enabling efficient and precise batch processing of large volumes of images and simplifying image editing workflows. (Synchronous)</p>
     * <h1>Common scenarios</h1>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide clearer, more focused product displays and enhance the shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform product information synchronization:</strong></li>
     * </ul>
     * <p>When listing products across different e-commerce platforms, quickly remove specific text and image blemishes to comply with the image standards of each platform.</p>
     * <ul>
     * <li><strong>Marketing material preparation:</strong></li>
     * </ul>
     * <p>Easily remove existing promotional information and quickly update images with the latest campaign details.</p>
     * <blockquote>
     * <p>Note: Merchants or platforms can batch-remove impurities from images to optimize image quality. Use this product together with the Intelligent Recognition API (coming soon). First, filter out images that contain text, specific names, transparent text blocks, and image blemishes, and then use the Intelligent Removal API for batch removal. The Intelligent Recognition API focuses on &quot;recognition&quot;, while the Intelligent Removal API focuses on &quot;removal&quot;. By calling them in sequence, you can maximize removal effectiveness and reduce false removals and false identifications.</p>
     * </blockquote>
     * <h1>Features</h1>
     * <ol>
     * <li><p>First, understand the definitions of image subject and image background. When specifying objects to remove, you can choose whether the removal scope is the image subject or the image background area. Both API and editor access methods are supported to meet different requirements.</p>
     * <ol>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The remaining part of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>The following three types of removal targets are supported:</p>
     * <ol>
     * <li><p>Select by type only. You can select text, specific names, transparent text blocks, and image blemishes. Refer to the following examples to clarify your requirements and perform targeted operations.</p>
     * </li>
     * <li><p>(Upgrade) Specify images to remove. You can specify multiple images at a time.</p>
     * </li>
     * <li><p>(Upgrade) Specify text to remove. You can specify multiple text strings at a time.</p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>Processing flow: User submits the original image URL → OCR + VLM model detects text or image positions → Determines the coordinates of areas to repair → AI repairs and generates a clean image → Returns the result image URL.</p>
     * <h1>4. Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Removable objects in images</strong></th>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Text</td>
     * <td>*   Involves the image subject area</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code>![done-image-4a2a96c2-9ac6-4b35-b76b-a6eac303740f (1).png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d72a7982-e761-4b45-af1e-f8f90b3f1fc3.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/47428227-7523-432e-89ce-eba263e5ebda.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d69e38e4-5657-471d-aff6-1e6a4c269455.png" alt="359ddfcf-a2b1-4e59-ae54-5e76705d0adf.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/365024b4-4863-46d4-9013-bdd9408ea6b9.png" alt="c35611f8-dab4-4df2-8942-36d7375ed55f.png"> |
     * | Specific names | *   Involves the image subject area</p>
     * <pre><code>![done-image-aca80515-aca6-4f4e-9429-47c5dd6b811f.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ac35f8bc-d527-49de-8fba-cdeb71e3b058.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/2db445c8-6bdd-424e-b6a7-2ddb46e6786d.png" alt="done-image-29a89f03-964a-455e-968c-7c8d5282ebbb.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/36ace8aa-3b3b-4b1c-81e6-b691104262f0.png" alt="fd2db0ab-1b89-4085-b91d-99f40a1aea77.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/a7653a0c-d14e-4f97-9c2f-83327b43203f.png" alt="8726b148-ab74-4409-a6c1-4c50fcac3887.png"> |
     * | Transparent text blocks | *   Involves the image subject area</p>
     * <pre><code>![image.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0f6068f0-168a-47bd-9fcd-c38b9e520506.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c9ac2a4c-0aa3-40ee-8855-62a262364dbe.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/06ac537f-875a-48e2-8934-a84a79dfd8ff.jpeg" alt="8e84a5d6-da8c-4e3e-a705-71a66d0c78a2.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/05759aef-1720-41cd-8800-f7d0801e4d95.jpeg" alt="b05173e7-2ae5-494e-99d2-7111fc966fd5.jpeg"> |
     * | Image blemishes | *   Involves the image subject area</p>
     * <pre><code>![2.jpeg](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/bf1442f8-a9fa-40d3-bcb0-7a8a41b49b5d.jpeg)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0d68612e-845d-466f-8a4a-b85facea095b.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/621daadc-454f-41b4-9ac4-752d457034b6.jpeg" alt="b6ef803f-743f-4e61-b901-d1f68167186f.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |
     * | Specified image element removal (supports multiple image links) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/9297951f-53c1-4476-8c69-5c31df3fce21.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ef3f35aa-609f-454c-bba0-dd1710c83945.png" alt="image.png"> |
     * | Specified text removal (supports multiple text strings) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c784d8be-4b4d-4972-8b99-828c742b8f03.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/805423ca-bd0d-4d44-a18e-a7d7bfe88587.png" alt="image.png"> |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images. This product automatically identifies and removes text, specific names, transparent text blocks, and image blemishes from e-commerce images. You can specify objects to remove as needed, enabling efficient and precise batch processing of large volumes of images and simplifying image editing workflows. (Synchronous)</p>
     * 
     * @param request ImageRemoveRequest
     * @return ImageRemoveResponse
     */
    public ImageRemoveResponse imageRemove(ImageRemoveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageRemoveWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Efficient processing of e-commerce images:</strong><br>Removes irrelevant visual elements to provide clearer and more focused product displays, enhancing the customer shopping experience.</li>
     * <li><strong>Multi-platform product information synchronization:</strong><br>When merchants synchronize product listings across different e-commerce platforms, they can quickly remove specific text and watermarks to comply with the image specifications of different platforms.</li>
     * <li><strong>Marketing material preparation:</strong><br>Merchants can easily remove original promotional information and quickly update it with the latest campaign information.<blockquote>
     * <p>Note: Merchants or platforms can batch remove impurities in images to optimize image quality. Use this feature in combination with the Intelligent Recognition API (coming soon) to first filter out images containing text, specific names, transparent text blocks, and watermarks, and then use the Intelligent Erasure API for batch removal. The Intelligent Recognition API focuses on recognition, while the Intelligent Erasure API focuses on erasure. By calling them in sequence, you can maximize the erasure effect and reduce false removals and false recognitions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, clarify the definitions of the image subject and the image background. In actual use, when specifying the objects to remove, you can choose whether the removal scope is the image subject or the image background area. Both API and editor integration methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the rest of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the objects to remove support the following three scenarios:</p>
     * <ol>
     * <li><p>The user selects only the type. You can select text, specific names, transparent text blocks, and watermarks. You can clarify your usage requirements through the following examples for targeted operations.</p>
     * </li>
     * <li><p>(Upgraded) Provides specified image erasure. You can specify multiple images at a time.</p>
     * </li>
     * <li><p>(Upgraded) Provides specified text erasure. You can specify multiple text strings at a time.</p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>Processing flow: The user passes the original image URL → The OCR and VLM models detect the text or image position → Determine the coordinates of the area to be inpainted → AI inpainting generates a clean image → Return the result image URL.</p>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Objects that can be removed from the image</strong></th>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after erasure</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Text</td>
     * <td>*   Involves the image subject area</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code>![done-image-4a2a96c2-9ac6-4b35-b76b-a6eac303740f (1).png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d72a7982-e761-4b45-af1e-f8f90b3f1fc3.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/47428227-7523-432e-89ce-eba263e5ebda.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d69e38e4-5657-471d-aff6-1e6a4c269455.png" alt="359ddfcf-a2b1-4e59-ae54-5e76705d0adf.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/365024b4-4863-46d4-9013-bdd9408ea6b9.png" alt="c35611f8-dab4-4df2-8942-36d7375ed55f.png"> |
     * | Specific names | *   Involves the image subject area</p>
     * <pre><code>![done-image-aca80515-aca6-4f4e-9429-47c5dd6b811f.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ac35f8bc-d527-49de-8fba-cdeb71e3b058.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/2db445c8-6bdd-424e-b6a7-2ddb46e6786d.png" alt="done-image-29a89f03-964a-455e-968c-7c8d5282ebbb.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/36ace8aa-3b3b-4b1c-81e6-b691104262f0.png" alt="fd2db0ab-1b89-4085-b91d-99f40a1aea77.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/a7653a0c-d14e-4f97-9c2f-83327b43203f.png" alt="8726b148-ab74-4409-a6c1-4c50fcac3887.png"> |
     * | Transparent text blocks | *   Involves the image subject area</p>
     * <pre><code>![image.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0f6068f0-168a-47bd-9fcd-c38b9e520506.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c9ac2a4c-0aa3-40ee-8855-62a262364dbe.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/06ac537f-875a-48e2-8934-a84a79dfd8ff.jpeg" alt="8e84a5d6-da8c-4e3e-a705-71a66d0c78a2.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/05759aef-1720-41cd-8800-f7d0801e4d95.jpeg" alt="b05173e7-2ae5-494e-99d2-7111fc966fd5.jpeg"> |
     * | Watermarks | *   Involves the image subject area</p>
     * <pre><code>![2.jpeg](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/bf1442f8-a9fa-40d3-bcb0-7a8a41b49b5d.jpeg)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0d68612e-845d-466f-8a4a-b85facea095b.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/621daadc-454f-41b4-9ac4-752d457034b6.jpeg" alt="b6ef803f-743f-4e61-b901-d1f68167186f.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |
     * | Specified image element erasure (supports multiple image links) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/9297951f-53c1-4476-8c69-5c31df3fce21.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ef3f35aa-609f-454c-bba0-dd1710c83945.png" alt="image.png"> |
     * | Specified text erasure (supports multiple text strings) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c784d8be-4b4d-4972-8b99-828c742b8f03.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/805423ca-bd0d-4d44-a18e-a7d7bfe88587.png" alt="image.png"> |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images by automatically identifying and erasing text, specific names, transparent text blocks, and intrusive watermarks. It also allows you to specify objects for removal as needed, enabling efficient and accurate processing of large image batches and simplifying image editing workflows.</p>
     * 
     * @param tmpReq ImageRemoveAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageRemoveAsyncResponse
     */
    public ImageRemoveAsyncResponse imageRemoveAsyncWithOptions(ImageRemoveAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImageRemoveAsyncShrinkRequest request = new ImageRemoveAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nonObjectRemoveElements)) {
            request.nonObjectRemoveElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nonObjectRemoveElements, "NonObjectRemoveElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectRemoveElements)) {
            request.objectRemoveElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectRemoveElements, "ObjectRemoveElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userImage)) {
            request.userImageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userImage, "UserImage", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userText)) {
            request.userTextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userText, "UserText", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonObjectRemoveElementsShrink)) {
            query.put("NonObjectRemoveElements", request.nonObjectRemoveElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectRemoveElementsShrink)) {
            query.put("ObjectRemoveElements", request.objectRemoveElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userImageShrink)) {
            query.put("UserImage", request.userImageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTextShrink)) {
            query.put("UserText", request.userTextShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageRemoveAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageRemoveAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Efficient processing of e-commerce images:</strong><br>Removes irrelevant visual elements to provide clearer and more focused product displays, enhancing the customer shopping experience.</li>
     * <li><strong>Multi-platform product information synchronization:</strong><br>When merchants synchronize product listings across different e-commerce platforms, they can quickly remove specific text and watermarks to comply with the image specifications of different platforms.</li>
     * <li><strong>Marketing material preparation:</strong><br>Merchants can easily remove original promotional information and quickly update it with the latest campaign information.<blockquote>
     * <p>Note: Merchants or platforms can batch remove impurities in images to optimize image quality. Use this feature in combination with the Intelligent Recognition API (coming soon) to first filter out images containing text, specific names, transparent text blocks, and watermarks, and then use the Intelligent Erasure API for batch removal. The Intelligent Recognition API focuses on recognition, while the Intelligent Erasure API focuses on erasure. By calling them in sequence, you can maximize the erasure effect and reduce false removals and false recognitions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, clarify the definitions of the image subject and the image background. In actual use, when specifying the objects to remove, you can choose whether the removal scope is the image subject or the image background area. Both API and editor integration methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the rest of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the objects to remove support the following three scenarios:</p>
     * <ol>
     * <li><p>The user selects only the type. You can select text, specific names, transparent text blocks, and watermarks. You can clarify your usage requirements through the following examples for targeted operations.</p>
     * </li>
     * <li><p>(Upgraded) Provides specified image erasure. You can specify multiple images at a time.</p>
     * </li>
     * <li><p>(Upgraded) Provides specified text erasure. You can specify multiple text strings at a time.</p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>Processing flow: The user passes the original image URL → The OCR and VLM models detect the text or image position → Determine the coordinates of the area to be inpainted → AI inpainting generates a clean image → Return the result image URL.</p>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Objects that can be removed from the image</strong></th>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after erasure</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Text</td>
     * <td>*   Involves the image subject area</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code>![done-image-4a2a96c2-9ac6-4b35-b76b-a6eac303740f (1).png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d72a7982-e761-4b45-af1e-f8f90b3f1fc3.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/47428227-7523-432e-89ce-eba263e5ebda.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d69e38e4-5657-471d-aff6-1e6a4c269455.png" alt="359ddfcf-a2b1-4e59-ae54-5e76705d0adf.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/365024b4-4863-46d4-9013-bdd9408ea6b9.png" alt="c35611f8-dab4-4df2-8942-36d7375ed55f.png"> |
     * | Specific names | *   Involves the image subject area</p>
     * <pre><code>![done-image-aca80515-aca6-4f4e-9429-47c5dd6b811f.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ac35f8bc-d527-49de-8fba-cdeb71e3b058.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/2db445c8-6bdd-424e-b6a7-2ddb46e6786d.png" alt="done-image-29a89f03-964a-455e-968c-7c8d5282ebbb.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/36ace8aa-3b3b-4b1c-81e6-b691104262f0.png" alt="fd2db0ab-1b89-4085-b91d-99f40a1aea77.png"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/a7653a0c-d14e-4f97-9c2f-83327b43203f.png" alt="8726b148-ab74-4409-a6c1-4c50fcac3887.png"> |
     * | Transparent text blocks | *   Involves the image subject area</p>
     * <pre><code>![image.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0f6068f0-168a-47bd-9fcd-c38b9e520506.png)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c9ac2a4c-0aa3-40ee-8855-62a262364dbe.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/06ac537f-875a-48e2-8934-a84a79dfd8ff.jpeg" alt="8e84a5d6-da8c-4e3e-a705-71a66d0c78a2.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/05759aef-1720-41cd-8800-f7d0801e4d95.jpeg" alt="b05173e7-2ae5-494e-99d2-7111fc966fd5.jpeg"> |
     * | Watermarks | *   Involves the image subject area</p>
     * <pre><code>![2.jpeg](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/bf1442f8-a9fa-40d3-bcb0-7a8a41b49b5d.jpeg)
     * </code></pre>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0d68612e-845d-466f-8a4a-b85facea095b.png" alt="image.png"> | *   Involves the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/621daadc-454f-41b4-9ac4-752d457034b6.jpeg" alt="b6ef803f-743f-4e61-b901-d1f68167186f.jpeg"></p>
     * <ul>
     * <li>Does not involve the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |
     * | Specified image element erasure (supports multiple image links) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/9297951f-53c1-4476-8c69-5c31df3fce21.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ef3f35aa-609f-454c-bba0-dd1710c83945.png" alt="image.png"> |
     * | Specified text erasure (supports multiple text strings) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c784d8be-4b4d-4972-8b99-828c742b8f03.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/805423ca-bd0d-4d44-a18e-a7d7bfe88587.png" alt="image.png"> |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images by automatically identifying and erasing text, specific names, transparent text blocks, and intrusive watermarks. It also allows you to specify objects for removal as needed, enabling efficient and accurate processing of large image batches and simplifying image editing workflows.</p>
     * 
     * @param request ImageRemoveAsyncRequest
     * @return ImageRemoveAsyncResponse
     */
    public ImageRemoveAsyncResponse imageRemoveAsync(ImageRemoveAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageRemoveAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The PLUS edition of the image translation service is designed specifically for e-commerce images. Built on the Mixture of Experts (MOE) architecture, it delivers higher translation accuracy for multiple minor languages than the Lite and Pro editions. We recommend that you use this edition for the following 12 language pairs. More language pairs will be supported in the future.
     * Supported language pairs:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>No.</strong></th>
     * <th><strong>Source language</strong></th>
     * <th></th>
     * <th><strong>Target language</strong></th>
     * <th></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Language code</td>
     * <td>Language name</td>
     * <td>Language code</td>
     * <td>Language name</td>
     * </tr>
     * <tr>
     * <td>1</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ar</td>
     * <td>Arabic</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>en</td>
     * <td>English</td>
     * <td>id</td>
     * <td>Indonesian</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>en</td>
     * <td>English</td>
     * <td>th</td>
     * <td>Thai</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ko</td>
     * <td>Korean</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ja</td>
     * <td>Japanese</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>en</td>
     * <td>English</td>
     * <td>vi</td>
     * <td>Vietnamese</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ru</td>
     * <td>Russian</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>en</td>
     * <td>English</td>
     * <td>tl</td>
     * <td>Filipino</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>en</td>
     * <td>English</td>
     * <td>es</td>
     * <td>Spanish</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>en</td>
     * <td>English</td>
     * <td>fr</td>
     * <td>French</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>en</td>
     * <td>English</td>
     * <td>de</td>
     * <td>German</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>en</td>
     * <td>English</td>
     * <td>pl</td>
     * <td>Polish</td>
     * </tr>
     * </tbody></table>
     * <h2>Scenarios</h2>
     * <p>Main images and detail images for cross-border e-commerce.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: Allows you to specify whether to translate the text on the product subject. This helps protect the subject information, such as the embedded product name, from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to specify whether to translate the brand name in the image. This helps protect the brand name from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), or leaving it untranslated (ABC-null). This is commonly used for scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API operation to meet your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates e-commerce images by using the PLUS edition of the image translation service. Built on the Mixture of Experts (MOE) architecture, this edition delivers higher translation accuracy for multiple minor languages than the Lite and Pro editions. It is recommended for the following 12 language pairs, with more to be added in the future.</p>
     * 
     * @param request ImageTranslationPlusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageTranslationPlusResponse
     */
    public ImageTranslationPlusResponse imageTranslationPlusWithOptions(ImageTranslationPlusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            body.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            body.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            body.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useImageEditor)) {
            body.put("UseImageEditor", request.useImageEditor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageTranslationPlus"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageTranslationPlusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The PLUS edition of the image translation service is designed specifically for e-commerce images. Built on the Mixture of Experts (MOE) architecture, it delivers higher translation accuracy for multiple minor languages than the Lite and Pro editions. We recommend that you use this edition for the following 12 language pairs. More language pairs will be supported in the future.
     * Supported language pairs:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>No.</strong></th>
     * <th><strong>Source language</strong></th>
     * <th></th>
     * <th><strong>Target language</strong></th>
     * <th></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Language code</td>
     * <td>Language name</td>
     * <td>Language code</td>
     * <td>Language name</td>
     * </tr>
     * <tr>
     * <td>1</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ar</td>
     * <td>Arabic</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>en</td>
     * <td>English</td>
     * <td>id</td>
     * <td>Indonesian</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>en</td>
     * <td>English</td>
     * <td>th</td>
     * <td>Thai</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ko</td>
     * <td>Korean</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ja</td>
     * <td>Japanese</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>en</td>
     * <td>English</td>
     * <td>vi</td>
     * <td>Vietnamese</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ru</td>
     * <td>Russian</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>en</td>
     * <td>English</td>
     * <td>tl</td>
     * <td>Filipino</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>en</td>
     * <td>English</td>
     * <td>es</td>
     * <td>Spanish</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>en</td>
     * <td>English</td>
     * <td>fr</td>
     * <td>French</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>en</td>
     * <td>English</td>
     * <td>de</td>
     * <td>German</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>en</td>
     * <td>English</td>
     * <td>pl</td>
     * <td>Polish</td>
     * </tr>
     * </tbody></table>
     * <h2>Scenarios</h2>
     * <p>Main images and detail images for cross-border e-commerce.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: Allows you to specify whether to translate the text on the product subject. This helps protect the subject information, such as the embedded product name, from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to specify whether to translate the brand name in the image. This helps protect the brand name from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), or leaving it untranslated (ABC-null). This is commonly used for scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API operation to meet your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates e-commerce images by using the PLUS edition of the image translation service. Built on the Mixture of Experts (MOE) architecture, this edition delivers higher translation accuracy for multiple minor languages than the Lite and Pro editions. It is recommended for the following 12 language pairs, with more to be added in the future.</p>
     * 
     * @param request ImageTranslationPlusRequest
     * @return ImageTranslationPlusResponse
     */
    public ImageTranslationPlusResponse imageTranslationPlus(ImageTranslationPlusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageTranslationPlusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Main images and detail images for cross-border e-commerce.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: You can choose whether to translate the text on the product subject. This helps you protect the subject information from being translated, such as embedded information like product names.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: You can choose whether to translate the brand names in the image. This helps you protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: You can customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), or omitting the translation (ABC-null). This is commonly used in scenarios such as brand word protection. You can achieve this by passing the corresponding intervention glossary ID when calling the API, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention entries. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * <h2>Supported language pairs</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>No.</strong></th>
     * <th><strong>Source language</strong></th>
     * <th></th>
     * <th><strong>Target language</strong></th>
     * <th></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Language code</td>
     * <td>Language name</td>
     * <td>Language code</td>
     * <td>Language name</td>
     * </tr>
     * <tr>
     * <td>1</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ar</td>
     * <td>Arabic</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>en</td>
     * <td>English</td>
     * <td>id</td>
     * <td>Indonesian</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>en</td>
     * <td>English</td>
     * <td>th</td>
     * <td>Thai</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ko</td>
     * <td>Korean</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ja</td>
     * <td>Japanese</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>en</td>
     * <td>English</td>
     * <td>vi</td>
     * <td>Vietnamese</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ru</td>
     * <td>Russian</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>en</td>
     * <td>English</td>
     * <td>tl</td>
     * <td>Filipino</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>en</td>
     * <td>English</td>
     * <td>es</td>
     * <td>Spanish</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>en</td>
     * <td>English</td>
     * <td>fr</td>
     * <td>French</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>en</td>
     * <td>English</td>
     * <td>de</td>
     * <td>German</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>en</td>
     * <td>English</td>
     * <td>pl</td>
     * <td>Polish</td>
     * </tr>
     * </tbody></table>
     * <h2>Preparations and call process</h2>
     * <p>Image Translation Plus and other asynchronous APIs share the same result retrieval process, RocketMQ subscription rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.
     * For the integration process, subscription rules, message formats and encryption protocols, and detailed integration solutions for asynchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Image Translation Plus is designed specifically for e-commerce images. It adopts the Mixture of Experts (MoE) architecture and outperforms Image Translation Lite and Pro in translation accuracy for multiple minor languages.</p>
     * 
     * @param request ImageTranslationPlusAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageTranslationPlusAsyncResponse
     */
    public ImageTranslationPlusAsyncResponse imageTranslationPlusAsyncWithOptions(ImageTranslationPlusAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            query.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            query.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useImageEditor)) {
            query.put("UseImageEditor", request.useImageEditor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageTranslationPlusAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageTranslationPlusAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Main images and detail images for cross-border e-commerce.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: You can choose whether to translate the text on the product subject. This helps you protect the subject information from being translated, such as embedded information like product names.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: You can choose whether to translate the brand names in the image. This helps you protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: You can customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), or omitting the translation (ABC-null). This is commonly used in scenarios such as brand word protection. You can achieve this by passing the corresponding intervention glossary ID when calling the API, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention entries. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * <h2>Supported language pairs</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>No.</strong></th>
     * <th><strong>Source language</strong></th>
     * <th></th>
     * <th><strong>Target language</strong></th>
     * <th></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Language code</td>
     * <td>Language name</td>
     * <td>Language code</td>
     * <td>Language name</td>
     * </tr>
     * <tr>
     * <td>1</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ar</td>
     * <td>Arabic</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>en</td>
     * <td>English</td>
     * <td>id</td>
     * <td>Indonesian</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>en</td>
     * <td>English</td>
     * <td>th</td>
     * <td>Thai</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ko</td>
     * <td>Korean</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ja</td>
     * <td>Japanese</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>en</td>
     * <td>English</td>
     * <td>vi</td>
     * <td>Vietnamese</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>en</td>
     * <td>English</td>
     * <td>ru</td>
     * <td>Russian</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>en</td>
     * <td>English</td>
     * <td>tl</td>
     * <td>Filipino</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>en</td>
     * <td>English</td>
     * <td>es</td>
     * <td>Spanish</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>en</td>
     * <td>English</td>
     * <td>fr</td>
     * <td>French</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>en</td>
     * <td>English</td>
     * <td>de</td>
     * <td>German</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>en</td>
     * <td>English</td>
     * <td>pl</td>
     * <td>Polish</td>
     * </tr>
     * </tbody></table>
     * <h2>Preparations and call process</h2>
     * <p>Image Translation Plus and other asynchronous APIs share the same result retrieval process, RocketMQ subscription rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.
     * For the integration process, subscription rules, message formats and encryption protocols, and detailed integration solutions for asynchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Image Translation Plus is designed specifically for e-commerce images. It adopts the Mixture of Experts (MoE) architecture and outperforms Image Translation Lite and Pro in translation accuracy for multiple minor languages.</p>
     * 
     * @param request ImageTranslationPlusAsyncRequest
     * @return ImageTranslationPlusAsyncResponse
     */
    public ImageTranslationPlusAsyncResponse imageTranslationPlusAsync(ImageTranslationPlusAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageTranslationPlusAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The Pro edition of the image translation service is designed specifically for e-commerce images. It integrates multimodal large models to achieve more accurate image understanding, significantly improves translation quality, and continuously expands and optimizes multilingual translation capabilities. It supports over 400 language pairs, including bridged languages.</p>
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images in various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Product subject information protection</strong>: Allows you to specify whether to translate text on the product subject. This helps you protect subject information and prevents embedded information such as product names from being translated.</li>
     * <li><strong>Secondary editing after translation</strong>: Allows you to specify whether to return layout information such as text position, font, and color. This information can be used for secondary editing when you integrate an image editor. The SDK package for the editor is not yet available. Follow platform notifications for updates.</li>
     * <li><strong>Brand name protection</strong>: Allows you to specify whether to translate brand names in images. This helps you protect brand name information from being translated.</li>
     * <li><strong>Translation intervention</strong>: Allows you to customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), and omitting the translation (ABC-null). This is commonly used for scenarios such as brand word protection. You only need to pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention words. If you need a higher quota, contact the platform.  </li>
     * <li>&lt;props=&quot;china&quot;&gt; <strong>Image editor integration</strong>: For details, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image translation editor protocol</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates e-commerce images by using the Pro edition of the image translation service. Integrates multimodal large models to achieve more accurate image understanding, significantly improves translation quality, and continuously expands and optimizes multilingual translation capabilities. Supports over 400 language pairs, including bridged languages.</p>
     * 
     * @param request ImageTranslationProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageTranslationProResponse
     */
    public ImageTranslationProResponse imageTranslationProWithOptions(ImageTranslationProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            body.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            body.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            body.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            body.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useImageEditor)) {
            body.put("UseImageEditor", request.useImageEditor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageTranslationPro"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageTranslationProResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The Pro edition of the image translation service is designed specifically for e-commerce images. It integrates multimodal large models to achieve more accurate image understanding, significantly improves translation quality, and continuously expands and optimizes multilingual translation capabilities. It supports over 400 language pairs, including bridged languages.</p>
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images in various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Product subject information protection</strong>: Allows you to specify whether to translate text on the product subject. This helps you protect subject information and prevents embedded information such as product names from being translated.</li>
     * <li><strong>Secondary editing after translation</strong>: Allows you to specify whether to return layout information such as text position, font, and color. This information can be used for secondary editing when you integrate an image editor. The SDK package for the editor is not yet available. Follow platform notifications for updates.</li>
     * <li><strong>Brand name protection</strong>: Allows you to specify whether to translate brand names in images. This helps you protect brand name information from being translated.</li>
     * <li><strong>Translation intervention</strong>: Allows you to customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), and omitting the translation (ABC-null). This is commonly used for scenarios such as brand word protection. You only need to pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention words. If you need a higher quota, contact the platform.  </li>
     * <li>&lt;props=&quot;china&quot;&gt; <strong>Image editor integration</strong>: For details, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image translation editor protocol</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates e-commerce images by using the Pro edition of the image translation service. Integrates multimodal large models to achieve more accurate image understanding, significantly improves translation quality, and continuously expands and optimizes multilingual translation capabilities. Supports over 400 language pairs, including bridged languages.</p>
     * 
     * @param request ImageTranslationProRequest
     * @return ImageTranslationProResponse
     */
    public ImageTranslationProResponse imageTranslationPro(ImageTranslationProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageTranslationProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p>Product subject information protection: You can specify whether to translate the text on the product subject. This helps you protect the subject information, such as the product name, from being translated.</p>
     * </li>
     * <li><p>Secondary editing after translation: You can specify whether to return layout information such as the position, font, and color of the text. This information can be used for secondary editing when you integrate an image editor. The SDK package for the editor is not yet available. Follow platform notifications for updates.</p>
     * </li>
     * <li><p>Brand name protection: You can specify whether to translate brand names in the image. This helps you protect brand name information from being translated.</p>
     * </li>
     * <li><p>Translation intervention: You can customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), or omitting the translation (ABC-null value). This is commonly used in scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * <h2>Preparations and call process</h2>
     * <p>Image Translation Pro supports both synchronous and asynchronous call methods. This topic describes the asynchronous call API. For synchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/image-translation-pro">Image Translation Pro</a>.
     * The asynchronous APIs for text translation and other capabilities share the same result retrieval process, ApsaraMQ for RocketMQ subscription rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.
     * For the integration process, subscription rules, message formats and encryption protocols, and detailed integration solutions for asynchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Translates images by using Image Translation Pro, which is designed specifically for e-commerce images, integrates multimodal large model technology for more accurate image understanding, significantly improves translation quality, and continuously expands and optimizes multilingual translation capabilities. It supports more than 400 language pairs, including bridged languages.</p>
     * 
     * @param request ImageTranslationProAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageTranslationProAsyncResponse
     */
    public ImageTranslationProAsyncResponse imageTranslationProAsyncWithOptions(ImageTranslationProAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            query.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            query.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useImageEditor)) {
            query.put("UseImageEditor", request.useImageEditor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageTranslationProAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageTranslationProAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p>Product subject information protection: You can specify whether to translate the text on the product subject. This helps you protect the subject information, such as the product name, from being translated.</p>
     * </li>
     * <li><p>Secondary editing after translation: You can specify whether to return layout information such as the position, font, and color of the text. This information can be used for secondary editing when you integrate an image editor. The SDK package for the editor is not yet available. Follow platform notifications for updates.</p>
     * </li>
     * <li><p>Brand name protection: You can specify whether to translate brand names in the image. This helps you protect brand name information from being translated.</p>
     * </li>
     * <li><p>Translation intervention: You can customize translation results, including keeping the original text (ABC-ABC), specifying a translation (ABC-DEF), or omitting the translation (ABC-null value). This is commonly used in scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * <h2>Preparations and call process</h2>
     * <p>Image Translation Pro supports both synchronous and asynchronous call methods. This topic describes the asynchronous call API. For synchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/image-translation-pro">Image Translation Pro</a>.
     * The asynchronous APIs for text translation and other capabilities share the same result retrieval process, ApsaraMQ for RocketMQ subscription rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.
     * For the integration process, subscription rules, message formats and encryption protocols, and detailed integration solutions for asynchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Translates images by using Image Translation Pro, which is designed specifically for e-commerce images, integrates multimodal large model technology for more accurate image understanding, significantly improves translation quality, and continuously expands and optimizes multilingual translation capabilities. It supports more than 400 language pairs, including bridged languages.</p>
     * 
     * @param request ImageTranslationProAsyncRequest
     * @return ImageTranslationProAsyncResponse
     */
    public ImageTranslationProAsyncResponse imageTranslationProAsync(ImageTranslationProAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageTranslationProAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>1. Product Introduction</h1>
     * <p>The image translation product is tailored for e-commerce images, supporting over 400 language pairs (including bridged pairs). It accurately processes complex text layouts within images and ensures that the translated content matches the image context, helping e-commerce platforms and developers easily achieve multilingual conversion and presentation. Additionally, the product returns layer information such as text position, font, and color, facilitating integration with image editors for secondary editing.</p>
     * <h1>2. Scenarios</h1>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h1>3. Features</h1>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: Allows you to specify whether to translate text on the product subject, protecting subject information such as embedded product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to specify whether to translate brand names in the image, protecting brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Secondary editing after translation (layer information)</strong>: Allows you to specify whether to return layer information such as text position, font, and color. This information can be used to integrate with image editors for secondary editing of the translation results. For updates on the availability of the editor SDK, refer to platform notifications.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including no translation (ABC-ABC), specified translation (ABC-DEF), and skipping translation (ABC-null value). This is commonly used for scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API, meeting your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you need more, contact the platform for assistance.<br>&lt;props=&quot;china&quot;&gt;*   <strong>Image editor integration</strong>: For more information, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image Translation Editor Protocol</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates e-commerce images and supports over 400 language pairs, including bridged languages. Accurately processes complex text layouts within images and ensures that the translated content matches the image context, helping e-commerce platforms and developers easily achieve multilingual conversion and presentation of image content. Additionally, returns layer information such as the position, font, and color of text in the image to facilitate secondary editing of translation results in image editors.</p>
     * 
     * @param request ImageTranslationStandardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageTranslationStandardResponse
     */
    public ImageTranslationStandardResponse imageTranslationStandardWithOptions(ImageTranslationStandardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            query.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            query.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useImageEditor)) {
            query.put("UseImageEditor", request.useImageEditor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageTranslationStandard"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageTranslationStandardResponse());
    }

    /**
     * <b>description</b> :
     * <h1>1. Product Introduction</h1>
     * <p>The image translation product is tailored for e-commerce images, supporting over 400 language pairs (including bridged pairs). It accurately processes complex text layouts within images and ensures that the translated content matches the image context, helping e-commerce platforms and developers easily achieve multilingual conversion and presentation. Additionally, the product returns layer information such as text position, font, and color, facilitating integration with image editors for secondary editing.</p>
     * <h1>2. Scenarios</h1>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h1>3. Features</h1>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: Allows you to specify whether to translate text on the product subject, protecting subject information such as embedded product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to specify whether to translate brand names in the image, protecting brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Secondary editing after translation (layer information)</strong>: Allows you to specify whether to return layer information such as text position, font, and color. This information can be used to integrate with image editors for secondary editing of the translation results. For updates on the availability of the editor SDK, refer to platform notifications.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including no translation (ABC-ABC), specified translation (ABC-DEF), and skipping translation (ABC-null value). This is commonly used for scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API, meeting your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you need more, contact the platform for assistance.<br>&lt;props=&quot;china&quot;&gt;*   <strong>Image editor integration</strong>: For more information, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image Translation Editor Protocol</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates e-commerce images and supports over 400 language pairs, including bridged languages. Accurately processes complex text layouts within images and ensures that the translated content matches the image context, helping e-commerce platforms and developers easily achieve multilingual conversion and presentation of image content. Additionally, returns layer information such as the position, font, and color of text in the image to facilitate secondary editing of translation results in image editors.</p>
     * 
     * @param request ImageTranslationStandardRequest
     * @return ImageTranslationStandardResponse
     */
    public ImageTranslationStandardResponse imageTranslationStandard(ImageTranslationStandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageTranslationStandardWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: Allows you to specify whether to translate text on the product subject. This protects the subject information from being translated and prevents embedded information such as product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to specify whether to translate brand names in the image. This protects brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Secondary editing after translation (layer information)</strong>: Allows you to specify whether to return layer information such as text position, font, and color. This information can be used to integrate with image editors for secondary editing of translation results. For updates on the availability of the editor SDK, refer to platform notifications.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including keeping text untranslated (ABC-ABC), specifying translations (ABC-DEF), and omitting translations (ABC-null value). This is commonly used in scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * <h2>Preparations and call process</h2>
     * <ul>
     * <li>Image Translation Standard Edition supports both synchronous and asynchronous calls. This topic describes the asynchronous call API. For synchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/image-translation">Image Translation Standard Edition</a>.   </li>
     * <li>The asynchronous APIs for Image Translation Standard Edition and other features share the result retrieval process, ApsaraMQ for RocketMQ subscription rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.   </li>
     * <li>For the integration process, subscription rules, message formats and encryption protocols, and detailed integration solutions for asynchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates images tailored for e-commerce scenarios, supporting over 400 language directions (including bridged languages), accurately processing complex text layouts within images, and ensuring translated content matches the image context to help e-commerce platforms and developers easily achieve multilingual conversion and presentation of image content. It also returns layer information such as text position, font, and color to facilitate secondary editing of translation results in image editors.</p>
     * 
     * @param request ImageTranslationStandardAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageTranslationStandardAsyncResponse
     */
    public ImageTranslationStandardAsyncResponse imageTranslationStandardAsyncWithOptions(ImageTranslationStandardAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            query.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            query.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useImageEditor)) {
            query.put("UseImageEditor", request.useImageEditor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageTranslationStandardAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageTranslationStandardAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Product subject information protection</strong>: Allows you to specify whether to translate text on the product subject. This protects the subject information from being translated and prevents embedded information such as product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to specify whether to translate brand names in the image. This protects brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Secondary editing after translation (layer information)</strong>: Allows you to specify whether to return layer information such as text position, font, and color. This information can be used to integrate with image editors for secondary editing of translation results. For updates on the availability of the editor SDK, refer to platform notifications.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including keeping text untranslated (ABC-ABC), specifying translations (ABC-DEF), and omitting translations (ABC-null value). This is commonly used in scenarios such as brand word protection. You can implement this by passing the corresponding intervention glossary ID when calling the API, which meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * <h2>Preparations and call process</h2>
     * <ul>
     * <li>Image Translation Standard Edition supports both synchronous and asynchronous calls. This topic describes the asynchronous call API. For synchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/image-translation">Image Translation Standard Edition</a>.   </li>
     * <li>The asynchronous APIs for Image Translation Standard Edition and other features share the result retrieval process, ApsaraMQ for RocketMQ subscription rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.   </li>
     * <li>For the integration process, subscription rules, message formats and encryption protocols, and detailed integration solutions for asynchronous calls, refer to <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates images tailored for e-commerce scenarios, supporting over 400 language directions (including bridged languages), accurately processing complex text layouts within images, and ensuring translated content matches the image context to help e-commerce platforms and developers easily achieve multilingual conversion and presentation of image content. It also returns layer information such as text position, font, and color to facilitate secondary editing of translation results in image editors.</p>
     * 
     * @param request ImageTranslationStandardAsyncRequest
     * @return ImageTranslationStandardAsyncResponse
     */
    public ImageTranslationStandardAsyncResponse imageTranslationStandardAsync(ImageTranslationStandardAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageTranslationStandardAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Product introduction</h1>
     * <p>The high-definition upscaling product is customized for e-commerce images. It intelligently enhances image resolution and details, improves textures and image quality during the upscaling process, and supports high-definition outputs such as 2K and 4K. It meets the high-definition requirements for product main images, detail images, and marketing materials, enabling efficient and clear processing of large batches of images to improve product image quality. (Synchronous)</p>
     * <h1>Scenarios</h1>
     * <ul>
     * <li>High-definition e-commerce product images: Enhances the resolution and details of product main images, detail images, and marketing materials to make textures and materials clearer and improve product display quality.</li>
     * <li>Multi-platform product material adaptation: Upscales existing product images to high definition to meet the image display requirements of different e-commerce platforms and adapt to multi-platform and multi-scenario material usage needs.</li>
     * <li>Batch optimization of existing images: Enhances existing low-resolution product images to high definition, reducing the costs of reshooting and remaking, and improving the reuse efficiency of image materials.</li>
     * </ul>
     * <h1>Features</h1>
     * <ol>
     * <li><p>Intelligent high-definition upscaling: Based on AI image enhancement technology, it improves the resolution and optimizes the details of input images to enhance image clarity and texture representation.</p>
     * </li>
     * <li><p>Multiple upscaling factors: Supports 2x and 4x upscaling factors, allowing flexible selection based on image quality and business requirements.</p>
     * </li>
     * <li><p>Synchronous API calls: Supports synchronous submission of images and retrieval of processing results through APIs, facilitating integration into e-commerce image processing workflows.</p>
     * </li>
     * </ol>
     * <h1>Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Upscaled image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/p7ldzRN3LAP3oqBQ/img/eec1cb9d-d109-480a-8ef1-363f3123c92d.jpeg" alt="Original image.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/p7ldzRN3LAP3oqBQ/img/b45c4d15-15b8-4c9e-ae93-2b0831c191e2.jpeg" alt="Upscaled image.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Upscales e-commerce images by intelligently enhancing resolution and details, improving textures and image quality during the upscaling process. Supports high-definition outputs such as 2K and 4K to meet the requirements for product main images, detail images, and marketing materials, and enables efficient processing of large batches of images to improve overall image quality. (Synchronous)</p>
     * 
     * @param request ImageUpscaleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageUpscaleResponse
     */
    public ImageUpscaleResponse imageUpscaleWithOptions(ImageUpscaleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upscaleFactor)) {
            query.put("UpscaleFactor", request.upscaleFactor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageUpscale"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageUpscaleResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Product introduction</h1>
     * <p>The high-definition upscaling product is customized for e-commerce images. It intelligently enhances image resolution and details, improves textures and image quality during the upscaling process, and supports high-definition outputs such as 2K and 4K. It meets the high-definition requirements for product main images, detail images, and marketing materials, enabling efficient and clear processing of large batches of images to improve product image quality. (Synchronous)</p>
     * <h1>Scenarios</h1>
     * <ul>
     * <li>High-definition e-commerce product images: Enhances the resolution and details of product main images, detail images, and marketing materials to make textures and materials clearer and improve product display quality.</li>
     * <li>Multi-platform product material adaptation: Upscales existing product images to high definition to meet the image display requirements of different e-commerce platforms and adapt to multi-platform and multi-scenario material usage needs.</li>
     * <li>Batch optimization of existing images: Enhances existing low-resolution product images to high definition, reducing the costs of reshooting and remaking, and improving the reuse efficiency of image materials.</li>
     * </ul>
     * <h1>Features</h1>
     * <ol>
     * <li><p>Intelligent high-definition upscaling: Based on AI image enhancement technology, it improves the resolution and optimizes the details of input images to enhance image clarity and texture representation.</p>
     * </li>
     * <li><p>Multiple upscaling factors: Supports 2x and 4x upscaling factors, allowing flexible selection based on image quality and business requirements.</p>
     * </li>
     * <li><p>Synchronous API calls: Supports synchronous submission of images and retrieval of processing results through APIs, facilitating integration into e-commerce image processing workflows.</p>
     * </li>
     * </ol>
     * <h1>Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Upscaled image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/p7ldzRN3LAP3oqBQ/img/eec1cb9d-d109-480a-8ef1-363f3123c92d.jpeg" alt="Original image.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/p7ldzRN3LAP3oqBQ/img/b45c4d15-15b8-4c9e-ae93-2b0831c191e2.jpeg" alt="Upscaled image.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Upscales e-commerce images by intelligently enhancing resolution and details, improving textures and image quality during the upscaling process. Supports high-definition outputs such as 2K and 4K to meet the requirements for product main images, detail images, and marketing materials, and enables efficient processing of large batches of images to improve overall image quality. (Synchronous)</p>
     * 
     * @param request ImageUpscaleRequest
     * @return ImageUpscaleResponse
     */
    public ImageUpscaleResponse imageUpscale(ImageUpscaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageUpscaleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Supports automatic language identification for 31 languages in query phrase scenarios and 35 languages in general scenarios. Applicable to short text such as search terms, titles, and conversations. For supported language directions, refer to the <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports automatic language identification for 31 languages in query scenarios and 35 languages in general scenarios. Applicable to short text such as search terms, titles, and conversations.</p>
     * 
     * @param request LanguageDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LanguageDetectResponse
     */
    public LanguageDetectResponse languageDetectWithOptions(LanguageDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            query.put("SourceText", request.sourceText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LanguageDetect"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LanguageDetectResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Supports automatic language identification for 31 languages in query phrase scenarios and 35 languages in general scenarios. Applicable to short text such as search terms, titles, and conversations. For supported language directions, refer to the <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports automatic language identification for 31 languages in query scenarios and 35 languages in general scenarios. Applicable to short text such as search terms, titles, and conversations.</p>
     * 
     * @param request LanguageDetectRequest
     * @return LanguageDetectResponse
     */
    public LanguageDetectResponse languageDetect(LanguageDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.languageDetectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><p><strong>In-store marketing material compliance inspection</strong>: Automatically determines whether marketing materials (functional card stands, posters, door-shaped display stands, etc.) are placed or posted in the store according to the standard display guidelines issued by headquarters. Identifies typical issues such as &quot;not placed,&quot; &quot;incorrectly placed,&quot; or &quot;content mismatch.&quot;</p>
     * </li>
     * <li><p><strong>New product / campaign material deployment verification</strong>: During new product launches or sales promotions, automatically verifies in batch whether campaign materials have been listed as required based on store photos, replacing manual spot checks.</p>
     * </li>
     * <li><p><strong>Adaptive dual-image comparison and single-image detection</strong>: A single API supports both &quot;reference image + target image&quot; dual-image comparison (Mode A) and &quot;target image only&quot; single-image detection (Mode B). The mode switches automatically based on whether <code>ImageRefer</code> is provided, so callers do not need to differentiate between invocation methods.</p>
     * </li>
     * </ul>
     * <h2><strong>Features</strong></h2>
     * <ul>
     * <li><p><strong>Multi-mode intelligent routing</strong>: Built-in material type parsing capability that automatically identifies the target material type based on <code>Rules</code> natural language text and routes to the corresponding detection pipeline. Callers only need to provide image URLs and rule text. Currently, four detection routing pipelines are supported: &quot;functional card stand,&quot; &quot;poster,&quot; &quot;door-shaped display stand,&quot; and &quot;other materials.&quot; More detection pipelines for specific marketing material types will be added over time.</p>
     * </li>
     * <li><p><strong>MLLM semantic-level understanding + structured rule coordination</strong>: Uses a multimodal large language model for material recognition, content comparison, text OCR, and other semantic-level understanding tasks. Combined with rule cleaning and structured models, natural language rules are decomposed into individually evaluable steps (S1 / S2…), ensuring accuracy while maintaining rule flexibility and traceability.</p>
     * </li>
     * <li><p><strong>Structured inspection conclusion output</strong>: Output follows a unified structure of <code>Result.OverallResult</code> + <code>Result.Steps[]</code> + <code>Result.Evidence</code>. The overall conclusion is derived by logical AND of all steps. Each step is independently visible, making it easy to drive downstream business systems and support case-level manual review traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs. Both single-image (Mode B) and dual-image (Mode A) calling modes are supported, with identical output structures.</p>
     * </li>
     * </ul>
     * <h2><strong>Invocation method</strong></h2>
     * <ul>
     * <li><p><strong>Synchronous call</strong>: A single request returns the detection result without polling. The response follows a unified envelope of <code>Code</code> / <code>Message</code> / <code>RequestId</code> / <code>Success</code> / <code>Data</code>.</p>
     * </li>
     * <li><p><strong>Authentication and signing</strong>: Invoked through the Aidge gateway. Authentication, signing, and common parameters follow the platform\&quot;s unified access method. Refer to the officially published API reference for the exact request path.</p>
     * </li>
     * <li><p><strong>Timeout settings</strong>: Set the request timeout to no less than the maximum response time of the API (refer to the official release for the specific value).</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Material display detection is an intelligent compliance detection capability for in-store marketing materials built on a Multimodal Large Language Model (MLLM), designed for marketing material inspection scenarios in offline retail and channel stores. For standard materials such as functional card stands, posters, and door-shaped display stands, as well as long-tail materials such as light cloth banners, KT boards, floor stickers, and light boxes captured in store photos, the service performs natural-language-level compliance checks based on inspection rules and outputs structured conclusions and evidence descriptions that can be directly integrated with business systems. This is a <strong>synchronous</strong> call that returns results in a single request.</p>
     * 
     * @param request MaterialInspectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MaterialInspectionResponse
     */
    public MaterialInspectionResponse materialInspectionWithOptions(MaterialInspectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRefer)) {
            query.put("ImageRefer", request.imageRefer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaterialInspection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaterialInspectionResponse());
    }

    /**
     * <b>description</b> :
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><p><strong>In-store marketing material compliance inspection</strong>: Automatically determines whether marketing materials (functional card stands, posters, door-shaped display stands, etc.) are placed or posted in the store according to the standard display guidelines issued by headquarters. Identifies typical issues such as &quot;not placed,&quot; &quot;incorrectly placed,&quot; or &quot;content mismatch.&quot;</p>
     * </li>
     * <li><p><strong>New product / campaign material deployment verification</strong>: During new product launches or sales promotions, automatically verifies in batch whether campaign materials have been listed as required based on store photos, replacing manual spot checks.</p>
     * </li>
     * <li><p><strong>Adaptive dual-image comparison and single-image detection</strong>: A single API supports both &quot;reference image + target image&quot; dual-image comparison (Mode A) and &quot;target image only&quot; single-image detection (Mode B). The mode switches automatically based on whether <code>ImageRefer</code> is provided, so callers do not need to differentiate between invocation methods.</p>
     * </li>
     * </ul>
     * <h2><strong>Features</strong></h2>
     * <ul>
     * <li><p><strong>Multi-mode intelligent routing</strong>: Built-in material type parsing capability that automatically identifies the target material type based on <code>Rules</code> natural language text and routes to the corresponding detection pipeline. Callers only need to provide image URLs and rule text. Currently, four detection routing pipelines are supported: &quot;functional card stand,&quot; &quot;poster,&quot; &quot;door-shaped display stand,&quot; and &quot;other materials.&quot; More detection pipelines for specific marketing material types will be added over time.</p>
     * </li>
     * <li><p><strong>MLLM semantic-level understanding + structured rule coordination</strong>: Uses a multimodal large language model for material recognition, content comparison, text OCR, and other semantic-level understanding tasks. Combined with rule cleaning and structured models, natural language rules are decomposed into individually evaluable steps (S1 / S2…), ensuring accuracy while maintaining rule flexibility and traceability.</p>
     * </li>
     * <li><p><strong>Structured inspection conclusion output</strong>: Output follows a unified structure of <code>Result.OverallResult</code> + <code>Result.Steps[]</code> + <code>Result.Evidence</code>. The overall conclusion is derived by logical AND of all steps. Each step is independently visible, making it easy to drive downstream business systems and support case-level manual review traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs. Both single-image (Mode B) and dual-image (Mode A) calling modes are supported, with identical output structures.</p>
     * </li>
     * </ul>
     * <h2><strong>Invocation method</strong></h2>
     * <ul>
     * <li><p><strong>Synchronous call</strong>: A single request returns the detection result without polling. The response follows a unified envelope of <code>Code</code> / <code>Message</code> / <code>RequestId</code> / <code>Success</code> / <code>Data</code>.</p>
     * </li>
     * <li><p><strong>Authentication and signing</strong>: Invoked through the Aidge gateway. Authentication, signing, and common parameters follow the platform\&quot;s unified access method. Refer to the officially published API reference for the exact request path.</p>
     * </li>
     * <li><p><strong>Timeout settings</strong>: Set the request timeout to no less than the maximum response time of the API (refer to the official release for the specific value).</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Material display detection is an intelligent compliance detection capability for in-store marketing materials built on a Multimodal Large Language Model (MLLM), designed for marketing material inspection scenarios in offline retail and channel stores. For standard materials such as functional card stands, posters, and door-shaped display stands, as well as long-tail materials such as light cloth banners, KT boards, floor stickers, and light boxes captured in store photos, the service performs natural-language-level compliance checks based on inspection rules and outputs structured conclusions and evidence descriptions that can be directly integrated with business systems. This is a <strong>synchronous</strong> call that returns results in a single request.</p>
     * 
     * @param request MaterialInspectionRequest
     * @return MaterialInspectionResponse
     */
    public MaterialInspectionResponse materialInspection(MaterialInspectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.materialInspectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><strong>Product Introduction</strong></h2>
     * <p>Display detection is an intelligent product display recognition capability built on a multimodal large language model (MLLM) combined with visual vector recall. It is designed for shelf and floor stack inspection scenarios in offline retail and channel stores. The service takes real photos of store shelves and floor stacks, first uses the MLLM to detect the bounding box and preliminary name of each product, then performs similarity recall against a customer-specific SKU vector library to exactly match each product to the customer\&quot;s own SKUs, and outputs per-product structured results that can be directly integrated with business systems. This service is suitable for large-scale, high-concurrent visual recognition pipelines such as remote display auditing by headquarters, SKU distribution verification, and display compliance inspection for offline stores.</p>
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><p><strong>Shelf/floor stack display recognition and inventory</strong>: Identifies each product in a shelf or floor stack image, matches it to the customer\&quot;s SKU library, and outputs a per-product list (product name + position + similarity score), replacing manual counting.</p>
     * </li>
     * <li><p><strong>Distribution verification/SKU compliance</strong>: Verifies whether a store displays the specified SKUs as required by headquarters and whether any out-of-stock or misplaced items exist. This supports batch automated verification during sales promotions or new product launches.</p>
     * </li>
     * <li><p><strong>Customer-specific SKU library</strong>: Customers can upload their own standard SKU images to build a dedicated vector library (isolated by <code>RagId</code>). During recognition, retrieval is performed only within the corresponding customer library, ensuring name accuracy and data isolation between customers.</p>
     * </li>
     * </ul>
     * <h2><strong>Functions and features</strong></h2>
     * <ul>
     * <li><p><strong>Two-stage detection + retrieval pipeline</strong>: The MLLM detects each product bounding box and preliminary name across the entire image (semantic-level understanding, adapted for dense displays and partial occlusion). Then, visual embedding vectors are used for similarity retrieval within the customer\&quot;s SKU library, and the top-1 precise SKU name overrides the preliminary name, balancing recall rate and name accuracy.</p>
     * </li>
     * <li><p><strong>Isolated retrieval with dedicated vector libraries</strong>: A dedicated SKU vector library is maintained for each customer by <code>RagId</code>. Recognition retrieves only within the corresponding library, ensuring strict isolation between customers. Newly added or updated SKUs take effect in real time.</p>
     * </li>
     * <li><p><strong>Per-product structured output</strong>: Output is unified as <code>Result.Items[]</code>, with each product independently providing a bounding box, recalled SKU name, SKU code, and similarity score. This facilitates direct integration with downstream inventory and verification systems and supports case-level manual review and traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports image URLs accessible over the Internet or through OSS. A single shelf or floor stack image is sufficient for recognition, and the output structure is consistent.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects and identifies products displayed on store shelves or floor stacks by using a multimodal large language model (MLLM) combined with visual vector recall. The service is designed for shelf and floor stack inspection scenarios in offline retail and channel stores. It first uses the MLLM to detect the bounding box and preliminary name of each product in a store photo, then performs similarity recall against a customer-specific SKU vector library to exactly match each product to the customer\&quot;s own SKUs, and outputs per-product structured results that can be directly integrated with business systems. This service is suitable for large-scale, high-concurrent visual recognition pipelines such as remote display auditing by headquarters, SKU distribution verification, and display compliance inspection for offline stores.</p>
     * 
     * @param request MerchandisePlacementDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MerchandisePlacementDetectionResponse
     */
    public MerchandisePlacementDetectionResponse merchandisePlacementDetectionWithOptions(MerchandisePlacementDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ragId)) {
            query.put("RagId", request.ragId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MerchandisePlacementDetection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MerchandisePlacementDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <h2><strong>Product Introduction</strong></h2>
     * <p>Display detection is an intelligent product display recognition capability built on a multimodal large language model (MLLM) combined with visual vector recall. It is designed for shelf and floor stack inspection scenarios in offline retail and channel stores. The service takes real photos of store shelves and floor stacks, first uses the MLLM to detect the bounding box and preliminary name of each product, then performs similarity recall against a customer-specific SKU vector library to exactly match each product to the customer\&quot;s own SKUs, and outputs per-product structured results that can be directly integrated with business systems. This service is suitable for large-scale, high-concurrent visual recognition pipelines such as remote display auditing by headquarters, SKU distribution verification, and display compliance inspection for offline stores.</p>
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><p><strong>Shelf/floor stack display recognition and inventory</strong>: Identifies each product in a shelf or floor stack image, matches it to the customer\&quot;s SKU library, and outputs a per-product list (product name + position + similarity score), replacing manual counting.</p>
     * </li>
     * <li><p><strong>Distribution verification/SKU compliance</strong>: Verifies whether a store displays the specified SKUs as required by headquarters and whether any out-of-stock or misplaced items exist. This supports batch automated verification during sales promotions or new product launches.</p>
     * </li>
     * <li><p><strong>Customer-specific SKU library</strong>: Customers can upload their own standard SKU images to build a dedicated vector library (isolated by <code>RagId</code>). During recognition, retrieval is performed only within the corresponding customer library, ensuring name accuracy and data isolation between customers.</p>
     * </li>
     * </ul>
     * <h2><strong>Functions and features</strong></h2>
     * <ul>
     * <li><p><strong>Two-stage detection + retrieval pipeline</strong>: The MLLM detects each product bounding box and preliminary name across the entire image (semantic-level understanding, adapted for dense displays and partial occlusion). Then, visual embedding vectors are used for similarity retrieval within the customer\&quot;s SKU library, and the top-1 precise SKU name overrides the preliminary name, balancing recall rate and name accuracy.</p>
     * </li>
     * <li><p><strong>Isolated retrieval with dedicated vector libraries</strong>: A dedicated SKU vector library is maintained for each customer by <code>RagId</code>. Recognition retrieves only within the corresponding library, ensuring strict isolation between customers. Newly added or updated SKUs take effect in real time.</p>
     * </li>
     * <li><p><strong>Per-product structured output</strong>: Output is unified as <code>Result.Items[]</code>, with each product independently providing a bounding box, recalled SKU name, SKU code, and similarity score. This facilitates direct integration with downstream inventory and verification systems and supports case-level manual review and traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports image URLs accessible over the Internet or through OSS. A single shelf or floor stack image is sufficient for recognition, and the output structure is consistent.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects and identifies products displayed on store shelves or floor stacks by using a multimodal large language model (MLLM) combined with visual vector recall. The service is designed for shelf and floor stack inspection scenarios in offline retail and channel stores. It first uses the MLLM to detect the bounding box and preliminary name of each product in a store photo, then performs similarity recall against a customer-specific SKU vector library to exactly match each product to the customer\&quot;s own SKUs, and outputs per-product structured results that can be directly integrated with business systems. This service is suitable for large-scale, high-concurrent visual recognition pipelines such as remote display auditing by headquarters, SKU distribution verification, and display compliance inspection for offline stores.</p>
     * 
     * @param request MerchandisePlacementDetectionRequest
     * @return MerchandisePlacementDetectionResponse
     */
    public MerchandisePlacementDetectionResponse merchandisePlacementDetection(MerchandisePlacementDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.merchandisePlacementDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Display product inventory: Aggregates recognized product bounding boxes by SKU for business system statistics.</li>
     * <li>Distribution list verification: Compares the recognized SKU list with the target list on the business side.</li>
     * <li>Single-item location review: Assists in checking recognition results by combining product bounding boxes and visible names.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Aggregation by SKU: Aggregates multiple Boxes for the same SkuId in Products, and skuIds returns a deduplicated list of SKU codes.</li>
     * <li>Supplementary single-item grounding: The multimodal model individually grounds recognizable sales packages and provides confirmable short names.</li>
     * <li>Independent use of two result sets: Products comes from SKU recognition, and grounding comes from supplementary grounding. Grounding does not return SKU codes and does not guarantee item-by-item correspondence with Products.</li>
     * <li>Supports single HTTPS image input. Supplementary grounding returns up to 12 targets, each containing a category, a bounding box, and visible text of up to 24 characters. The coverage field indicates whether the grounding is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects product displays in photos of shelves, endcaps, freezers, display tables, and dump bins by using product SKU recognition and multimodal large model grounding. It aggregates product locations by SKU and supplements the results with visible single-item grounding and short names to facilitate product location display, display inventory, and subsequent distribution verification in business systems.</p>
     * 
     * @param request MerchandisePlacementDetectionLiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MerchandisePlacementDetectionLiteResponse
     */
    public MerchandisePlacementDetectionLiteResponse merchandisePlacementDetectionLiteWithOptions(MerchandisePlacementDetectionLiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MerchandisePlacementDetectionLite"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MerchandisePlacementDetectionLiteResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Display product inventory: Aggregates recognized product bounding boxes by SKU for business system statistics.</li>
     * <li>Distribution list verification: Compares the recognized SKU list with the target list on the business side.</li>
     * <li>Single-item location review: Assists in checking recognition results by combining product bounding boxes and visible names.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Aggregation by SKU: Aggregates multiple Boxes for the same SkuId in Products, and skuIds returns a deduplicated list of SKU codes.</li>
     * <li>Supplementary single-item grounding: The multimodal model individually grounds recognizable sales packages and provides confirmable short names.</li>
     * <li>Independent use of two result sets: Products comes from SKU recognition, and grounding comes from supplementary grounding. Grounding does not return SKU codes and does not guarantee item-by-item correspondence with Products.</li>
     * <li>Supports single HTTPS image input. Supplementary grounding returns up to 12 targets, each containing a category, a bounding box, and visible text of up to 24 characters. The coverage field indicates whether the grounding is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects product displays in photos of shelves, endcaps, freezers, display tables, and dump bins by using product SKU recognition and multimodal large model grounding. It aggregates product locations by SKU and supplements the results with visible single-item grounding and short names to facilitate product location display, display inventory, and subsequent distribution verification in business systems.</p>
     * 
     * @param request MerchandisePlacementDetectionLiteRequest
     * @return MerchandisePlacementDetectionLiteResponse
     */
    public MerchandisePlacementDetectionLiteResponse merchandisePlacementDetectionLite(MerchandisePlacementDetectionLiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.merchandisePlacementDetectionLiteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Beverage display recognition: Uses default rules for the Genki Forest business type to recognize visible beverage products.</li>
     * <li>Custom detection rules: Specifies product recognition tasks that comply with output constraints through the rule parameter.</li>
     * <li>Product location display: Uses per-product names and bounding boxes for display, statistics, or manual review.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Direct product recognition: Each product outputs a bounding box and a name. The name is returned as unknown if it cannot be determined.</li>
     * <li>Two rule entry points: A non-empty rule takes priority. If no valid rule is provided, the type must be set to Genki Forest.</li>
     * <li>Unified result validation: Bounding box coordinates are converted to integers and restricted to the range 0–1000. Reversed coordinates are swapped. Missing names default to unknown. The entire batch fails if any item is not a valid product object, has an invalid bounding box, or has no area.</li>
     * <li>Result scope: Currently outputs detected names and positions only. Vector library recall, SKU codes, and similarity scores are not included.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects the positions and names of visible products in an image based on a dedicated visual model. The product supports default recognition rules for the Genki Forest business type and custom rules provided by the invoker. It outputs per-product positions and names, applicable to beverage display inspection and product location display.</p>
     * 
     * @param request MerchandisePlacementDetectionProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MerchandisePlacementDetectionProResponse
     */
    public MerchandisePlacementDetectionProResponse merchandisePlacementDetectionProWithOptions(MerchandisePlacementDetectionProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MerchandisePlacementDetectionPro"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MerchandisePlacementDetectionProResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Beverage display recognition: Uses default rules for the Genki Forest business type to recognize visible beverage products.</li>
     * <li>Custom detection rules: Specifies product recognition tasks that comply with output constraints through the rule parameter.</li>
     * <li>Product location display: Uses per-product names and bounding boxes for display, statistics, or manual review.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Direct product recognition: Each product outputs a bounding box and a name. The name is returned as unknown if it cannot be determined.</li>
     * <li>Two rule entry points: A non-empty rule takes priority. If no valid rule is provided, the type must be set to Genki Forest.</li>
     * <li>Unified result validation: Bounding box coordinates are converted to integers and restricted to the range 0–1000. Reversed coordinates are swapped. Missing names default to unknown. The entire batch fails if any item is not a valid product object, has an invalid bounding box, or has no area.</li>
     * <li>Result scope: Currently outputs detected names and positions only. Vector library recall, SKU codes, and similarity scores are not included.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects the positions and names of visible products in an image based on a dedicated visual model. The product supports default recognition rules for the Genki Forest business type and custom rules provided by the invoker. It outputs per-product positions and names, applicable to beverage display inspection and product location display.</p>
     * 
     * @param request MerchandisePlacementDetectionProRequest
     * @return MerchandisePlacementDetectionProResponse
     */
    public MerchandisePlacementDetectionProResponse merchandisePlacementDetectionPro(MerchandisePlacementDetectionProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.merchandisePlacementDetectionProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Store price collection: Reads the recognized selling prices and available original prices of price tags.</li>
     * <li>Price execution verification: Compares the recognized prices with the business-side price list.</li>
     * <li>Manual price tag review: Locates paper, electronic, and promotional price tags to facilitate reviewing the original images.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Structured price output: Returns the product name, code, price, and location item by item. Prices are retained as strings.</li>
     * <li>Multi-type price tag localization: Covers common paper price tags, electronic price tags, and promotional signs with clear selling prices.</li>
     * <li>Original text and location-assisted review: Prioritizes extracting clear selling prices from located text, leaving it empty if unreadable. Supplementary localization does not infer that a price tag necessarily corresponds to a specific SKU based on its location.</li>
     * <li>Supports single HTTPS image input. Supplementary localization returns up to 12 targets, each containing a category, a bounding box, and up to 24 characters of visible text, and indicates whether the localization is complete through coverage.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects display price tags based on price tag recognition and multimodal large model localization, extracting product information, selling prices, original prices, and locations, while providing visible bounding boxes for paper price tags, electronic price tags, and promotional price signs for store price collection, price tag inspection, and business-side price verification.</p>
     * 
     * @param request MerchandisePriceTagDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MerchandisePriceTagDetectionResponse
     */
    public MerchandisePriceTagDetectionResponse merchandisePriceTagDetectionWithOptions(MerchandisePriceTagDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MerchandisePriceTagDetection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MerchandisePriceTagDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Store price collection: Reads the recognized selling prices and available original prices of price tags.</li>
     * <li>Price execution verification: Compares the recognized prices with the business-side price list.</li>
     * <li>Manual price tag review: Locates paper, electronic, and promotional price tags to facilitate reviewing the original images.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Structured price output: Returns the product name, code, price, and location item by item. Prices are retained as strings.</li>
     * <li>Multi-type price tag localization: Covers common paper price tags, electronic price tags, and promotional signs with clear selling prices.</li>
     * <li>Original text and location-assisted review: Prioritizes extracting clear selling prices from located text, leaving it empty if unreadable. Supplementary localization does not infer that a price tag necessarily corresponds to a specific SKU based on its location.</li>
     * <li>Supports single HTTPS image input. Supplementary localization returns up to 12 targets, each containing a category, a bounding box, and up to 24 characters of visible text, and indicates whether the localization is complete through coverage.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects display price tags based on price tag recognition and multimodal large model localization, extracting product information, selling prices, original prices, and locations, while providing visible bounding boxes for paper price tags, electronic price tags, and promotional price signs for store price collection, price tag inspection, and business-side price verification.</p>
     * 
     * @param request MerchandisePriceTagDetectionRequest
     * @return MerchandisePriceTagDetectionResponse
     */
    public MerchandisePriceTagDetectionResponse merchandisePriceTagDetection(MerchandisePriceTagDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.merchandisePriceTagDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Display facility inspection: identifies facilities such as shelves, endcaps, floor displays, upright refrigerators, and chest freezers.</li>
     * <li>Display metric verification: reads active metrics such as proportion, purity, and plumpness for further evaluation by business systems.</li>
     * <li>Display area visualization: displays area locations and overall facility bounding boxes on the original image.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Scene structured output: returns scene names, center points, area contours, and active metrics.</li>
     * <li>Holistic facility positioning: uses one bounding box for an independent facility or floor display, which is suitable for overall area review.</li>
     * <li>Retains two types of coordinates: the positions in scenes retain the original normalization coordinates of the recognition service, while grounding uses 0–1000 integer bounding boxes.</li>
     * <li>Supports a single HTTPS image as input. The supplementary positioning returns up to 12 targets. Each target includes a category, a bounding box, and up to 24 characters of visible text, and uses coverage to indicate whether the positioning is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects store displays based on display scene recognition and holistic positioning powered by multimodal large models. This product identifies display areas such as shelves, refrigerators, and floor displays, and outputs available scene names, locations, and display metrics. It also provides overall facility bounding boxes, making it suitable for display facility inspection, area visualization, and display metric verification.</p>
     * 
     * @param request MerchandiseSceneDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MerchandiseSceneDetectionResponse
     */
    public MerchandiseSceneDetectionResponse merchandiseSceneDetectionWithOptions(MerchandiseSceneDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MerchandiseSceneDetection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MerchandiseSceneDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Display facility inspection: identifies facilities such as shelves, endcaps, floor displays, upright refrigerators, and chest freezers.</li>
     * <li>Display metric verification: reads active metrics such as proportion, purity, and plumpness for further evaluation by business systems.</li>
     * <li>Display area visualization: displays area locations and overall facility bounding boxes on the original image.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Scene structured output: returns scene names, center points, area contours, and active metrics.</li>
     * <li>Holistic facility positioning: uses one bounding box for an independent facility or floor display, which is suitable for overall area review.</li>
     * <li>Retains two types of coordinates: the positions in scenes retain the original normalization coordinates of the recognition service, while grounding uses 0–1000 integer bounding boxes.</li>
     * <li>Supports a single HTTPS image as input. The supplementary positioning returns up to 12 targets. Each target includes a category, a bounding box, and up to 24 characters of visible text, and uses coverage to indicate whether the positioning is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects store displays based on display scene recognition and holistic positioning powered by multimodal large models. This product identifies display areas such as shelves, refrigerators, and floor displays, and outputs available scene names, locations, and display metrics. It also provides overall facility bounding boxes, making it suitable for display facility inspection, area visualization, and display metric verification.</p>
     * 
     * @param request MerchandiseSceneDetectionRequest
     * @return MerchandiseSceneDetectionResponse
     */
    public MerchandiseSceneDetectionResponse merchandiseSceneDetection(MerchandiseSceneDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.merchandiseSceneDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features</h2>
     * <ul>
     * <li>Recapture binary classification: isFake=true indicates a recapture, and false indicates a non-recapture. Element localization is performed for both results.</li>
     * <li>Milk powder subject and bottom code localization: Prioritizes the localization of the milk powder subject. Adds corresponding bounding boxes when the can bottom, spray code, batch code, or traceability code areas are clear.</li>
     * <li>Visible information output: Outputs only confirmed short names or text without guessing blurred code values. Localization results do not change the recapture conclusion.</li>
     * <li>Supports a single HTTPS image input. The supplementary localization returns up to 12 targets. Each target includes a category, a bounding box, and up to 24 characters of visible text. The coverage field indicates whether the localization is complete.</li>
     * </ul>
     * <h2>Scenarios:</h2>
     * <ul>
     * <li>Can bottom code photo review: Determines whether a photo of a milk powder can bottom code has a recapture risk.</li>
     * <li>Milk powder product inspection: Localizes canned, boxed, or bagged milk powder, as well as clearly visible can bottoms and bottom codes.</li>
     * <li>Review result playback: Displays target bounding boxes on the original image to assist personnel in verifying the photo content.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reviews images of milk powder can bottom codes by using recapture detection and multimodal large model-based element localization. The service determines whether an uploaded photo is recaptured and localizes visible milk powder products, can bottoms, and bottom code areas. It is suitable for milk powder channel inspections, can bottom code photo reviews, and manual verifications.</p>
     * 
     * @param request MilkPowderCanBottomCodeRephotographyDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MilkPowderCanBottomCodeRephotographyDetectionResponse
     */
    public MilkPowderCanBottomCodeRephotographyDetectionResponse milkPowderCanBottomCodeRephotographyDetectionWithOptions(MilkPowderCanBottomCodeRephotographyDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MilkPowderCanBottomCodeRephotographyDetection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MilkPowderCanBottomCodeRephotographyDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features</h2>
     * <ul>
     * <li>Recapture binary classification: isFake=true indicates a recapture, and false indicates a non-recapture. Element localization is performed for both results.</li>
     * <li>Milk powder subject and bottom code localization: Prioritizes the localization of the milk powder subject. Adds corresponding bounding boxes when the can bottom, spray code, batch code, or traceability code areas are clear.</li>
     * <li>Visible information output: Outputs only confirmed short names or text without guessing blurred code values. Localization results do not change the recapture conclusion.</li>
     * <li>Supports a single HTTPS image input. The supplementary localization returns up to 12 targets. Each target includes a category, a bounding box, and up to 24 characters of visible text. The coverage field indicates whether the localization is complete.</li>
     * </ul>
     * <h2>Scenarios:</h2>
     * <ul>
     * <li>Can bottom code photo review: Determines whether a photo of a milk powder can bottom code has a recapture risk.</li>
     * <li>Milk powder product inspection: Localizes canned, boxed, or bagged milk powder, as well as clearly visible can bottoms and bottom codes.</li>
     * <li>Review result playback: Displays target bounding boxes on the original image to assist personnel in verifying the photo content.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reviews images of milk powder can bottom codes by using recapture detection and multimodal large model-based element localization. The service determines whether an uploaded photo is recaptured and localizes visible milk powder products, can bottoms, and bottom code areas. It is suitable for milk powder channel inspections, can bottom code photo reviews, and manual verifications.</p>
     * 
     * @param request MilkPowderCanBottomCodeRephotographyDetectionRequest
     * @return MilkPowderCanBottomCodeRephotographyDetectionResponse
     */
    public MilkPowderCanBottomCodeRephotographyDetectionResponse milkPowderCanBottomCodeRephotographyDetection(MilkPowderCanBottomCodeRephotographyDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.milkPowderCanBottomCodeRephotographyDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Features</h2>
     * <ul>
     * <li>Three-state recapture detection: When photoStatus is 0, 1, or 2, it indicates non-recapture, recapture, or suspected recapture, respectively. The isFake, isSuspect, and score fields are also returned.</li>
     * <li>Subject and code area grounding: Prioritizes the grounding of individual milk powder products and outer boxes, and supplements clear box codes, barcodes, and QR code areas. The milk powder subject can still be grounded even if no box code is present.</li>
     * <li>Result coordination: Element grounding supplements visible targets without changing the recapture detection conclusion. It does not decode QR codes or provide product authenticity verification.</li>
     * <li>Supports a single HTTPS image as input. The supplementary grounding returns up to 12 targets. Each target includes a category, a bounding box, and up to 24 characters of visible text. The coverage field indicates whether the grounding is complete.</li>
     * </ul>
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Box code photo review: Checks whether milk powder outer box photos uploaded by stores or channels carry recapture risks.</li>
     * <li>Milk powder display inspection: Locates visible individual milk powder products, full boxes, and clear code areas in photos.</li>
     * <li>Suspected sample review: Filters images that require manual verification based on the suspected status, algorithm score, and bounding boxes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reviews infant formula carton code images based on recapture detection and element localization using multimodal foundation models. It targets photos of infant formula products, outer cartons, and carton codes captured during channel inspections. It determines whether images are non-recaptured, recaptured, or suspected recaptures, and localizes visible infant formula products, outer cartons, and code regions to provide a structured basis for image review and manual verification.</p>
     * 
     * @param request MilkPowderCartonCodeRephotographyDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MilkPowderCartonCodeRephotographyDetectionResponse
     */
    public MilkPowderCartonCodeRephotographyDetectionResponse milkPowderCartonCodeRephotographyDetectionWithOptions(MilkPowderCartonCodeRephotographyDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MilkPowderCartonCodeRephotographyDetection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MilkPowderCartonCodeRephotographyDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Features</h2>
     * <ul>
     * <li>Three-state recapture detection: When photoStatus is 0, 1, or 2, it indicates non-recapture, recapture, or suspected recapture, respectively. The isFake, isSuspect, and score fields are also returned.</li>
     * <li>Subject and code area grounding: Prioritizes the grounding of individual milk powder products and outer boxes, and supplements clear box codes, barcodes, and QR code areas. The milk powder subject can still be grounded even if no box code is present.</li>
     * <li>Result coordination: Element grounding supplements visible targets without changing the recapture detection conclusion. It does not decode QR codes or provide product authenticity verification.</li>
     * <li>Supports a single HTTPS image as input. The supplementary grounding returns up to 12 targets. Each target includes a category, a bounding box, and up to 24 characters of visible text. The coverage field indicates whether the grounding is complete.</li>
     * </ul>
     * <h2>Scenarios</h2>
     * <ul>
     * <li>Box code photo review: Checks whether milk powder outer box photos uploaded by stores or channels carry recapture risks.</li>
     * <li>Milk powder display inspection: Locates visible individual milk powder products, full boxes, and clear code areas in photos.</li>
     * <li>Suspected sample review: Filters images that require manual verification based on the suspected status, algorithm score, and bounding boxes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reviews infant formula carton code images based on recapture detection and element localization using multimodal foundation models. It targets photos of infant formula products, outer cartons, and carton codes captured during channel inspections. It determines whether images are non-recaptured, recaptured, or suspected recaptures, and localizes visible infant formula products, outer cartons, and code regions to provide a structured basis for image review and manual verification.</p>
     * 
     * @param request MilkPowderCartonCodeRephotographyDetectionRequest
     * @return MilkPowderCartonCodeRephotographyDetectionResponse
     */
    public MilkPowderCartonCodeRephotographyDetectionResponse milkPowderCartonCodeRephotographyDetection(MilkPowderCartonCodeRephotographyDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.milkPowderCartonCodeRephotographyDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms. It targets automated compliance review for the &quot;piece-weight-dimension&quot; stage in e-commerce logistics. The product performs structured review across multiple dimensions, including <strong>bounding box validity, bounding box fit, and foreign object interference</strong> for parcels on scanning platforms. It supports different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese-language reason descriptions that can be directly integrated with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * <h2>Scenarios</h2>
     * <ol>
     * <li><strong>Parcel bounding box review</strong>: Automatically determines whether the operator\&quot;s manual bounding box constitutes the &quot;minimum effective border rectangle&quot; for the parcel, and identifies typical issues such as oversized or undersized bounding boxes.</li>
     * <li><strong>Foreign object interference detection</strong>: Automatically detects whether non-target objects such as fingers, keyboards, or supporting tools are present in the scanning area.</li>
     * <li><strong>Multi-capture environment adaptation</strong>: A single API can handle two common capture patterns — white background board (blue box) and green background board (blue box \+ red box) — without requiring the caller to distinguish between scenarios.</li>
     * <li><strong>Inbound quality inspection pipeline</strong>: Used for automated compliance review in the piece-weight-dimension stage of the logistics warehouse new product inbound SOP, as a replacement for or supplement to outsourced manual review.
     * The product is also applicable to general image &quot;box-subject&quot; relationship review scenarios, such as product photo material review and document scan quality verification.</li>
     * </ol>
     * <h2>Features</h2>
     * <ol>
     * <li><strong>Multi-scenario intelligent routing</strong>: The product has built-in scenario classification capabilities. It automatically identifies the background type (white/green) and bounding box type (none/single box/double box) in the image, and routes the request to the corresponding review sub-process. The caller only needs to pass in the image URL without manually specifying the scenario.</li>
     * <li><strong>MLLM + dedicated CV model collaboration</strong>: A multimodal large language model performs semantic-level scenario understanding and foreign object recognition, while a dedicated parcel segmentation and IoU evaluation model performs pixel-level bounding box fit quantification. This ensures accuracy while controlling inference latency and cost.</li>
     * <li><strong>Structured review conclusions</strong>: The output is unified as a <code>result</code> (Boolean) \+ <code>info</code> (Chinese-language reason) structure. Supported reason types include &quot;审核通过&quot; (review passed), &quot;审核不通过:框选过大&quot; (review failed: bounding box too large), &quot;审核不通过:框选过小&quot; (review failed: bounding box too small), and &quot;审核不通过:存在异物&quot; (review failed: foreign object detected), enabling direct integration with downstream business systems.</li>
     * <li><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms. It targets automated compliance review for the &quot;piece-weight-dimension&quot; stage in e-commerce logistics. The product performs structured review across multiple dimensions, including bounding box validity, bounding box fit, and foreign object interference for parcels on scanning platforms. It supports different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese-language reason descriptions that can be directly integrated with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * 
     * @param request PackageWeightSizeCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PackageWeightSizeCheckResponse
     */
    public PackageWeightSizeCheckResponse packageWeightSizeCheckWithOptions(PackageWeightSizeCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotatedImageUrl)) {
            query.put("AnnotatedImageUrl", request.annotatedImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawImageUrl)) {
            query.put("RawImageUrl", request.rawImageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PackageWeightSizeCheck"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PackageWeightSizeCheckResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms. It targets automated compliance review for the &quot;piece-weight-dimension&quot; stage in e-commerce logistics. The product performs structured review across multiple dimensions, including <strong>bounding box validity, bounding box fit, and foreign object interference</strong> for parcels on scanning platforms. It supports different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese-language reason descriptions that can be directly integrated with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * <h2>Scenarios</h2>
     * <ol>
     * <li><strong>Parcel bounding box review</strong>: Automatically determines whether the operator\&quot;s manual bounding box constitutes the &quot;minimum effective border rectangle&quot; for the parcel, and identifies typical issues such as oversized or undersized bounding boxes.</li>
     * <li><strong>Foreign object interference detection</strong>: Automatically detects whether non-target objects such as fingers, keyboards, or supporting tools are present in the scanning area.</li>
     * <li><strong>Multi-capture environment adaptation</strong>: A single API can handle two common capture patterns — white background board (blue box) and green background board (blue box \+ red box) — without requiring the caller to distinguish between scenarios.</li>
     * <li><strong>Inbound quality inspection pipeline</strong>: Used for automated compliance review in the piece-weight-dimension stage of the logistics warehouse new product inbound SOP, as a replacement for or supplement to outsourced manual review.
     * The product is also applicable to general image &quot;box-subject&quot; relationship review scenarios, such as product photo material review and document scan quality verification.</li>
     * </ol>
     * <h2>Features</h2>
     * <ol>
     * <li><strong>Multi-scenario intelligent routing</strong>: The product has built-in scenario classification capabilities. It automatically identifies the background type (white/green) and bounding box type (none/single box/double box) in the image, and routes the request to the corresponding review sub-process. The caller only needs to pass in the image URL without manually specifying the scenario.</li>
     * <li><strong>MLLM + dedicated CV model collaboration</strong>: A multimodal large language model performs semantic-level scenario understanding and foreign object recognition, while a dedicated parcel segmentation and IoU evaluation model performs pixel-level bounding box fit quantification. This ensures accuracy while controlling inference latency and cost.</li>
     * <li><strong>Structured review conclusions</strong>: The output is unified as a <code>result</code> (Boolean) \+ <code>info</code> (Chinese-language reason) structure. Supported reason types include &quot;审核通过&quot; (review passed), &quot;审核不通过:框选过大&quot; (review failed: bounding box too large), &quot;审核不通过:框选过小&quot; (review failed: bounding box too small), and &quot;审核不通过:存在异物&quot; (review failed: foreign object detected), enabling direct integration with downstream business systems.</li>
     * <li><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms. It targets automated compliance review for the &quot;piece-weight-dimension&quot; stage in e-commerce logistics. The product performs structured review across multiple dimensions, including bounding box validity, bounding box fit, and foreign object interference for parcels on scanning platforms. It supports different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese-language reason descriptions that can be directly integrated with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * 
     * @param request PackageWeightSizeCheckRequest
     * @return PackageWeightSizeCheckResponse
     */
    public PackageWeightSizeCheckResponse packageWeightSizeCheck(PackageWeightSizeCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.packageWeightSizeCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>宠物健康分析</p>
     * 
     * @param tmpReq PetHealthAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PetHealthAnalysisResponse
     */
    public PetHealthAnalysisResponse petHealthAnalysisWithOptions(PetHealthAnalysisRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PetHealthAnalysisShrinkRequest request = new PetHealthAnalysisShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageUrl)) {
            request.imageUrlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageUrl, "ImageUrl", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlShrink)) {
            query.put("ImageUrl", request.imageUrlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemPrompt)) {
            query.put("SystemPrompt", request.systemPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrompt)) {
            query.put("UserPrompt", request.userPrompt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PetHealthAnalysis"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PetHealthAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>宠物健康分析</p>
     * 
     * @param request PetHealthAnalysisRequest
     * @return PetHealthAnalysisResponse
     */
    public PetHealthAnalysisResponse petHealthAnalysis(PetHealthAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.petHealthAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion\+ high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 100 language directions (including bridged translations), especially Chinese-English, Chinese-to-multilingual, and English-to-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT large model translation accurately translates phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco MT large model translation supports long text translation and HTML formatting, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are typically short and may contain e-commerce-specific terms such as model numbers and specifications.</li>
     * <li>Customer service conversations: In customer service scenarios, the model optimizes issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Marco MT large model translation can also be used for general-purpose translation scenarios, such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong> Marco MT large model translation supports mutual translation among more than 100 languages and language detection for 23 languages. For specific language directions, refer to the language mapping table in Section 5.6.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong> Marco MT large model translation is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it delivers faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong> Currently supports text and html text types.</li>
     * <li><strong>Translation intervention support</strong> Supports custom translation results, including do-not-translate (ABC→ABC), specified translation (ABC→DEF), and skip translation (ABC→empty value). This is commonly used for scenarios such as brand name protection. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
     * </ul>
     * <h2>Translation quality comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source text</strong></th>
     * <th><strong>Aidge translation</strong></th>
     * <th><strong>Other translation product 1</strong></th>
     * <th><strong>Other translation product 2</strong></th>
     * <th><strong>Aidge translation advantage</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960 Cooling Fan for Zotac GTX960 Graphics Card Cooling Fan</td>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960, ventilador de enfriamiento para tarjeta gráfica Zotac GTX960.</td>
     * <td>Ventilador de refrigeración de 75mm 4Pin 0.38A GA81S2U 12V para la tarjeta gráfica Zotac GTX960 Ventilador de enfriamiento GTX 960.</td>
     * <td>Ventilador de refrigeración para tarjeta gráfica Zotac GTX960, 75mm, 4 pines, 0,38A, GA81S2U, 12V, GTX 960</td>
     * <td>Clearer product subject</td>
     * </tr>
     * <tr>
     * <td>New Arrival Classic Style Luxury Brand 6 Hands Swiss Automatic Mechanical Men\&quot;s Business Steel Watch</td>
     * <td>Nueva llegada, reloj mecánico automático de lujo con 6 manecillas, estilo clásico, de acero para hombres de negocios</td>
     * <td>Nueva Llegada Reloj De Acero de Negocios para Hombre con Mecanismo Automático Suizo y 6 Agujas de Estilo Clásico de Marca de Lujo.</td>
     * <td>Reloj de acero de negocios para hombre, mecánico automático suizo, marca de lujo, estilo clásico, 6 manos, nueva llegada</td>
     * <td>More complete sentence structure, clearer expression, and more reasonable segmentation</td>
     * </tr>
     * <tr>
     * <td>Men Key Bag Genuine Cow Leather Buckets Key Cases Pouch Zipper Keychain Auto Car Key Case Women Home Key Holder Wallet</td>
     * <td>Sac à clés pour hommes en cuir de vache véritable, étuis à clés, pochette à fermeture éclair, porte-clés, étui à clé de voiture, porte-clés pour femmes, organisateur de portefeuille</td>
     * <td>Porte-clés sac en cuir de vache véritable, étuis à clés en forme de seau, pochette à fermeture éclair, porte-clés auto pour voiture, étui à clés pour femmes, organisateur de clés de maison, portefeuille.</td>
     * <td>Hommes porte-clés en cuir de vache véritable sac/pochette fermature éclair porte-clés Auto voiture porte-clés femmes maison porte-clés organisateur portefeuille</td>
     * <td>Clearer and more accurate product subject description — correctly identifies &quot;key bag&quot; rather than &quot;keychain.&quot; Other translations may cause ambiguity about the product subject</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Maas-MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 400 language directions (including bridged translations), especially Chinese-English, Chinese-to-multilingual, and English-to-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
     * 
     * @param tmpReq PrepaidTextTranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrepaidTextTranslateResponse
     */
    public PrepaidTextTranslateResponse prepaidTextTranslateWithOptions(PrepaidTextTranslateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PrepaidTextTranslateShrinkRequest request = new PrepaidTextTranslateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTextList)) {
            request.sourceTextListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTextList, "SourceTextList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            body.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTextListShrink)) {
            body.put("SourceTextList", request.sourceTextListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateScene)) {
            body.put("TranslateScene", request.translateScene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrepaidTextTranslate"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrepaidTextTranslateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion\+ high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 100 language directions (including bridged translations), especially Chinese-English, Chinese-to-multilingual, and English-to-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT large model translation accurately translates phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco MT large model translation supports long text translation and HTML formatting, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are typically short and may contain e-commerce-specific terms such as model numbers and specifications.</li>
     * <li>Customer service conversations: In customer service scenarios, the model optimizes issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Marco MT large model translation can also be used for general-purpose translation scenarios, such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong> Marco MT large model translation supports mutual translation among more than 100 languages and language detection for 23 languages. For specific language directions, refer to the language mapping table in Section 5.6.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong> Marco MT large model translation is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it delivers faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong> Currently supports text and html text types.</li>
     * <li><strong>Translation intervention support</strong> Supports custom translation results, including do-not-translate (ABC→ABC), specified translation (ABC→DEF), and skip translation (ABC→empty value). This is commonly used for scenarios such as brand name protection. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
     * </ul>
     * <h2>Translation quality comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source text</strong></th>
     * <th><strong>Aidge translation</strong></th>
     * <th><strong>Other translation product 1</strong></th>
     * <th><strong>Other translation product 2</strong></th>
     * <th><strong>Aidge translation advantage</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960 Cooling Fan for Zotac GTX960 Graphics Card Cooling Fan</td>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960, ventilador de enfriamiento para tarjeta gráfica Zotac GTX960.</td>
     * <td>Ventilador de refrigeración de 75mm 4Pin 0.38A GA81S2U 12V para la tarjeta gráfica Zotac GTX960 Ventilador de enfriamiento GTX 960.</td>
     * <td>Ventilador de refrigeración para tarjeta gráfica Zotac GTX960, 75mm, 4 pines, 0,38A, GA81S2U, 12V, GTX 960</td>
     * <td>Clearer product subject</td>
     * </tr>
     * <tr>
     * <td>New Arrival Classic Style Luxury Brand 6 Hands Swiss Automatic Mechanical Men\&quot;s Business Steel Watch</td>
     * <td>Nueva llegada, reloj mecánico automático de lujo con 6 manecillas, estilo clásico, de acero para hombres de negocios</td>
     * <td>Nueva Llegada Reloj De Acero de Negocios para Hombre con Mecanismo Automático Suizo y 6 Agujas de Estilo Clásico de Marca de Lujo.</td>
     * <td>Reloj de acero de negocios para hombre, mecánico automático suizo, marca de lujo, estilo clásico, 6 manos, nueva llegada</td>
     * <td>More complete sentence structure, clearer expression, and more reasonable segmentation</td>
     * </tr>
     * <tr>
     * <td>Men Key Bag Genuine Cow Leather Buckets Key Cases Pouch Zipper Keychain Auto Car Key Case Women Home Key Holder Wallet</td>
     * <td>Sac à clés pour hommes en cuir de vache véritable, étuis à clés, pochette à fermeture éclair, porte-clés, étui à clé de voiture, porte-clés pour femmes, organisateur de portefeuille</td>
     * <td>Porte-clés sac en cuir de vache véritable, étuis à clés en forme de seau, pochette à fermeture éclair, porte-clés auto pour voiture, étui à clés pour femmes, organisateur de clés de maison, portefeuille.</td>
     * <td>Hommes porte-clés en cuir de vache véritable sac/pochette fermature éclair porte-clés Auto voiture porte-clés femmes maison porte-clés organisateur portefeuille</td>
     * <td>Clearer and more accurate product subject description — correctly identifies &quot;key bag&quot; rather than &quot;keychain.&quot; Other translations may cause ambiguity about the product subject</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Maas-MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 400 language directions (including bridged translations), especially Chinese-English, Chinese-to-multilingual, and English-to-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
     * 
     * @param request PrepaidTextTranslateRequest
     * @return PrepaidTextTranslateResponse
     */
    public PrepaidTextTranslateResponse prepaidTextTranslate(PrepaidTextTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.prepaidTextTranslateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p><strong>Before you use this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the product hotzone recognition feature.</strong>
     * This operation automatically identifies and locates specified products in a target scene image based on the provided target scene image and product reference images, and returns the product names and normalized bounding boxes. Each request accepts one target scene image and a set of product reference images. If the same case contains multiple target images, call this operation separately for each target image.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Image URLs must use HTTPS and must be accessible by the server.</li>
     * <li>Common image formats such as JPEG, PNG, and WebP are supported.</li>
     * <li>Each image should not exceed 2 MB.</li>
     * <li>When using signed URLs, set the validity period to at least 30 minutes.</li>
     * <li>If the same case contains multiple target scene images, call this operation separately for each target image. The reference image list can be reused.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Automatically identifies and locates specified products in an image based on a multimodal foundation model.</p>
     * 
     * @param tmpReq ProductHotspotDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProductHotspotDetectionResponse
     */
    public ProductHotspotDetectionResponse productHotspotDetectionWithOptions(ProductHotspotDetectionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ProductHotspotDetectionShrinkRequest request = new ProductHotspotDetectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.referenceImageUrls)) {
            request.referenceImageUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.referenceImageUrls, "ReferenceImageUrls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.referenceImageUrlsShrink)) {
            query.put("ReferenceImageUrls", request.referenceImageUrlsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetImageUrl)) {
            query.put("TargetImageUrl", request.targetImageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProductHotspotDetection"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProductHotspotDetectionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p><strong>Before you use this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the product hotzone recognition feature.</strong>
     * This operation automatically identifies and locates specified products in a target scene image based on the provided target scene image and product reference images, and returns the product names and normalized bounding boxes. Each request accepts one target scene image and a set of product reference images. If the same case contains multiple target images, call this operation separately for each target image.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Image URLs must use HTTPS and must be accessible by the server.</li>
     * <li>Common image formats such as JPEG, PNG, and WebP are supported.</li>
     * <li>Each image should not exceed 2 MB.</li>
     * <li>When using signed URLs, set the validity period to at least 30 minutes.</li>
     * <li>If the same case contains multiple target scene images, call this operation separately for each target image. The reference image list can be reused.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Automatically identifies and locates specified products in an image based on a multimodal foundation model.</p>
     * 
     * @param request ProductHotspotDetectionRequest
     * @return ProductHotspotDetectionResponse
     */
    public ProductHotspotDetectionResponse productHotspotDetection(ProductHotspotDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.productHotspotDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API name in the POP gateway is QueryAsyncTaskResult.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an asynchronous task. The API name in the POP gateway is QueryAsyncTaskResult.</p>
     * 
     * @param request QueryAsyncTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAsyncTaskResultResponse
     */
    public QueryAsyncTaskResultResponse queryAsyncTaskResultWithOptions(QueryAsyncTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAsyncTaskResult"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAsyncTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API name in the POP gateway is QueryAsyncTaskResult.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an asynchronous task. The API name in the POP gateway is QueryAsyncTaskResult.</p>
     * 
     * @param request QueryAsyncTaskResultRequest
     * @return QueryAsyncTaskResultResponse
     */
    public QueryAsyncTaskResultResponse queryAsyncTaskResult(QueryAsyncTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAsyncTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the display knowledge base content by using a paged query with paging (synchronization).</p>
     * 
     * @param tmpReq QueryDisplayKnowledgeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDisplayKnowledgeResponse
     */
    public QueryDisplayKnowledgeResponse queryDisplayKnowledgeWithOptions(QueryDisplayKnowledgeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryDisplayKnowledgeShrinkRequest request = new QueryDisplayKnowledgeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statuses)) {
            request.statusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statuses, "Statuses", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ragId)) {
            query.put("RagId", request.ragId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skuId)) {
            query.put("SkuId", request.skuId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skuName)) {
            query.put("SkuName", request.skuName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusesShrink)) {
            query.put("Statuses", request.statusesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDisplayKnowledge"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDisplayKnowledgeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the display knowledge base content by using a paged query with paging (synchronization).</p>
     * 
     * @param request QueryDisplayKnowledgeRequest
     * @return QueryDisplayKnowledgeResponse
     */
    public QueryDisplayKnowledgeResponse queryDisplayKnowledge(QueryDisplayKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDisplayKnowledgeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>1. Product Introduction</h1>
     * <p>Detects whether an image contains a size chart. (Synchronous)</p>
     * <h1>2. Common scenarios</h1>
     * <p><strong>Batch processing scenario:</strong> Detect images that contain size charts from a batch of images for further image translation or extraction. The size chart detection service helps reduce costs.</p>
     * <h1>3. Features</h1>
     * <p>The size chart detection service uses image recognition technology to automatically determine whether an input image contains size chart content. You provide an image URL, and the system returns a detection result (True/False) indicating whether the image is a size chart.
     * You can customize the confidence threshold (default: 0.4) and flexibly adjust the detection sensitivity based on your business precision requirements. A lower threshold results in more lenient detection, while a higher threshold results in stricter detection. The API processes a single image per request, making it suitable for integration into automated batch workflows for sequential invocation.</p>
     * <h1>4. Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Input image</strong></th>
     * <th><strong>Confidence</strong></th>
     * <th><strong>Output result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/0a914347-2acb-4b94-bf07-86aab2b31279.png" alt="image.png"></td>
     * <td>0.4</td>
     * <td>true</td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/ab29b032-139a-4b22-9371-b387581559b7.webp" alt="O1CN01ZjViRX1rdaL6QDFNo_!!6000000005654-0-tps-2048-2048.webp"></td>
     * <td>0.4</td>
     * <td>false</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Detects whether an image contains a size chart. (Synchronous)</p>
     * 
     * @param request SizeChartDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SizeChartDetectResponse
     */
    public SizeChartDetectResponse sizeChartDetectWithOptions(SizeChartDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SizeChartDetect"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SizeChartDetectResponse());
    }

    /**
     * <b>description</b> :
     * <h1>1. Product Introduction</h1>
     * <p>Detects whether an image contains a size chart. (Synchronous)</p>
     * <h1>2. Common scenarios</h1>
     * <p><strong>Batch processing scenario:</strong> Detect images that contain size charts from a batch of images for further image translation or extraction. The size chart detection service helps reduce costs.</p>
     * <h1>3. Features</h1>
     * <p>The size chart detection service uses image recognition technology to automatically determine whether an input image contains size chart content. You provide an image URL, and the system returns a detection result (True/False) indicating whether the image is a size chart.
     * You can customize the confidence threshold (default: 0.4) and flexibly adjust the detection sensitivity based on your business precision requirements. A lower threshold results in more lenient detection, while a higher threshold results in stricter detection. The API processes a single image per request, making it suitable for integration into automated batch workflows for sequential invocation.</p>
     * <h1>4. Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Input image</strong></th>
     * <th><strong>Confidence</strong></th>
     * <th><strong>Output result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/0a914347-2acb-4b94-bf07-86aab2b31279.png" alt="image.png"></td>
     * <td>0.4</td>
     * <td>true</td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/ab29b032-139a-4b22-9371-b387581559b7.webp" alt="O1CN01ZjViRX1rdaL6QDFNo_!!6000000005654-0-tps-2048-2048.webp"></td>
     * <td>0.4</td>
     * <td>false</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Detects whether an image contains a size chart. (Synchronous)</p>
     * 
     * @param request SizeChartDetectRequest
     * @return SizeChartDetectResponse
     */
    public SizeChartDetectResponse sizeChartDetect(SizeChartDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sizeChartDetectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p>Size chart: Extracts size charts from apparel category images into text.</p>
     * </li>
     * <li><p>Package weight/dimensions: Extracts package weight and dimension information from images.</p>
     * </li>
     * </ul>
     * <h2>Functions and features</h2>
     * <p>The size chart extraction service is based on a multimodal large language model. It automatically recognizes size chart or package weight/dimension information in images and converts it into structured text output. You provide an image URL, and the system processes the request as an asynchronous task and returns the extracted structured data. You can use the ColumnNameList parameter to specify the column names to recognize (such as Size, Bust, and Length) for precise targeted extraction. You can also use the LanguageModel parameter to control the output language. Valid values: cn (Chinese) and en (English). If you leave this parameter empty, the original language is retained. This service is applicable to scenarios such as converting apparel size charts to text and batch structuring of product weight/dimension information.
     * Core capability: Provide an image URL and optional column name configurations as input, and receive structured data of size charts or package weight/dimensions from the image as output. The API uses an asynchronous task mode (background: true). After submission, a task ID is returned. Poll for the final result. This mode is suitable for processing complex images or high-volume call scenarios.</p>
     * <h2>Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Input image</strong></th>
     * <th><strong>Output result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/0a914347-2acb-4b94-bf07-86aab2b31279.png" alt="image.png"></td>
     * <td>{</td>
     * </tr>
     * </tbody></table>
     * <pre><code>      &quot;SizeChart&quot;: [
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;S&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 58
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 81
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 40,
     *             &quot;upper_value&quot;: 47.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;M&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 59
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 82
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 45,
     *             &quot;upper_value&quot;: 52.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;L&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 60
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 83
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 50,
     *             &quot;upper_value&quot;: 57.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 61
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 84
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 55,
     *             &quot;upper_value&quot;: 62.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;2XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 62
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 85
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 60,
     *             &quot;upper_value&quot;: 67.5
     *           }
     *         }
     *       \\],
     *       &quot;SizeChartAttributes&quot;: [
     *         &quot;尺码&quot;,
     *         &quot;裙长&quot;,
     *         &quot;腰围&quot;,
     *         &quot;体重建议&quot;
     *       \\],
     *       &quot;IntersectionAttributes&quot;: [
     *         &quot;尺码&quot;,
     *         &quot;裙长&quot;,
     *         &quot;腰围(拉伸)&quot;,
     *         &quot;体重建议&quot;
     *       \\]
     * </code></pre>
     * <p>} |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous)</p>
     * 
     * @param tmpReq SizeChartExtractRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SizeChartExtractResponse
     */
    public SizeChartExtractResponse sizeChartExtractWithOptions(SizeChartExtractRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SizeChartExtractShrinkRequest request = new SizeChartExtractShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNameList)) {
            request.columnNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNameList, "ColumnNameList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnNameListShrink)) {
            query.put("ColumnNameList", request.columnNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageModel)) {
            query.put("LanguageModel", request.languageModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SizeChartExtract"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SizeChartExtractResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p>Size chart: Extracts size charts from apparel category images into text.</p>
     * </li>
     * <li><p>Package weight/dimensions: Extracts package weight and dimension information from images.</p>
     * </li>
     * </ul>
     * <h2>Functions and features</h2>
     * <p>The size chart extraction service is based on a multimodal large language model. It automatically recognizes size chart or package weight/dimension information in images and converts it into structured text output. You provide an image URL, and the system processes the request as an asynchronous task and returns the extracted structured data. You can use the ColumnNameList parameter to specify the column names to recognize (such as Size, Bust, and Length) for precise targeted extraction. You can also use the LanguageModel parameter to control the output language. Valid values: cn (Chinese) and en (English). If you leave this parameter empty, the original language is retained. This service is applicable to scenarios such as converting apparel size charts to text and batch structuring of product weight/dimension information.
     * Core capability: Provide an image URL and optional column name configurations as input, and receive structured data of size charts or package weight/dimensions from the image as output. The API uses an asynchronous task mode (background: true). After submission, a task ID is returned. Poll for the final result. This mode is suitable for processing complex images or high-volume call scenarios.</p>
     * <h2>Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Input image</strong></th>
     * <th><strong>Output result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/0a914347-2acb-4b94-bf07-86aab2b31279.png" alt="image.png"></td>
     * <td>{</td>
     * </tr>
     * </tbody></table>
     * <pre><code>      &quot;SizeChart&quot;: [
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;S&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 58
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 81
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 40,
     *             &quot;upper_value&quot;: 47.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;M&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 59
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 82
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 45,
     *             &quot;upper_value&quot;: 52.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;L&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 60
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 83
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 50,
     *             &quot;upper_value&quot;: 57.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 61
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 84
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 55,
     *             &quot;upper_value&quot;: 62.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;2XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 62
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 85
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 60,
     *             &quot;upper_value&quot;: 67.5
     *           }
     *         }
     *       \\],
     *       &quot;SizeChartAttributes&quot;: [
     *         &quot;尺码&quot;,
     *         &quot;裙长&quot;,
     *         &quot;腰围&quot;,
     *         &quot;体重建议&quot;
     *       \\],
     *       &quot;IntersectionAttributes&quot;: [
     *         &quot;尺码&quot;,
     *         &quot;裙长&quot;,
     *         &quot;腰围(拉伸)&quot;,
     *         &quot;体重建议&quot;
     *       \\]
     * </code></pre>
     * <p>} |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous)</p>
     * 
     * @param request SizeChartExtractRequest
     * @return SizeChartExtractResponse
     */
    public SizeChartExtractResponse sizeChartExtract(SizeChartExtractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sizeChartExtractWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Size charts: Extracts size charts of apparel categories into text.
     * Item weight and dimensions: Extracts item weight and dimension information from images.</p>
     * <h2>Features</h2>
     * <p>The size chart extraction service is based on a multimodal large model. It automatically recognizes size charts or item weight and dimension information in images and converts the information into structured text. You provide an image URL, and the system processes the request as an asynchronous task and returns the extracted structured data. You can use the ColumnNameList parameter to specify the column names to be recognized, such as Size, Bust, and Length, for precise and targeted extraction. You can also use the LanguageModel parameter to control the output language. Valid values: cn for Chinese and en for English. If you do not specify this parameter, the original language is retained. This service is applicable to scenarios such as text conversion of size charts for apparel categories and batch structuring of item weight and dimension information.
     * Core capabilities: You input an image URL and optional column name configurations, and the system outputs the structured data of the size chart or item weight and dimensions in the image. The API operation uses an asynchronous task mode (background: true). After you submit the task, a task ID is returned. You must poll the task to obtain the final result. This mode is suitable for processing complex images or handling a large number of calls.</p>
     * <h2>Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>Input image</th>
     * <th>Output result</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/0a914347-2acb-4b94-bf07-86aab2b31279.png" alt="image.png"></td>
     * <td>{</td>
     * </tr>
     * </tbody></table>
     * <pre><code>      &quot;SizeChart&quot;: [
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;S&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 58
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 81
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 40,
     *             &quot;upper_value&quot;: 47.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;M&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 59
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 82
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 45,
     *             &quot;upper_value&quot;: 52.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;L&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 60
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 83
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 50,
     *             &quot;upper_value&quot;: 57.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 61
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 84
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 55,
     *             &quot;upper_value&quot;: 62.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;2XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 62
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 85
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 60,
     *             &quot;upper_value&quot;: 67.5
     *           }
     *         }
     *       \\],
     *       &quot;SizeChartAttributes&quot;: [
     *         &quot;Size&quot;,
     *         &quot;Skirt length&quot;,
     *         &quot;Waist&quot;,
     *         &quot;Weight recommendation&quot;
     *       \\],
     *       &quot;IntersectionAttributes&quot;: [
     *         &quot;Size&quot;,
     *         &quot;Skirt length&quot;,
     *         &quot;Waist (stretch)&quot;,
     *         &quot;Weight recommendation&quot;
     *       \\]
     * </code></pre>
     * <p>} |</p>
     * 
     * <b>summary</b> : 
     * <p>Extracts structured information such as size charts and item weight and dimensions from images by using a multimodal large model. (Asynchronous)</p>
     * 
     * @param tmpReq SizeChartExtractAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SizeChartExtractAsyncResponse
     */
    public SizeChartExtractAsyncResponse sizeChartExtractAsyncWithOptions(SizeChartExtractAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SizeChartExtractAsyncShrinkRequest request = new SizeChartExtractAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNameList)) {
            request.columnNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNameList, "ColumnNameList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNameListShrink)) {
            query.put("ColumnNameList", request.columnNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageModel)) {
            query.put("LanguageModel", request.languageModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SizeChartExtractAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SizeChartExtractAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Size charts: Extracts size charts of apparel categories into text.
     * Item weight and dimensions: Extracts item weight and dimension information from images.</p>
     * <h2>Features</h2>
     * <p>The size chart extraction service is based on a multimodal large model. It automatically recognizes size charts or item weight and dimension information in images and converts the information into structured text. You provide an image URL, and the system processes the request as an asynchronous task and returns the extracted structured data. You can use the ColumnNameList parameter to specify the column names to be recognized, such as Size, Bust, and Length, for precise and targeted extraction. You can also use the LanguageModel parameter to control the output language. Valid values: cn for Chinese and en for English. If you do not specify this parameter, the original language is retained. This service is applicable to scenarios such as text conversion of size charts for apparel categories and batch structuring of item weight and dimension information.
     * Core capabilities: You input an image URL and optional column name configurations, and the system outputs the structured data of the size chart or item weight and dimensions in the image. The API operation uses an asynchronous task mode (background: true). After you submit the task, a task ID is returned. You must poll the task to obtain the final result. This mode is suitable for processing complex images or handling a large number of calls.</p>
     * <h2>Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>Input image</th>
     * <th>Output result</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4jKqm0bAebrKLnw1/img/0a914347-2acb-4b94-bf07-86aab2b31279.png" alt="image.png"></td>
     * <td>{</td>
     * </tr>
     * </tbody></table>
     * <pre><code>      &quot;SizeChart&quot;: [
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;S&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 58
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 81
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 40,
     *             &quot;upper_value&quot;: 47.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;M&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 59
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 82
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 45,
     *             &quot;upper_value&quot;: 52.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;L&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 60
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 83
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 50,
     *             &quot;upper_value&quot;: 57.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 61
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 84
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 55,
     *             &quot;upper_value&quot;: 62.5
     *           }
     *         },
     *         {
     *           &quot;尺码&quot;: {
     *             &quot;value&quot;: &quot;2XL&quot;
     *           },
     *           &quot;腰围&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 62
     *           },
     *           &quot;裙长&quot;: {
     *             &quot;unit&quot;: &quot;CM&quot;,
     *             &quot;value&quot;: 85
     *           },
     *           &quot;体重建议&quot;: {
     *             &quot;unit&quot;: &quot;kg&quot;,
     *             &quot;lower_value&quot;: 60,
     *             &quot;upper_value&quot;: 67.5
     *           }
     *         }
     *       \\],
     *       &quot;SizeChartAttributes&quot;: [
     *         &quot;Size&quot;,
     *         &quot;Skirt length&quot;,
     *         &quot;Waist&quot;,
     *         &quot;Weight recommendation&quot;
     *       \\],
     *       &quot;IntersectionAttributes&quot;: [
     *         &quot;Size&quot;,
     *         &quot;Skirt length&quot;,
     *         &quot;Waist (stretch)&quot;,
     *         &quot;Weight recommendation&quot;
     *       \\]
     * </code></pre>
     * <p>} |</p>
     * 
     * <b>summary</b> : 
     * <p>Extracts structured information such as size charts and item weight and dimensions from images by using a multimodal large model. (Asynchronous)</p>
     * 
     * @param request SizeChartExtractAsyncRequest
     * @return SizeChartExtractAsyncResponse
     */
    public SizeChartExtractAsyncResponse sizeChartExtractAsync(SizeChartExtractAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sizeChartExtractAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Storefront photo classification: Distinguishes storefront-related photos from non-storefront photos.</li>
     * <li>Store data verification: Localizes signboards and entrances, and extracts clear and readable short text.</li>
     * <li>Multi-store photo review: Localizes visible storefronts and signs of adjacent stores separately.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Scene classification and details: Returns the scenes string array and classification details. Non-storefront photos are also valid classification results.</li>
     * <li>Storefront key element localization: Covers storefronts, signboards, store entrances, and business-related signs.</li>
     * <li>Readable text extraction: Extracts only clear short text. It does not infer business status based on whether the door is open or closed, and does not infer addresses or store ownership.</li>
     * <li>Supports single HTTPS image input. Supplementary localization returns up to 12 targets, each containing a category, a bounding box, and up to 24 characters of visible text. The coverage field indicates whether the localization is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reviews store photos based on storefront scene recognition and multimodal large model element localization. It outputs storefront scene classifications and confidence details, and localizes storefronts, signboards, entrances, and business signs. It is applicable to store data collection, storefront photo classification, and inspection reviews.</p>
     * 
     * @param request StorefrontSceneRecognitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StorefrontSceneRecognitionResponse
     */
    public StorefrontSceneRecognitionResponse storefrontSceneRecognitionWithOptions(StorefrontSceneRecognitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StorefrontSceneRecognition"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StorefrontSceneRecognitionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Storefront photo classification: Distinguishes storefront-related photos from non-storefront photos.</li>
     * <li>Store data verification: Localizes signboards and entrances, and extracts clear and readable short text.</li>
     * <li>Multi-store photo review: Localizes visible storefronts and signs of adjacent stores separately.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li>Scene classification and details: Returns the scenes string array and classification details. Non-storefront photos are also valid classification results.</li>
     * <li>Storefront key element localization: Covers storefronts, signboards, store entrances, and business-related signs.</li>
     * <li>Readable text extraction: Extracts only clear short text. It does not infer business status based on whether the door is open or closed, and does not infer addresses or store ownership.</li>
     * <li>Supports single HTTPS image input. Supplementary localization returns up to 12 targets, each containing a category, a bounding box, and up to 24 characters of visible text. The coverage field indicates whether the localization is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reviews store photos based on storefront scene recognition and multimodal large model element localization. It outputs storefront scene classifications and confidence details, and localizes storefronts, signboards, entrances, and business signs. It is applicable to store data collection, storefront photo classification, and inspection reviews.</p>
     * 
     * @param request StorefrontSceneRecognitionRequest
     * @return StorefrontSceneRecognitionResponse
     */
    public StorefrontSceneRecognitionResponse storefrontSceneRecognition(StorefrontSceneRecognitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.storefrontSceneRecognitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates product detail page assets automatically based on a multimodal large language model (MLLM) and structured image-text extraction, designed for product detail page asset completion scenarios on e-commerce platforms and for brand merchants. The caller pushes product information to be queried (product ID, title, brand, main image, and shop name). The service automatically locates matching products and performs consistency verification, then extracts size information and product attributes from the matching product details, and renders them into size charts and attribute charts (SVG) that can be directly used on detail pages. The service also returns structured detail copy classifications and processing notes.</p>
     * 
     * @param request SubmitProductMatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitProductMatchResponse
     */
    public SubmitProductMatchResponse submitProductMatchWithOptions(SubmitProductMatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandName)) {
            query.put("BrandName", request.brandName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productUrl)) {
            query.put("ProductUrl", request.productUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopName)) {
            query.put("ShopName", request.shopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitProductMatch"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitProductMatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates product detail page assets automatically based on a multimodal large language model (MLLM) and structured image-text extraction, designed for product detail page asset completion scenarios on e-commerce platforms and for brand merchants. The caller pushes product information to be queried (product ID, title, brand, main image, and shop name). The service automatically locates matching products and performs consistency verification, then extracts size information and product attributes from the matching product details, and renders them into size charts and attribute charts (SVG) that can be directly used on detail pages. The service also returns structured detail copy classifications and processing notes.</p>
     * 
     * @param request SubmitProductMatchRequest
     * @return SubmitProductMatchResponse
     */
    public SubmitProductMatchResponse submitProductMatch(SubmitProductMatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitProductMatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Corrects errors in search terms and titles. The following 14 languages are currently supported:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>No.</th>
     * <th>Language name (English)</th>
     * <th>Language code</th>
     * <th>Language name (Chinese)</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1</td>
     * <td>Arabic</td>
     * <td>ar</td>
     * <td>阿拉伯语</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>German</td>
     * <td>de</td>
     * <td>德语</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>English</td>
     * <td>en</td>
     * <td>英语</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>Spanish</td>
     * <td>es</td>
     * <td>西班牙语</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>French</td>
     * <td>fr</td>
     * <td>法语</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>Hebrew</td>
     * <td>he</td>
     * <td>希伯来语</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>Italian</td>
     * <td>it</td>
     * <td>意大利语</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>Japanese</td>
     * <td>ja</td>
     * <td>日语</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>Korean</td>
     * <td>ko</td>
     * <td>韩语</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>Dutch</td>
     * <td>nl</td>
     * <td>荷兰语</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>Polish</td>
     * <td>pl</td>
     * <td>波兰语</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>Portuguese</td>
     * <td>pt</td>
     * <td>葡萄牙语-巴西</td>
     * </tr>
     * <tr>
     * <td>13</td>
     * <td>Russian</td>
     * <td>ru</td>
     * <td>俄语</td>
     * </tr>
     * <tr>
     * <td>14</td>
     * <td>Ukrainian</td>
     * <td>uk</td>
     * <td>乌克兰语</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Corrects errors in search terms and titles.</p>
     * 
     * @param request TextCorrectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextCorrectResponse
     */
    public TextCorrectResponse textCorrectWithOptions(TextCorrectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            query.put("SourceText", request.sourceText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextCorrect"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextCorrectResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Corrects errors in search terms and titles. The following 14 languages are currently supported:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>No.</th>
     * <th>Language name (English)</th>
     * <th>Language code</th>
     * <th>Language name (Chinese)</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1</td>
     * <td>Arabic</td>
     * <td>ar</td>
     * <td>阿拉伯语</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>German</td>
     * <td>de</td>
     * <td>德语</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>English</td>
     * <td>en</td>
     * <td>英语</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>Spanish</td>
     * <td>es</td>
     * <td>西班牙语</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>French</td>
     * <td>fr</td>
     * <td>法语</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>Hebrew</td>
     * <td>he</td>
     * <td>希伯来语</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>Italian</td>
     * <td>it</td>
     * <td>意大利语</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>Japanese</td>
     * <td>ja</td>
     * <td>日语</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>Korean</td>
     * <td>ko</td>
     * <td>韩语</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>Dutch</td>
     * <td>nl</td>
     * <td>荷兰语</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>Polish</td>
     * <td>pl</td>
     * <td>波兰语</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>Portuguese</td>
     * <td>pt</td>
     * <td>葡萄牙语-巴西</td>
     * </tr>
     * <tr>
     * <td>13</td>
     * <td>Russian</td>
     * <td>ru</td>
     * <td>俄语</td>
     * </tr>
     * <tr>
     * <td>14</td>
     * <td>Ukrainian</td>
     * <td>uk</td>
     * <td>乌克兰语</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Corrects errors in search terms and titles.</p>
     * 
     * @param request TextCorrectRequest
     * @return TextCorrectResponse
     */
    public TextCorrectResponse textCorrect(TextCorrectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.textCorrectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Maas-MT is an e-commerce translation model trained on over 1 billion\+ high-quality bilingual sentence pairs, with continuous optimization for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 400 language directions (including bridged directions), especially Chinese-English, Chinese-multilingual, and English-multilingual translation. It supports language detection for query phrases in 31 languages and general scenarios in 35 languages. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Maas-MT large model translation accurately translates phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Maas-MT large model translation supports long text translation and HTML formatting, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are short and may contain e-commerce-specific terms such as model numbers and specifications.</li>
     * <li>Customer service conversations: In customer service scenarios, Maas-MT optimizes issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Maas-MT large model translation can also be used for general-purpose translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong><br>Maas-MT large model translation supports mutual translation among more than 400 languages and language detection for query phrases in 31 languages and general scenarios in 35 languages.
     * &lt;props=&quot;china&quot;&gt;For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language direction mapping</a><br>&lt;props=&quot;intl&quot;&gt;For supported language directions, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language direction mapping</a></li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong><br>Maas-MT large model translation is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it delivers faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types for translation</strong><br>Currently, text and html text types are supported.</li>
     * <li><strong>Translation intervention support</strong><br>Custom translation results are supported, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for scenarios such as brand name protection. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
     * </ul>
     * <h2>Translation quality comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source text</strong></th>
     * <th><strong>Aidge translation</strong></th>
     * <th><strong>Other translation product 1</strong></th>
     * <th><strong>Other translation product 2</strong></th>
     * <th><strong>Aidge translation advantages</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960 Cooling Fan for Zotac GTX960 Graphics Card Cooling Fan</td>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960, ventilador de enfriamiento para tarjeta gráfica Zotac GTX960.</td>
     * <td>Ventilador de refrigeración de 75mm 4Pin 0.38A GA81S2U 12V para la tarjeta gráfica Zotac GTX960 Ventilador de enfriamiento GTX 960.</td>
     * <td>Ventilador de refrigeración para tarjeta gráfica Zotac GTX960, 75mm, 4 pines, 0,38A, GA81S2U, 12V, GTX 960</td>
     * <td>Clearer product subject</td>
     * </tr>
     * <tr>
     * <td>New Arrival Classic Style Luxury Brand 6 Hands Swiss Automatic Mechanical Men\&quot;s Business Steel Watch</td>
     * <td>Nueva llegada, reloj mecánico automático de lujo con 6 manecillas, estilo clásico, de acero para hombres de negocios</td>
     * <td>Nueva Llegada Reloj De Acero de Negocios para Hombre con Mecanismo Automático Suizo y 6 Agujas de Estilo Clásico de Marca de Lujo.</td>
     * <td>Reloj de acero de negocios para hombre, mecánico automático suizo, marca de lujo, estilo clásico, 6 manos, nueva llegada</td>
     * <td>More complete sentence structure, clearer expression, and more reasonable segmentation</td>
     * </tr>
     * <tr>
     * <td>Men Key Bag Genuine Cow Leather Buckets Key Cases Pouch Zipper Keychain Auto Car Key Case Women Home Key Holder Wallet</td>
     * <td>Sac à clés pour hommes en cuir de vache véritable, étuis à clés, pochette à fermeture éclair, porte-clés, étui à clé de voiture, porte-clés pour femmes, organisateur de portefeuille</td>
     * <td>Porte-clés sac en cuir de vache véritable, étuis à clés en forme de seau, pochette à fermeture éclair, porte-clés auto pour voiture, étui à clés pour femmes, organisateur de clés de maison, portefeuille.</td>
     * <td>Hommes porte-clés en cuir de vache véritable sac/pochette fermature éclair porte-clés Auto voiture porte-clés femmes maison porte-clés organisateur portefeuille</td>
     * <td>Clearer and more accurate product subject description. The translation correctly identifies the product as a &quot;key bag&quot; rather than a &quot;keychain&quot;, avoiding ambiguity present in other translations.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Maas-MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, with continuous optimization for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 400 language directions (including bridged directions), especially Chinese-English, Chinese-multilingual, and English-multilingual translation. It supports language detection for query phrases in 31 languages and general scenarios in 35 languages. If you do not specify a source language, automatic detection is performed.</p>
     * 
     * @param tmpReq TextTranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextTranslateResponse
     */
    public TextTranslateResponse textTranslateWithOptions(TextTranslateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TextTranslateShrinkRequest request = new TextTranslateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTextList)) {
            request.sourceTextListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTextList, "SourceTextList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            body.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTextListShrink)) {
            body.put("SourceTextList", request.sourceTextListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateScene)) {
            body.put("TranslateScene", request.translateScene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextTranslate"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextTranslateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Maas-MT is an e-commerce translation model trained on over 1 billion\+ high-quality bilingual sentence pairs, with continuous optimization for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 400 language directions (including bridged directions), especially Chinese-English, Chinese-multilingual, and English-multilingual translation. It supports language detection for query phrases in 31 languages and general scenarios in 35 languages. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Maas-MT large model translation accurately translates phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Maas-MT large model translation supports long text translation and HTML formatting, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are short and may contain e-commerce-specific terms such as model numbers and specifications.</li>
     * <li>Customer service conversations: In customer service scenarios, Maas-MT optimizes issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Maas-MT large model translation can also be used for general-purpose translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong><br>Maas-MT large model translation supports mutual translation among more than 400 languages and language detection for query phrases in 31 languages and general scenarios in 35 languages.
     * &lt;props=&quot;china&quot;&gt;For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language direction mapping</a><br>&lt;props=&quot;intl&quot;&gt;For supported language directions, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language direction mapping</a></li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong><br>Maas-MT large model translation is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it delivers faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types for translation</strong><br>Currently, text and html text types are supported.</li>
     * <li><strong>Translation intervention support</strong><br>Custom translation results are supported, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for scenarios such as brand name protection. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
     * </ul>
     * <h2>Translation quality comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source text</strong></th>
     * <th><strong>Aidge translation</strong></th>
     * <th><strong>Other translation product 1</strong></th>
     * <th><strong>Other translation product 2</strong></th>
     * <th><strong>Aidge translation advantages</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960 Cooling Fan for Zotac GTX960 Graphics Card Cooling Fan</td>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960, ventilador de enfriamiento para tarjeta gráfica Zotac GTX960.</td>
     * <td>Ventilador de refrigeración de 75mm 4Pin 0.38A GA81S2U 12V para la tarjeta gráfica Zotac GTX960 Ventilador de enfriamiento GTX 960.</td>
     * <td>Ventilador de refrigeración para tarjeta gráfica Zotac GTX960, 75mm, 4 pines, 0,38A, GA81S2U, 12V, GTX 960</td>
     * <td>Clearer product subject</td>
     * </tr>
     * <tr>
     * <td>New Arrival Classic Style Luxury Brand 6 Hands Swiss Automatic Mechanical Men\&quot;s Business Steel Watch</td>
     * <td>Nueva llegada, reloj mecánico automático de lujo con 6 manecillas, estilo clásico, de acero para hombres de negocios</td>
     * <td>Nueva Llegada Reloj De Acero de Negocios para Hombre con Mecanismo Automático Suizo y 6 Agujas de Estilo Clásico de Marca de Lujo.</td>
     * <td>Reloj de acero de negocios para hombre, mecánico automático suizo, marca de lujo, estilo clásico, 6 manos, nueva llegada</td>
     * <td>More complete sentence structure, clearer expression, and more reasonable segmentation</td>
     * </tr>
     * <tr>
     * <td>Men Key Bag Genuine Cow Leather Buckets Key Cases Pouch Zipper Keychain Auto Car Key Case Women Home Key Holder Wallet</td>
     * <td>Sac à clés pour hommes en cuir de vache véritable, étuis à clés, pochette à fermeture éclair, porte-clés, étui à clé de voiture, porte-clés pour femmes, organisateur de portefeuille</td>
     * <td>Porte-clés sac en cuir de vache véritable, étuis à clés en forme de seau, pochette à fermeture éclair, porte-clés auto pour voiture, étui à clés pour femmes, organisateur de clés de maison, portefeuille.</td>
     * <td>Hommes porte-clés en cuir de vache véritable sac/pochette fermature éclair porte-clés Auto voiture porte-clés femmes maison porte-clés organisateur portefeuille</td>
     * <td>Clearer and more accurate product subject description. The translation correctly identifies the product as a &quot;key bag&quot; rather than a &quot;keychain&quot;, avoiding ambiguity present in other translations.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Maas-MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, with continuous optimization for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports mutual translation among more than 400 language directions (including bridged directions), especially Chinese-English, Chinese-multilingual, and English-multilingual translation. It supports language detection for query phrases in 31 languages and general scenarios in 35 languages. If you do not specify a source language, automatic detection is performed.</p>
     * 
     * @param request TextTranslateRequest
     * @return TextTranslateResponse
     */
    public TextTranslateResponse textTranslate(TextTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.textTranslateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p>Product titles: The Maas MT large language model accurately translates phrases, keywords, and trending words in product titles into the target language to increase product exposure on e-commerce platforms.</p>
     * </li>
     * <li><p>Product descriptions: Product descriptions are typically long and have diverse and complex formats. The Maas large language model supports long-text translation and HTML formatting, delivering excellent translation quality and format restoration.</p>
     * </li>
     * <li><p>Product attributes: Product attribute terms are short and contain e-commerce-specific words such as models and parameters.</p>
     * </li>
     * <li><p>Customer service conversations: In customer service scenarios, the model optimizes issues such as missing context and typos, and supports polite expressions in some language pairs.</p>
     * </li>
     * </ul>
     * <p>The Maas MT large language model can also be used for translation in general scenarios, such as office work, meetings, and daily conversations.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Ultra-low hallucination rate and high-speed inference</strong>: The Maas MT large language model is aligned with preferences for translation scenarios. Compared with general-purpose large language models, it provides faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</p>
     * </li>
     * <li><p><strong>Supported text formats</strong>: The model supports text and HTML formats.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: You can customize translation results, including keeping words untranslated (ABC-ABC), specifying translations (ABC-DEF), and omitting translations (ABC-null). This is commonly used for brand word protection. You only need to pass the corresponding intervention glossary ID when calling the API. This meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you need more, contact the platform.</p>
     * </li>
     * <li><p><strong>Translation effect comparison</strong></p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source text</strong></th>
     * <th><strong>Aidge translation</strong></th>
     * <th><strong>Other translation product 1</strong></th>
     * <th><strong>Other translation product 2</strong></th>
     * <th><strong>Aidge translation advantages</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960 Cooling Fan for Zotac GTX960 Graphics Card Cooling Fan</td>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960, ventilador de enfriamiento para tarjeta gráfica Zotac GTX960.</td>
     * <td>Ventilador de refrigeración de 75mm 4Pin 0.38A GA81S2U 12V para la tarjeta gráfica Zotac GTX960 Ventilador de enfriamiento GTX 960.</td>
     * <td>Ventilador de refrigeración para tarjeta gráfica Zotac GTX960, 75mm, 4 pines, 0,38A, GA81S2U, 12V, GTX 960</td>
     * <td>Clearer product subject</td>
     * </tr>
     * <tr>
     * <td>New Arrival Classic Style Luxury Brand 6 Hands Swiss Automatic Mechanical Men\&quot;s Business Steel Watch</td>
     * <td>Nueva llegada, reloj mecánico automático de lujo con 6 manecillas, estilo clásico, de acero para hombres de negocios</td>
     * <td>Nueva Llegada Reloj De Acero de Negocios para Hombre con Mecanismo Automático Suizo y 6 Agujas de Estilo Clásico de Marca de Lujo.</td>
     * <td>Reloj de acero de negocios para hombre, mecánico automático suizo, marca de lujo, estilo clásico, 6 manos, nueva llegada</td>
     * <td>More complete sentence structure, clearer expression, and more reasonable punctuation</td>
     * </tr>
     * <tr>
     * <td>Men Key Bag Genuine Cow Leather Buckets Key Cases Pouch Zipper Keychain Auto Car Key Case Women Home Key Holder Wallet</td>
     * <td>Sac à clés pour hommes en cuir de vache véritable, étuis à clés, pochette à fermeture éclair, porte-clés, étui à clé de voiture, porte-clés pour femmes, organisateur de portefeuille</td>
     * <td>Porte-clés sac en cuir de vache véritable, étuis à clés en forme de seau, pochette à fermeture éclair, porte-clés auto pour voiture, étui à clés pour femmes, organisateur de clés de maison, portefeuille.</td>
     * <td>Hommes porte-clés en cuir de vache véritable sac/pochette fermature éclair porte-clés Auto voiture porte-clés femmes maison porte-clés organisateur portefeuille</td>
     * <td>Clearer and more explicit product subject. It is translated as a &quot;key bag&quot; rather than a &quot;keychain&quot;. Other translations may cause ambiguity about the product subject.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <h2>Preparations and call flow</h2>
     * <p>Text translation supports both synchronization and asynchronous call methods. This topic describes the asynchronous call API. For synchronization calls, see <a href="https://api.aliyun.com/document/Aidge/2026-04-28/TextTranslate">Text Translation - Synchronization API</a>.
     * The asynchronous APIs for text translation and other capabilities share the same result retrieval flow, RocketMQ subscribe rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.
     * For the asynchronous call flow, subscribe rules, message formats and encryption protocols, and detailed integration solutions, see <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Translates text by using the Maas MT e-commerce translation model, which is trained on over 1 billion high-quality bilingual sentence pairs and optimized for e-commerce terms such as brands, models, materials, and attributes. It supports 156 languages, over 400 language pairs, and automatic source language detection.</p>
     * 
     * @param tmpReq TextTranslateAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextTranslateAsyncResponse
     */
    public TextTranslateAsyncResponse textTranslateAsyncWithOptions(TextTranslateAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TextTranslateAsyncShrinkRequest request = new TextTranslateAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTextList)) {
            request.sourceTextListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTextList, "SourceTextList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            query.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            query.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTextListShrink)) {
            query.put("SourceTextList", request.sourceTextListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateScene)) {
            query.put("TranslateScene", request.translateScene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextTranslateAsync"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextTranslateAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p>Product titles: The Maas MT large language model accurately translates phrases, keywords, and trending words in product titles into the target language to increase product exposure on e-commerce platforms.</p>
     * </li>
     * <li><p>Product descriptions: Product descriptions are typically long and have diverse and complex formats. The Maas large language model supports long-text translation and HTML formatting, delivering excellent translation quality and format restoration.</p>
     * </li>
     * <li><p>Product attributes: Product attribute terms are short and contain e-commerce-specific words such as models and parameters.</p>
     * </li>
     * <li><p>Customer service conversations: In customer service scenarios, the model optimizes issues such as missing context and typos, and supports polite expressions in some language pairs.</p>
     * </li>
     * </ul>
     * <p>The Maas MT large language model can also be used for translation in general scenarios, such as office work, meetings, and daily conversations.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><p><strong>Ultra-low hallucination rate and high-speed inference</strong>: The Maas MT large language model is aligned with preferences for translation scenarios. Compared with general-purpose large language models, it provides faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</p>
     * </li>
     * <li><p><strong>Supported text formats</strong>: The model supports text and HTML formats.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: You can customize translation results, including keeping words untranslated (ABC-ABC), specifying translations (ABC-DEF), and omitting translations (ABC-null). This is commonly used for brand word protection. You only need to pass the corresponding intervention glossary ID when calling the API. This meets your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention words. If you need more, contact the platform.</p>
     * </li>
     * <li><p><strong>Translation effect comparison</strong></p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Source text</strong></th>
     * <th><strong>Aidge translation</strong></th>
     * <th><strong>Other translation product 1</strong></th>
     * <th><strong>Other translation product 2</strong></th>
     * <th><strong>Aidge translation advantages</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960 Cooling Fan for Zotac GTX960 Graphics Card Cooling Fan</td>
     * <td>75mm 4Pin 0.38A GA81S2U 12V GTX 960, ventilador de enfriamiento para tarjeta gráfica Zotac GTX960.</td>
     * <td>Ventilador de refrigeración de 75mm 4Pin 0.38A GA81S2U 12V para la tarjeta gráfica Zotac GTX960 Ventilador de enfriamiento GTX 960.</td>
     * <td>Ventilador de refrigeración para tarjeta gráfica Zotac GTX960, 75mm, 4 pines, 0,38A, GA81S2U, 12V, GTX 960</td>
     * <td>Clearer product subject</td>
     * </tr>
     * <tr>
     * <td>New Arrival Classic Style Luxury Brand 6 Hands Swiss Automatic Mechanical Men\&quot;s Business Steel Watch</td>
     * <td>Nueva llegada, reloj mecánico automático de lujo con 6 manecillas, estilo clásico, de acero para hombres de negocios</td>
     * <td>Nueva Llegada Reloj De Acero de Negocios para Hombre con Mecanismo Automático Suizo y 6 Agujas de Estilo Clásico de Marca de Lujo.</td>
     * <td>Reloj de acero de negocios para hombre, mecánico automático suizo, marca de lujo, estilo clásico, 6 manos, nueva llegada</td>
     * <td>More complete sentence structure, clearer expression, and more reasonable punctuation</td>
     * </tr>
     * <tr>
     * <td>Men Key Bag Genuine Cow Leather Buckets Key Cases Pouch Zipper Keychain Auto Car Key Case Women Home Key Holder Wallet</td>
     * <td>Sac à clés pour hommes en cuir de vache véritable, étuis à clés, pochette à fermeture éclair, porte-clés, étui à clé de voiture, porte-clés pour femmes, organisateur de portefeuille</td>
     * <td>Porte-clés sac en cuir de vache véritable, étuis à clés en forme de seau, pochette à fermeture éclair, porte-clés auto pour voiture, étui à clés pour femmes, organisateur de clés de maison, portefeuille.</td>
     * <td>Hommes porte-clés en cuir de vache véritable sac/pochette fermature éclair porte-clés Auto voiture porte-clés femmes maison porte-clés organisateur portefeuille</td>
     * <td>Clearer and more explicit product subject. It is translated as a &quot;key bag&quot; rather than a &quot;keychain&quot;. Other translations may cause ambiguity about the product subject.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <h2>Preparations and call flow</h2>
     * <p>Text translation supports both synchronization and asynchronous call methods. This topic describes the asynchronous call API. For synchronization calls, see <a href="https://api.aliyun.com/document/Aidge/2026-04-28/TextTranslate">Text Translation - Synchronization API</a>.
     * The asynchronous APIs for text translation and other capabilities share the same result retrieval flow, RocketMQ subscribe rules, message encryption protocols, dependency configurations, and Java consumption and decryption code.
     * For the asynchronous call flow, subscribe rules, message formats and encryption protocols, and detailed integration solutions, see <a href="https://www.alibabacloud.com/help/en/aidge/asynchronous-interface-call-instructions">Asynchronous API call instructions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Translates text by using the Maas MT e-commerce translation model, which is trained on over 1 billion high-quality bilingual sentence pairs and optimized for e-commerce terms such as brands, models, materials, and attributes. It supports 156 languages, over 400 language pairs, and automatic source language detection.</p>
     * 
     * @param request TextTranslateAsyncRequest
     * @return TextTranslateAsyncResponse
     */
    public TextTranslateAsyncResponse textTranslateAsync(TextTranslateAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.textTranslateAsyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously modifies the content of a display knowledge base in batches.</p>
     * 
     * @param tmpReq UpdateDisplayKnowledgeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDisplayKnowledgeResponse
     */
    public UpdateDisplayKnowledgeResponse updateDisplayKnowledgeWithOptions(UpdateDisplayKnowledgeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDisplayKnowledgeShrinkRequest request = new UpdateDisplayKnowledgeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.records)) {
            request.recordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.records, "Records", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ragId)) {
            query.put("RagId", request.ragId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordsShrink)) {
            query.put("Records", request.recordsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDisplayKnowledge"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDisplayKnowledgeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously modifies the content of a display knowledge base in batches.</p>
     * 
     * @param request UpdateDisplayKnowledgeRequest
     * @return UpdateDisplayKnowledgeResponse
     */
    public UpdateDisplayKnowledgeResponse updateDisplayKnowledge(UpdateDisplayKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDisplayKnowledgeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <ul>
     * <li>Batch generation of product short videos for sellers and platforms: Supports multiple video aspect ratios and sizes (3:4, 9:16), adapting to product detail page video slots, product homepage displays, information feed placements, short video promotions, and event venue materials.</li>
     * <li>Quick generation of the first batch of video materials for new product launches: When merchants have a large number of new products to launch, they only need to upload basic information such as product images and titles to quickly generate product showcase videos, model wearing videos, and spoken explanation videos, helping merchants quickly complete material deployment during the launch phase.</li>
     * <li>High-fidelity clothing display: Generates model display videos that are closer to real commercial shooting effects based on product main images, focusing on optimizing capabilities such as pattern restoration, fabric texture retention, accurate color presentation, and stable and consistent details. It supports common e-commerce display methods such as wearing, turning, walking, close-up shots, and multi-angle switching.</li>
     * <li>Generation of high-quality commercial shooting models: Built-in target audience model library, covering plus-size women, plus-size men, swimwear, girl style, light mature commuting, youth casual, business menswear, sports and fitness, and other body types, skin colors, and races. It supports various commercial shooting expressions such as standing display, side display, walking display, and partial close-ups.</li>
     * <li>High-frequency e-commerce scenarios such as standard product explanations: Applicable to standardized product categories such as skincare, cosmetics, personal care small appliances, food and beverages, home cleaning daily necessities, and 3C digital products. It can quickly generate product explanation videos based on product main images, titles, selling point information, and explanation scripts.</li>
     * <li>Multi-product and multi-selling point testing to improve delivery efficiency: For information feed advertising, short video delivery, and content promotion scenarios, it can quickly generate multiple versions of video materials, making it easy for enterprises to verify the conversion effects of different selling points and presentation forms at a low cost, and improve delivery ROI.</li>
     * </ul>
     * <h1>Features</h1>
     * <ul>
     * <li>Fully automatic end-to-end batch generation with zero prompt threshold: Callers only need to pass in the product image URL and title, and the system automatically completes the entire process from product understanding, storyboard planning to video generation, without the need to manually write prompts, select templates, or repeatedly adjust parameters. Built-in multiple agents such as product understanding, image quality inspection, script planning, and director camera movement greatly lower the threshold for use.</li>
     * <li>Highly stable generation with a low waste rate: Adopts a deterministic generation process and multi-layer quality control mechanism to output usable materials with fewer retries, reducing invalid generation and resource waste, and making the overall production cost more controllable.</li>
     * <li>E-commerce exclusive product fidelity capability: Built-in multi-round quality inspection agent locks the product state throughout the video generation process (such as zippers will not be pulled open, sleeves will not be put down, and prints will not disappear), ensuring product consistency through multi-layer defense of script rewriting, explicit constraint injection, and failure-aware retry.</li>
     * <li>Reference image first + 6-axis consistency check: Adopts the Reference-Image-First generation paradigm, using the original product image as the only visual source of truth, and automatically performs 6-dimensional VL diagnosis (color drift, pattern missing, contour deviation, structure addition/reduction, model matching, dirt detection) to fundamentally eliminate the problem of generated images not looking like the product.</li>
     * <li>Flexible storyboard arrangement and duration control: Supports adjustable video duration of 5 to 30 seconds; the agent independently plans independent storyboards to display the product effects in different scenarios; it also supports a fixed scene mode to deeply display the product tonality under a unified visual style.</li>
     * <li>Cinematic camera movement capabilities: Built-in advanced camera movement modes such as bullet time, Grammy slow motion, 360° surround rotation, and model full-body rotation display, achieving deterministic output through segmented precise control.</li>
     * <li>Model library and customization services: Built-in multi-type model resource library, supporting merchants to specify fixed models, customize exclusive model images, and bind brand visual personas for a long time to ensure brand visual consistency.</li>
     * <li>Adapting to high-frequency e-commerce content scenarios: Supports multiple resolutions such as 720P and 1080P, and multiple aspect ratios such as 3:4 and 9:16, adapting to product detail page video slots, product homepage video displays, waterfall/information feed placements, event venue materials, and new product and promotional video generation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The e-commerce AI video generation agent is designed for e-commerce merchants and platforms. Based on product main images, titles, and selling points, it automatically generates 5- to 30-second product showcase short videos to help customers efficiently produce and distribute e-commerce content. The product supports multiple resolution outputs such as 720P and 1080P. You can invoke single products quickly and generate multiple products in batches, meeting the needs of daily operations and large-scale product content production. It currently overwrites all clothing categories (tops, pants, skirts, suits, underwear, swimwear, etc.) and is gradually expanding to core e-commerce categories such as skincare, cosmetics, food and beverages, and home appliances.</p>
     * 
     * @param tmpReq VideoGenerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoGenerationResponse
     */
    public VideoGenerationResponse videoGenerationWithOptions(VideoGenerationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        VideoGenerationShrinkRequest request = new VideoGenerationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.intent)) {
            request.intentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.intent, "Intent", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.output)) {
            request.outputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.output, "Output", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentShrink)) {
            query.put("Intent", request.intentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputShrink)) {
            query.put("Output", request.outputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoGeneration"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoGenerationResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Scenarios</h1>
     * <ul>
     * <li>Batch generation of product short videos for sellers and platforms: Supports multiple video aspect ratios and sizes (3:4, 9:16), adapting to product detail page video slots, product homepage displays, information feed placements, short video promotions, and event venue materials.</li>
     * <li>Quick generation of the first batch of video materials for new product launches: When merchants have a large number of new products to launch, they only need to upload basic information such as product images and titles to quickly generate product showcase videos, model wearing videos, and spoken explanation videos, helping merchants quickly complete material deployment during the launch phase.</li>
     * <li>High-fidelity clothing display: Generates model display videos that are closer to real commercial shooting effects based on product main images, focusing on optimizing capabilities such as pattern restoration, fabric texture retention, accurate color presentation, and stable and consistent details. It supports common e-commerce display methods such as wearing, turning, walking, close-up shots, and multi-angle switching.</li>
     * <li>Generation of high-quality commercial shooting models: Built-in target audience model library, covering plus-size women, plus-size men, swimwear, girl style, light mature commuting, youth casual, business menswear, sports and fitness, and other body types, skin colors, and races. It supports various commercial shooting expressions such as standing display, side display, walking display, and partial close-ups.</li>
     * <li>High-frequency e-commerce scenarios such as standard product explanations: Applicable to standardized product categories such as skincare, cosmetics, personal care small appliances, food and beverages, home cleaning daily necessities, and 3C digital products. It can quickly generate product explanation videos based on product main images, titles, selling point information, and explanation scripts.</li>
     * <li>Multi-product and multi-selling point testing to improve delivery efficiency: For information feed advertising, short video delivery, and content promotion scenarios, it can quickly generate multiple versions of video materials, making it easy for enterprises to verify the conversion effects of different selling points and presentation forms at a low cost, and improve delivery ROI.</li>
     * </ul>
     * <h1>Features</h1>
     * <ul>
     * <li>Fully automatic end-to-end batch generation with zero prompt threshold: Callers only need to pass in the product image URL and title, and the system automatically completes the entire process from product understanding, storyboard planning to video generation, without the need to manually write prompts, select templates, or repeatedly adjust parameters. Built-in multiple agents such as product understanding, image quality inspection, script planning, and director camera movement greatly lower the threshold for use.</li>
     * <li>Highly stable generation with a low waste rate: Adopts a deterministic generation process and multi-layer quality control mechanism to output usable materials with fewer retries, reducing invalid generation and resource waste, and making the overall production cost more controllable.</li>
     * <li>E-commerce exclusive product fidelity capability: Built-in multi-round quality inspection agent locks the product state throughout the video generation process (such as zippers will not be pulled open, sleeves will not be put down, and prints will not disappear), ensuring product consistency through multi-layer defense of script rewriting, explicit constraint injection, and failure-aware retry.</li>
     * <li>Reference image first + 6-axis consistency check: Adopts the Reference-Image-First generation paradigm, using the original product image as the only visual source of truth, and automatically performs 6-dimensional VL diagnosis (color drift, pattern missing, contour deviation, structure addition/reduction, model matching, dirt detection) to fundamentally eliminate the problem of generated images not looking like the product.</li>
     * <li>Flexible storyboard arrangement and duration control: Supports adjustable video duration of 5 to 30 seconds; the agent independently plans independent storyboards to display the product effects in different scenarios; it also supports a fixed scene mode to deeply display the product tonality under a unified visual style.</li>
     * <li>Cinematic camera movement capabilities: Built-in advanced camera movement modes such as bullet time, Grammy slow motion, 360° surround rotation, and model full-body rotation display, achieving deterministic output through segmented precise control.</li>
     * <li>Model library and customization services: Built-in multi-type model resource library, supporting merchants to specify fixed models, customize exclusive model images, and bind brand visual personas for a long time to ensure brand visual consistency.</li>
     * <li>Adapting to high-frequency e-commerce content scenarios: Supports multiple resolutions such as 720P and 1080P, and multiple aspect ratios such as 3:4 and 9:16, adapting to product detail page video slots, product homepage video displays, waterfall/information feed placements, event venue materials, and new product and promotional video generation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The e-commerce AI video generation agent is designed for e-commerce merchants and platforms. Based on product main images, titles, and selling points, it automatically generates 5- to 30-second product showcase short videos to help customers efficiently produce and distribute e-commerce content. The product supports multiple resolution outputs such as 720P and 1080P. You can invoke single products quickly and generate multiple products in batches, meeting the needs of daily operations and large-scale product content production. It currently overwrites all clothing categories (tops, pants, skirts, suits, underwear, swimwear, etc.) and is gradually expanding to core e-commerce categories such as skincare, cosmetics, food and beverages, and home appliances.</p>
     * 
     * @param request VideoGenerationRequest
     * @return VideoGenerationResponse
     */
    public VideoGenerationResponse videoGeneration(VideoGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.videoGenerationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The video translation API translates the speech and on-screen text in a video into a target language. You can select speech subtitle translation, on-screen text translation, or both. This API applies to scenarios such as multilingual distribution of e-commerce videos, international social media marketing, and global brand advertising.
     * The API uses an asynchronous invocation mode. After you submit a translation task, you can obtain the TaskId and poll the task status by calling the query API until the task is completed and the result is returned.</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Cross-border e-commerce video localization</strong>: Translates the speech subtitles and selling point text in product introduction videos into the language of the target market to facilitate promotion on overseas platforms.</p>
     * </li>
     * <li><p><strong>International social media marketing</strong>: Localizes speech subtitles and on-screen text for platforms such as TikTok, Instagram, and YouTube with one click to improve comprehension and conversion rates among overseas users.</p>
     * </li>
     * <li><p><strong>Global brand advertising</strong>: Automatically generates video versions in the languages of the target regions to reduce manual production costs.</p>
     * </li>
     * <li><p><strong>Training and product instructions</strong>: Translates the speech subtitles and on-screen text in training courses or product demo videos into multiple languages for global teams.</p>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>Feature</th>
     * <th>Identifier</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Speech subtitle translation</td>
     * <td>speech</td>
     * <td>Translates the video speech into target language dubbing. You can choose to only erase the original subtitles or replace them with translated subtitles. By default, the original subtitles are not processed and no new subtitles are added.</td>
     * </tr>
     * <tr>
     * <td>On-screen text translation</td>
     * <td>visual</td>
     * <td>Translates the source language text in the video frames, or only erases the on-screen text without translation. You can choose to erase brand logos.</td>
     * </tr>
     * <tr>
     * <td>Speech subtitle translation (speech) generates target language dubbing based on the spoken content in the video, processes the subtitles according to the original subtitle processing option, and synthesizes the final video. Original subtitles refer to the existing subtitles in the video frames that correspond to the spoken content. Replacing with translated subtitles first erases the original subtitles and then adds subtitles synchronized with the translated speech.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>On-screen text translation (visual) targets recognizable original video language text in the video frames, such as titles, product selling points, and descriptive text. It can be used independently without selecting speech subtitle translation first, and does not require the text to appear in the speech. Original subtitles within the processing scope may also be processed.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When both speech and visual are selected, the speech subtitle translation is completed and the video is synthesized first. Then, on-screen text processing is performed on this video, retaining the translated dubbing, and a final video is output. The order of features in the array does not affect the execution order. Therefore, not processing original subtitles only means that no subtitles are erased or added during the speech subtitle phase, and subsequent on-screen text processing may still change the original subtitles. Subtitles that have been replaced with translated ones will be retained during subsequent on-screen text processing.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Translates the speech and on-screen text in a video into a target language. You can select speech subtitle translation, on-screen text translation, or both. This API applies to scenarios such as multilingual distribution of e-commerce videos, international social media marketing, and global brand advertising. The API uses an asynchronous invocation mode. After you submit a translation task, you can obtain the task ID and poll the task status by calling the query API until the task is completed and the result is returned.</p>
     * 
     * @param tmpReq VideoTranslationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoTranslationResponse
     */
    public VideoTranslationResponse videoTranslationWithOptions(VideoTranslationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        VideoTranslationShrinkRequest request = new VideoTranslationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.capabilities)) {
            request.capabilitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.capabilities, "Capabilities", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eraseOnly)) {
            query.put("EraseOnly", request.eraseOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeLogo)) {
            query.put("RemoveLogo", request.removeLogo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtitleMode)) {
            query.put("SubtitleMode", request.subtitleMode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capabilitiesShrink)) {
            body.put("Capabilities", request.capabilitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableQualityCheck)) {
            body.put("EnableQualityCheck", request.enableQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUrl)) {
            body.put("VideoUrl", request.videoUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoTranslation"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoTranslationResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Product introduction</h2>
     * <p>The video translation API translates the speech and on-screen text in a video into a target language. You can select speech subtitle translation, on-screen text translation, or both. This API applies to scenarios such as multilingual distribution of e-commerce videos, international social media marketing, and global brand advertising.
     * The API uses an asynchronous invocation mode. After you submit a translation task, you can obtain the TaskId and poll the task status by calling the query API until the task is completed and the result is returned.</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Cross-border e-commerce video localization</strong>: Translates the speech subtitles and selling point text in product introduction videos into the language of the target market to facilitate promotion on overseas platforms.</p>
     * </li>
     * <li><p><strong>International social media marketing</strong>: Localizes speech subtitles and on-screen text for platforms such as TikTok, Instagram, and YouTube with one click to improve comprehension and conversion rates among overseas users.</p>
     * </li>
     * <li><p><strong>Global brand advertising</strong>: Automatically generates video versions in the languages of the target regions to reduce manual production costs.</p>
     * </li>
     * <li><p><strong>Training and product instructions</strong>: Translates the speech subtitles and on-screen text in training courses or product demo videos into multiple languages for global teams.</p>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>Feature</th>
     * <th>Identifier</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Speech subtitle translation</td>
     * <td>speech</td>
     * <td>Translates the video speech into target language dubbing. You can choose to only erase the original subtitles or replace them with translated subtitles. By default, the original subtitles are not processed and no new subtitles are added.</td>
     * </tr>
     * <tr>
     * <td>On-screen text translation</td>
     * <td>visual</td>
     * <td>Translates the source language text in the video frames, or only erases the on-screen text without translation. You can choose to erase brand logos.</td>
     * </tr>
     * <tr>
     * <td>Speech subtitle translation (speech) generates target language dubbing based on the spoken content in the video, processes the subtitles according to the original subtitle processing option, and synthesizes the final video. Original subtitles refer to the existing subtitles in the video frames that correspond to the spoken content. Replacing with translated subtitles first erases the original subtitles and then adds subtitles synchronized with the translated speech.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>On-screen text translation (visual) targets recognizable original video language text in the video frames, such as titles, product selling points, and descriptive text. It can be used independently without selecting speech subtitle translation first, and does not require the text to appear in the speech. Original subtitles within the processing scope may also be processed.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When both speech and visual are selected, the speech subtitle translation is completed and the video is synthesized first. Then, on-screen text processing is performed on this video, retaining the translated dubbing, and a final video is output. The order of features in the array does not affect the execution order. Therefore, not processing original subtitles only means that no subtitles are erased or added during the speech subtitle phase, and subsequent on-screen text processing may still change the original subtitles. Subtitles that have been replaced with translated ones will be retained during subsequent on-screen text processing.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Translates the speech and on-screen text in a video into a target language. You can select speech subtitle translation, on-screen text translation, or both. This API applies to scenarios such as multilingual distribution of e-commerce videos, international social media marketing, and global brand advertising. The API uses an asynchronous invocation mode. After you submit a translation task, you can obtain the task ID and poll the task status by calling the query API until the task is completed and the result is returned.</p>
     * 
     * @param request VideoTranslationRequest
     * @return VideoTranslationResponse
     */
    public VideoTranslationResponse videoTranslation(VideoTranslationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.videoTranslationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Virtual try-on for clothing:</strong>
     * Supports various clothing categories such as tops, bottoms, jumpsuits, and dresses. After you upload a model image and a garment image, the system generates natural and realistic try-on effects to visually demonstrate how the clothing looks on the model.</li>
     * <li><strong>Virtual try-on for shoes and hats:</strong>
     * Supports virtual try-on for accessories such as shoes and hats. The system intelligently matches the position and proportion of the items based on the model\&quot;s pose and body parts to present a coordinated and realistic wearing effect.</li>
     * <li><strong>E-commerce product display and marketing:</strong>
     *  Helps merchants quickly generate model try-on images for different products, reducing the costs of traditional photography, outfit changes, and post-production, and improving the production efficiency of product images.  </li>
     * <li><strong>Online shopping experience optimization:</strong>
     * Allows consumers to preview the wearing effect of products through virtual try-on, providing a more intuitive understanding of the style, matching, and overall effect of the products, which assists in purchase decisions and enhances the shopping experience.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>First, you need to input a model image and a product image. The system uses the model image as the try-on subject and applies the garment from the product image to the model:</strong><ul>
     * <li>a. Model image: the image of the person who will wear the clothing in the virtual try-on.</li>
     * <li>b. Product image: the image of the clothing, shoes, or hat to be worn by the model.</li>
     * </ul>
     * </li>
     * <li><strong>Second, you can select the corresponding product type based on the actual product. Supported types include tops, bottoms, jumpsuits, dresses, shoes, and hats:</strong><ul>
     * <li>a. Specify product type: you can directly input the type of the current product, and the system will process it according to the specified type.</li>
     * <li>b. Automatic type recognition: if you do not input the product type, the system will automatically recognize the product category in the product image and perform the virtual try-on based on the recognition result.</li>
     * </ul>
     * </li>
     * <li><strong>Finally, the system combines the model image, product image, and product type to generate a virtual try-on image, showing the wearing effect of the product on the model:</strong><ul>
     * <li>a. Preserve model details: the generation process does not adjust the appearance, hairstyle, pose, body shape, or other details of the person in the original model image.</li>
     * <li>b. Maintain image consistency: the background, composition, lighting, and overall visual effect of the original model image remain unchanged. Only the wearing area corresponding to the product is processed.</li>
     * <li>c. Generate try-on effect: the product is naturally applied to the model, fitting the person\&quot;s pose and body structure to generate a coordinated and realistic virtual try-on image.</li>
     * </ul>
     * </li>
     * </ul>
     * <h2>Examples</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Type</strong></th>
     * <th><strong>Model image</strong></th>
     * <th><strong>Garment image</strong></th>
     * <th><strong>Try-on result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Tops</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/e4273b03-0d3b-4e98-b8f3-8713fccee303.png" alt="lQLPJv-OKUNDSxvNBojNA62wAMWEBuiTUuMKXnNidWFWAA_941_1672.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/d9ab77f7-8791-4fa5-8d76-4fda3e2e1310.png" alt="Front view of male model wearing a shirt-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/42982786-73ee-4d23-a8d0-551f7a18be22.png" alt="7c1c0c04-9828-940f-b86d-c08f7ec8fb97_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Bottoms</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/f79a31cb-08bd-4b59-be9d-9b9aa3f60230.png" alt="Bootcut jeans-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/297f29eb-7bc9-49a5-b4f7-114375a0f312.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Shoes</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/bb9804b5-0ab9-485b-829b-d54708377fd2.png" alt="Front view of men\\&quot;s shoes-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/8e54fdc3-7a86-4e3b-aa1d-f3741ce7658c.png" alt="91d7b8c4-fc31-9a7f-8b6e-3bec5e62efb3_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Jumpsuits</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/7f5cec40-a884-4640-8339-6109305dfa1d.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/635096eb-f2b2-4fd8-91d8-4c7e2e7d7ad1.png" alt="20c8b46a-213e-985c-aab2-d56f8752f3a4_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Dresses</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/3d4a6de0-95d2-40cf-9105-48b5e899e0d3.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/a3cbb609-db71-47d6-8ac6-884f18c6596f.png" alt="45b630e6-4e9d-9bf0-bb4e-224b30a91f77_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Hats</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/ac26f38e-acc7-49d1-a4ec-a51b54e4bd66.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/34176b57-3aa8-4b6e-8d0f-808ae953654a.png" alt="Hat-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/949b4c28-8821-4aa5-a2b4-e4acc1e57b9b.png" alt="881f02f3-12f5-95dd-b651-98fab6e30fa0_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates virtual try-on images by using AI algorithms. This API service replaces the clothing on a model image with a specified garment image while preserving the model\&quot;s pose, facial features, and other details, ensuring a realistic and well-fitted result. You only need to provide the URLs of the original images to obtain the processed image.</p>
     * 
     * @param request VirtualTryOnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VirtualTryOnResponse
     */
    public VirtualTryOnResponse virtualTryOnWithOptions(VirtualTryOnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clothImageUrl)) {
            query.put("ClothImageUrl", request.clothImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clothType)) {
            query.put("ClothType", request.clothType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelImageUrl)) {
            query.put("ModelImageUrl", request.modelImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VirtualTryOn"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VirtualTryOnResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <ul>
     * <li><strong>Virtual try-on for clothing:</strong>
     * Supports various clothing categories such as tops, bottoms, jumpsuits, and dresses. After you upload a model image and a garment image, the system generates natural and realistic try-on effects to visually demonstrate how the clothing looks on the model.</li>
     * <li><strong>Virtual try-on for shoes and hats:</strong>
     * Supports virtual try-on for accessories such as shoes and hats. The system intelligently matches the position and proportion of the items based on the model\&quot;s pose and body parts to present a coordinated and realistic wearing effect.</li>
     * <li><strong>E-commerce product display and marketing:</strong>
     *  Helps merchants quickly generate model try-on images for different products, reducing the costs of traditional photography, outfit changes, and post-production, and improving the production efficiency of product images.  </li>
     * <li><strong>Online shopping experience optimization:</strong>
     * Allows consumers to preview the wearing effect of products through virtual try-on, providing a more intuitive understanding of the style, matching, and overall effect of the products, which assists in purchase decisions and enhances the shopping experience.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>First, you need to input a model image and a product image. The system uses the model image as the try-on subject and applies the garment from the product image to the model:</strong><ul>
     * <li>a. Model image: the image of the person who will wear the clothing in the virtual try-on.</li>
     * <li>b. Product image: the image of the clothing, shoes, or hat to be worn by the model.</li>
     * </ul>
     * </li>
     * <li><strong>Second, you can select the corresponding product type based on the actual product. Supported types include tops, bottoms, jumpsuits, dresses, shoes, and hats:</strong><ul>
     * <li>a. Specify product type: you can directly input the type of the current product, and the system will process it according to the specified type.</li>
     * <li>b. Automatic type recognition: if you do not input the product type, the system will automatically recognize the product category in the product image and perform the virtual try-on based on the recognition result.</li>
     * </ul>
     * </li>
     * <li><strong>Finally, the system combines the model image, product image, and product type to generate a virtual try-on image, showing the wearing effect of the product on the model:</strong><ul>
     * <li>a. Preserve model details: the generation process does not adjust the appearance, hairstyle, pose, body shape, or other details of the person in the original model image.</li>
     * <li>b. Maintain image consistency: the background, composition, lighting, and overall visual effect of the original model image remain unchanged. Only the wearing area corresponding to the product is processed.</li>
     * <li>c. Generate try-on effect: the product is naturally applied to the model, fitting the person\&quot;s pose and body structure to generate a coordinated and realistic virtual try-on image.</li>
     * </ul>
     * </li>
     * </ul>
     * <h2>Examples</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Type</strong></th>
     * <th><strong>Model image</strong></th>
     * <th><strong>Garment image</strong></th>
     * <th><strong>Try-on result</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Tops</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/e4273b03-0d3b-4e98-b8f3-8713fccee303.png" alt="lQLPJv-OKUNDSxvNBojNA62wAMWEBuiTUuMKXnNidWFWAA_941_1672.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/d9ab77f7-8791-4fa5-8d76-4fda3e2e1310.png" alt="Front view of male model wearing a shirt-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/42982786-73ee-4d23-a8d0-551f7a18be22.png" alt="7c1c0c04-9828-940f-b86d-c08f7ec8fb97_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Bottoms</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/f79a31cb-08bd-4b59-be9d-9b9aa3f60230.png" alt="Bootcut jeans-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/297f29eb-7bc9-49a5-b4f7-114375a0f312.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Shoes</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/64147be2-0c95-431a-8c04-f756fac96db2.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/bb9804b5-0ab9-485b-829b-d54708377fd2.png" alt="Front view of men\\&quot;s shoes-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/8e54fdc3-7a86-4e3b-aa1d-f3741ce7658c.png" alt="91d7b8c4-fc31-9a7f-8b6e-3bec5e62efb3_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Jumpsuits</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/7f5cec40-a884-4640-8339-6109305dfa1d.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/635096eb-f2b2-4fd8-91d8-4c7e2e7d7ad1.png" alt="20c8b46a-213e-985c-aab2-d56f8752f3a4_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Dresses</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/eddffa7c-a494-4f5b-9d66-da758fb0265f.jpeg" alt="lQDPJwcNMfxtoRvNBQDNAtCwhseujKzDt_QKXnNSTPaeAA_720_1280.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/3d4a6de0-95d2-40cf-9105-48b5e899e0d3.png" alt="image.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/a3cbb609-db71-47d6-8ac6-884f18c6596f.png" alt="45b630e6-4e9d-9bf0-bb4e-224b30a91f77_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * <tr>
     * <td>Hats</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/ac26f38e-acc7-49d1-a4ec-a51b54e4bd66.png" alt="adbb8e02-9738-991a-9699-f46bc5c089a9_qwen_image3_serving_output_0.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/34176b57-3aa8-4b6e-8d0f-808ae953654a.png" alt="Hat-aidge.png"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/4j6OJ5PZM1WeKq3p/img/949b4c28-8821-4aa5-a2b4-e4acc1e57b9b.png" alt="881f02f3-12f5-95dd-b651-98fab6e30fa0_qwen_image3_serving_output_0.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates virtual try-on images by using AI algorithms. This API service replaces the clothing on a model image with a specified garment image while preserving the model\&quot;s pose, facial features, and other details, ensuring a realistic and well-fitted result. You only need to provide the URLs of the original images to obtain the processed image.</p>
     * 
     * @param request VirtualTryOnRequest
     * @return VirtualTryOnResponse
     */
    public VirtualTryOnResponse virtualTryOn(VirtualTryOnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.virtualTryOnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>1. Product introduction</h1>
     * <p>Provides a one-stop AI image processing service for e-commerce sellers. Orchestrates six atomic capabilities—element recognition, intelligent cutout, intelligent erasure, image translation Pro, intelligent cropping, and high-definition upscaling—into an image processing workflow. Users can upload an image once, select the required capabilities, and complete multiple image optimizations in sequence to output product images that meet the requirements of e-commerce platforms. (Asynchronous)</p>
     * <h1>2. Scenarios</h1>
     * <p>Applicable to batch optimization of product images in cross-platform listing scenarios. Adapts source product images into main images, SKU images, and detail images required by listing platforms. Supports the following operations:</p>
     * <ul>
     * <li><p>Identifies low-quality images with text, watermarks, logos, or cluttered text, and allows users to filter the images to be processed.</p>
     * </li>
     * <li><p>Removes non-compliant elements such as watermarks, logos, cluttered text, and Chinese text from the original image.</p>
     * </li>
     * <li><p>Removes the background around the main product subject.</p>
     * </li>
     * <li><p>Translates text in the image into other languages.</p>
     * </li>
     * <li><p>Expands the image to other sizes (by ratio or dimensions) and automatically fills the background.</p>
     * </li>
     * <li><p>Crops the image to a specified size.</p>
     * </li>
     * <li><p>Upscales the image pixels by a specified factor.</p>
     * </li>
     * </ul>
     * <h1>3. Features</h1>
     * <p>Users input the URL of a product image and select the required AI capabilities through the Ability parameter (1=Intelligent element recognition, 2=Intelligent cutout, 3=Intelligent erasure, 4=Image translation Pro, 5=Image expansion, 6=Intelligent cropping, 7=High-definition upscaling). The system executes the selected capabilities in a preset sequence. Because intelligent element recognition helps users determine whether an image contains specific elements, and the presence of these elements affects the selection of subsequent AI capabilities, an additional input option is provided. This option allows users to choose whether to filter out images from subsequent AI processing or retain them without further processing.
     * <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/bddb522a-0795-4b5c-b25d-10e933426367.svg" alt="ai-pipeline-flowchart.svg">
     * The following section describes each AI capability:
     * <strong>1. Intelligent element recognition</strong>: An element detection capability designed specifically for e-commerce images. It identifies elements such as text, logos, watermarks, and text blocks in the subject and background of an image, and returns Boolean detection results. Users can filter images based on the recognition results (for example, processing only images with watermarks) and link this capability with subsequent ones—first identifying the types of elements to be optimized, and then precisely executing operations such as erasure.</p>
     * <p><strong>2. Intelligent cutout</strong>: Automatically identifies the main product subject in an image and precisely separates it from the background. Based on deep learning models, it supports precise segmentation of complex edges such as hair and transparent objects. It can output images with transparent or white backgrounds, supports custom background colors and target size cropping, and directly generates product display images that comply with e-commerce platform specifications.</p>
     * <p><strong>3. Intelligent erasure</strong>: Automatically identifies and removes non-compliant elements in e-commerce images, such as text, specific names (brand or store names), transparent text blocks, and cluttered text. It supports specifying the removal of elements in the subject area or non-subject area separately. It also supports precisely specifying the removal area through the Mask parameter to achieve efficient and compliant cleanup of large batches of images.</p>
     * <p><strong>4. Image translation Pro</strong>: Integrates multimodal large model technology to translate text in an image into a target language and directly renders it in the corresponding position of the original image. It supports over 100 language pairs. It provides features such as product subject text protection, brand name protection, and translation intervention glossaries to avoid mistranslating embedded product information. After translation, it can return layout information such as text position, font, and color to support secondary editing.</p>
     * <p><strong>5. Intelligent image expansion</strong>: Expands the image canvas based on AI generation technology to broaden the image field of view without cropping the subject. It supports multiple expansion methods: expanding by aspect ratio (1:1, 3:4, 4:3, 9:16, 16:9), scaling by horizontal or vertical proportion (1.0 to 3.0 times), and shifting pixels in the up, down, left, or right directions. The AI automatically fills and generates naturally transitioning background content.</p>
     * <p><strong>6. Intelligent cropping</strong>: Intelligently crops images to specified sizes, automatically identifies the main subject area of the image, and precisely retains the core content. It supports custom output width and height (100 to 5000 pixels) and adapts to the image size requirements of different e-commerce platforms and ad slots, ensuring that the subject stands out and the picture is balanced after cropping.</p>
     * <p><strong>7. High-definition upscaling</strong>: Enhances details and reduces noise while upscaling the image. It supports 2x to 4x upscaling. It is applicable to improving the clarity of low-resolution product images and optimizing visual presentation. It supports output in formats such as PNG, JPG, and BMP.</p>
     * <h1>4. Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Capabilities used</strong></th>
     * <th><strong>Output image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/3c1af966-8a5a-491d-9bfa-aefc321c9bed.png" alt="image.png"></td>
     * <td>*   Intelligent recognition</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Image translation Pro</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/c2579e3e-389e-4717-84e3-834e60fea6b0.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/a92d14a9-ecf4-4e77-ad96-a2fcdd95dd1d.png" alt="image.png"> | *   Intelligent cutout</p>
     * </li>
     * <li><p>Intelligent erasure</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/f631f578-3496-4aa1-b5ef-cd1ea603e049.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/12965cf8-cfdf-4a85-95fe-fdfcefcaa4ae.png" alt="C2.png"> | *   Intelligent recognition</p>
     * </li>
     * <li><p>Intelligent erasure</p>
     * </li>
     * <li><p>High-definition upscaling | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/95d29e79-8622-45fb-b284-cd580fe40ea0.jpeg" alt="R2.jpeg"> |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-stop AI image processing service for e-commerce sellers. Orchestrates six atomic capabilities—element recognition, intelligent cutout, intelligent erasure, image translation Pro, intelligent cropping, and high-definition upscaling—into an image processing workflow. Users can upload an image once, select the required capabilities, and complete multiple image optimizations in sequence to output product images that meet the requirements of e-commerce platforms. (Asynchronous)</p>
     * 
     * @param tmpReq VisionFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VisionFlowResponse
     */
    public VisionFlowResponse visionFlowWithOptions(VisionFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        VisionFlowShrinkRequest request = new VisionFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ability)) {
            request.abilityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ability, "Ability", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nonobjectDetectElements)) {
            request.nonobjectDetectElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nonobjectDetectElements, "NonobjectDetectElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nonobjectRemoveElements)) {
            request.nonobjectRemoveElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nonobjectRemoveElements, "NonobjectRemoveElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectDetectElements)) {
            request.objectDetectElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectDetectElements, "ObjectDetectElements", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectRemoveElements)) {
            request.objectRemoveElementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectRemoveElements, "ObjectRemoveElements", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abilityShrink)) {
            query.put("Ability", request.abilityShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backGroundType)) {
            query.put("BackGroundType", request.backGroundType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.glossary)) {
            query.put("Glossary", request.glossary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includingProductArea)) {
            query.put("IncludingProductArea", request.includingProductArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isFilter)) {
            query.put("IsFilter", request.isFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonobjectDetectElementsShrink)) {
            query.put("NonobjectDetectElements", request.nonobjectDetectElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonobjectRemoveElementsShrink)) {
            query.put("NonobjectRemoveElements", request.nonobjectRemoveElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectDetectElementsShrink)) {
            query.put("ObjectDetectElements", request.objectDetectElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectRemoveElementsShrink)) {
            query.put("ObjectRemoveElements", request.objectRemoveElementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHeight)) {
            query.put("TargetHeight", request.targetHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            query.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetWidth)) {
            query.put("TargetWidth", request.targetWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translatingBrandInTheProduct)) {
            query.put("TranslatingBrandInTheProduct", request.translatingBrandInTheProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upscaleFactor)) {
            query.put("UpscaleFactor", request.upscaleFactor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VisionFlow"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VisionFlowResponse());
    }

    /**
     * <b>description</b> :
     * <h1>1. Product introduction</h1>
     * <p>Provides a one-stop AI image processing service for e-commerce sellers. Orchestrates six atomic capabilities—element recognition, intelligent cutout, intelligent erasure, image translation Pro, intelligent cropping, and high-definition upscaling—into an image processing workflow. Users can upload an image once, select the required capabilities, and complete multiple image optimizations in sequence to output product images that meet the requirements of e-commerce platforms. (Asynchronous)</p>
     * <h1>2. Scenarios</h1>
     * <p>Applicable to batch optimization of product images in cross-platform listing scenarios. Adapts source product images into main images, SKU images, and detail images required by listing platforms. Supports the following operations:</p>
     * <ul>
     * <li><p>Identifies low-quality images with text, watermarks, logos, or cluttered text, and allows users to filter the images to be processed.</p>
     * </li>
     * <li><p>Removes non-compliant elements such as watermarks, logos, cluttered text, and Chinese text from the original image.</p>
     * </li>
     * <li><p>Removes the background around the main product subject.</p>
     * </li>
     * <li><p>Translates text in the image into other languages.</p>
     * </li>
     * <li><p>Expands the image to other sizes (by ratio or dimensions) and automatically fills the background.</p>
     * </li>
     * <li><p>Crops the image to a specified size.</p>
     * </li>
     * <li><p>Upscales the image pixels by a specified factor.</p>
     * </li>
     * </ul>
     * <h1>3. Features</h1>
     * <p>Users input the URL of a product image and select the required AI capabilities through the Ability parameter (1=Intelligent element recognition, 2=Intelligent cutout, 3=Intelligent erasure, 4=Image translation Pro, 5=Image expansion, 6=Intelligent cropping, 7=High-definition upscaling). The system executes the selected capabilities in a preset sequence. Because intelligent element recognition helps users determine whether an image contains specific elements, and the presence of these elements affects the selection of subsequent AI capabilities, an additional input option is provided. This option allows users to choose whether to filter out images from subsequent AI processing or retain them without further processing.
     * <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/bddb522a-0795-4b5c-b25d-10e933426367.svg" alt="ai-pipeline-flowchart.svg">
     * The following section describes each AI capability:
     * <strong>1. Intelligent element recognition</strong>: An element detection capability designed specifically for e-commerce images. It identifies elements such as text, logos, watermarks, and text blocks in the subject and background of an image, and returns Boolean detection results. Users can filter images based on the recognition results (for example, processing only images with watermarks) and link this capability with subsequent ones—first identifying the types of elements to be optimized, and then precisely executing operations such as erasure.</p>
     * <p><strong>2. Intelligent cutout</strong>: Automatically identifies the main product subject in an image and precisely separates it from the background. Based on deep learning models, it supports precise segmentation of complex edges such as hair and transparent objects. It can output images with transparent or white backgrounds, supports custom background colors and target size cropping, and directly generates product display images that comply with e-commerce platform specifications.</p>
     * <p><strong>3. Intelligent erasure</strong>: Automatically identifies and removes non-compliant elements in e-commerce images, such as text, specific names (brand or store names), transparent text blocks, and cluttered text. It supports specifying the removal of elements in the subject area or non-subject area separately. It also supports precisely specifying the removal area through the Mask parameter to achieve efficient and compliant cleanup of large batches of images.</p>
     * <p><strong>4. Image translation Pro</strong>: Integrates multimodal large model technology to translate text in an image into a target language and directly renders it in the corresponding position of the original image. It supports over 100 language pairs. It provides features such as product subject text protection, brand name protection, and translation intervention glossaries to avoid mistranslating embedded product information. After translation, it can return layout information such as text position, font, and color to support secondary editing.</p>
     * <p><strong>5. Intelligent image expansion</strong>: Expands the image canvas based on AI generation technology to broaden the image field of view without cropping the subject. It supports multiple expansion methods: expanding by aspect ratio (1:1, 3:4, 4:3, 9:16, 16:9), scaling by horizontal or vertical proportion (1.0 to 3.0 times), and shifting pixels in the up, down, left, or right directions. The AI automatically fills and generates naturally transitioning background content.</p>
     * <p><strong>6. Intelligent cropping</strong>: Intelligently crops images to specified sizes, automatically identifies the main subject area of the image, and precisely retains the core content. It supports custom output width and height (100 to 5000 pixels) and adapts to the image size requirements of different e-commerce platforms and ad slots, ensuring that the subject stands out and the picture is balanced after cropping.</p>
     * <p><strong>7. High-definition upscaling</strong>: Enhances details and reduces noise while upscaling the image. It supports 2x to 4x upscaling. It is applicable to improving the clarity of low-resolution product images and optimizing visual presentation. It supports output in formats such as PNG, JPG, and BMP.</p>
     * <h1>4. Effect comparison</h1>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Capabilities used</strong></th>
     * <th><strong>Output image</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/3c1af966-8a5a-491d-9bfa-aefc321c9bed.png" alt="image.png"></td>
     * <td>*   Intelligent recognition</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Image translation Pro</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/c2579e3e-389e-4717-84e3-834e60fea6b0.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/a92d14a9-ecf4-4e77-ad96-a2fcdd95dd1d.png" alt="image.png"> | *   Intelligent cutout</p>
     * </li>
     * <li><p>Intelligent erasure</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/f631f578-3496-4aa1-b5ef-cd1ea603e049.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/12965cf8-cfdf-4a85-95fe-fdfcefcaa4ae.png" alt="C2.png"> | *   Intelligent recognition</p>
     * </li>
     * <li><p>Intelligent erasure</p>
     * </li>
     * <li><p>High-definition upscaling | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/95d29e79-8622-45fb-b284-cd580fe40ea0.jpeg" alt="R2.jpeg"> |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-stop AI image processing service for e-commerce sellers. Orchestrates six atomic capabilities—element recognition, intelligent cutout, intelligent erasure, image translation Pro, intelligent cropping, and high-definition upscaling—into an image processing workflow. Users can upload an image once, select the required capabilities, and complete multiple image optimizations in sequence to output product images that meet the requirements of e-commerce platforms. (Asynchronous)</p>
     * 
     * @param request VisionFlowRequest
     * @return VisionFlowResponse
     */
    public VisionFlowResponse visionFlow(VisionFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.visionFlowWithOptions(request, runtime);
    }
}
