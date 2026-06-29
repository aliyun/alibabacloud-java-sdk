// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428;

import com.aliyun.tea.*;
import com.aliyun.aidge20260428.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "aidge.cn-beijing.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>A one-click cross-platform product material optimization service for cross-border e-commerce sellers (minimum cost version). Input product links from source platforms to generate optimized materials including titles, attributes, main images, SKU images, detail images, and descriptions that comply with the target platform\&quot;s requirements. Uses officially pre-built minimum-cost workflows, primarily based on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * <h2>Applicable Scenarios</h2>
     * <p>Suitable for cost-sensitive cross-platform product listing scenarios where speed, volume, and affordability are top priorities: for example, bulk listing from 1688 to TEMU, high-SKU inventory batch uploads, entry-level AI processing capabilities provided by top sellers and ERP/SaaS platforms, and merchants with high daily processing volumes but low requirements for marketing performance.
     * By filtering images containing watermarks or non-compliant elements and prioritizing clean original images, it helps merchants complete cross-platform listings at minimal cost.</p>
     * <h2>Feature Overview</h2>
     * <p>This service uses an officially pre-built &quot;Minimum Cost&quot; product optimization workflow, covering the full pipeline from material acquisition, compliance filtering, text optimization, to image processing:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract multiple material types including titles, SKUs, main images, detail images, and attributes;</li>
     * <li>Performs text filtering and SEO optimization based on TEMU platform blacklisted terms and compliance rules;</li>
     * <li>Intelligently identifies watermarks, logos, and Chinese text in images, prioritizing filtering and selecting clean original images. SKU images and a small number of main images are processed using image translation capabilities to comply with platform standards (high-conversion images with marketing text may be filtered out);</li>
     * <li>Completes category matching, attribute filling, and localization rewriting according to target platform requirements.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>A one-click cross-platform product material optimization service for cross-border e-commerce sellers (minimum cost version). Input product links from source platforms to generate optimized materials including titles, attributes, main images, SKU images, detail images, and descriptions that comply with the target platform\&quot;s requirements. Uses officially pre-built minimum-cost workflows, primarily based on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
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
     * <h2>Product Introduction</h2>
     * <p>A one-click cross-platform product material optimization service for cross-border e-commerce sellers (minimum cost version). Input product links from source platforms to generate optimized materials including titles, attributes, main images, SKU images, detail images, and descriptions that comply with the target platform\&quot;s requirements. Uses officially pre-built minimum-cost workflows, primarily based on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * <h2>Applicable Scenarios</h2>
     * <p>Suitable for cost-sensitive cross-platform product listing scenarios where speed, volume, and affordability are top priorities: for example, bulk listing from 1688 to TEMU, high-SKU inventory batch uploads, entry-level AI processing capabilities provided by top sellers and ERP/SaaS platforms, and merchants with high daily processing volumes but low requirements for marketing performance.
     * By filtering images containing watermarks or non-compliant elements and prioritizing clean original images, it helps merchants complete cross-platform listings at minimal cost.</p>
     * <h2>Feature Overview</h2>
     * <p>This service uses an officially pre-built &quot;Minimum Cost&quot; product optimization workflow, covering the full pipeline from material acquisition, compliance filtering, text optimization, to image processing:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract multiple material types including titles, SKUs, main images, detail images, and attributes;</li>
     * <li>Performs text filtering and SEO optimization based on TEMU platform blacklisted terms and compliance rules;</li>
     * <li>Intelligently identifies watermarks, logos, and Chinese text in images, prioritizing filtering and selecting clean original images. SKU images and a small number of main images are processed using image translation capabilities to comply with platform standards (high-conversion images with marketing text may be filtered out);</li>
     * <li>Completes category matching, attribute filling, and localization rewriting according to target platform requirements.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>A one-click cross-platform product material optimization service for cross-border e-commerce sellers (minimum cost version). Input product links from source platforms to generate optimized materials including titles, attributes, main images, SKU images, detail images, and descriptions that comply with the target platform\&quot;s requirements. Uses officially pre-built minimum-cost workflows, primarily based on filtering and lightweight processing without invoking high-cost image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
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
     * <h2>Product Introduction</h2>
     * <p>A one-click cross-platform product listing optimization service (best effect edition) for cross-border e-commerce sellers. Takes a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting.</p>
     * <h2>Common scenarios</h2>
     * <p>Suitable for scenarios that demand high-quality cross-platform product listing assets and strong conversion performance. Examples include categories with high dependency on marketing assets such as apparel, accessories, beauty, and home goods. Also suitable for brand merchants and high-value products that need to retain marketing images with embedded copywriting. Ideal for top sellers and ERP/SaaS platforms conducting localized operations across multiple languages and markets, as well as scenarios that require category-specific assets (such as size charts and package weight/dimensions) to improve listing quality and conversion rates.</p>
     * <h2>Features</h2>
     * <p>This service uses the official pre-built &quot;Best Effect&quot; product optimization workflow, covering the entire pipeline from asset retrieval, diagnosis, filtering, and optimization to output:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract all assets including titles, SKUs, main images, detail images, and attributes. Intelligently diagnoses missing assets and optimization opportunities.</li>
     * <li>Uses LLM-based text compliance filtering, SEO keyword optimization, five-point description generation, and multilingual localization rewriting.</li>
     * <li>Invokes multiple image processing capabilities including intelligent recognition, intelligent background removal, intelligent erasure, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling.</li>
     * <li>Outputs category-specific assets, such as size charts and package weight/dimensions for apparel categories.</li>
     * <li>Outputs a standardized product asset package ready for direct listing.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product listing optimization service (best effect edition) for cross-border e-commerce sellers. Takes a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses the official pre-built best-effect workflow to maximize AI capabilities, retains and localizes brand marketing assets, and outputs category-specific assets such as size charts for apparel categories. (Asynchronous).</p>
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
     * <h2>Product Introduction</h2>
     * <p>A one-click cross-platform product listing optimization service (best effect edition) for cross-border e-commerce sellers. Takes a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting.</p>
     * <h2>Common scenarios</h2>
     * <p>Suitable for scenarios that demand high-quality cross-platform product listing assets and strong conversion performance. Examples include categories with high dependency on marketing assets such as apparel, accessories, beauty, and home goods. Also suitable for brand merchants and high-value products that need to retain marketing images with embedded copywriting. Ideal for top sellers and ERP/SaaS platforms conducting localized operations across multiple languages and markets, as well as scenarios that require category-specific assets (such as size charts and package weight/dimensions) to improve listing quality and conversion rates.</p>
     * <h2>Features</h2>
     * <p>This service uses the official pre-built &quot;Best Effect&quot; product optimization workflow, covering the entire pipeline from asset retrieval, diagnosis, filtering, and optimization to output:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract all assets including titles, SKUs, main images, detail images, and attributes. Intelligently diagnoses missing assets and optimization opportunities.</li>
     * <li>Uses LLM-based text compliance filtering, SEO keyword optimization, five-point description generation, and multilingual localization rewriting.</li>
     * <li>Invokes multiple image processing capabilities including intelligent recognition, intelligent background removal, intelligent erasure, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling.</li>
     * <li>Outputs category-specific assets, such as size charts and package weight/dimensions for apparel categories.</li>
     * <li>Outputs a standardized product asset package ready for direct listing.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product listing optimization service (best effect edition) for cross-border e-commerce sellers. Takes a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses the official pre-built best-effect workflow to maximize AI capabilities, retains and localizes brand marketing assets, and outputs category-specific assets such as size charts for apparel categories. (Asynchronous).</p>
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
     * <p>Cross-platform product listing attribute filling: When merchants list products across platforms, different platforms such as the source platform and the TEMU platform require different attribute fields for different categories, with complex hierarchical associations (such as material → wood type → density). Manual filling is time-consuming and error-prone. This service automatically understands product information and intelligently fills in attributes. It is applicable to scenarios such as automated bulk listing for top sellers, ERP/SaaS platform integration, and quick product listing for SMB merchants.</p>
     * <h1>Features</h1>
     * <p>Users input the product title, source category, product details, SKU, product attributes, and product images (up to 10). The system uses multimodal AI to understand product semantics and visual features, and completes two core tasks: ① Matches the precise category path for the product on the TEMU platform. ② Automatically fills in the required attributes under that category (such as material, battery properties, size, and connectivity), and returns the confidence score and reasoning for each attribute. The API uses synchronous mode and returns results immediately upon invocation.</p>
     * <h1>Comparison</h1>
     * <p>The following example shows the attributes of a USB fan:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>1688 Attribute</strong></th>
     * <th><strong>1688 Attribute Value</strong></th>
     * <th><strong>TEMU Attribute</strong></th>
     * <th><strong>TEMU Attribute Value</strong></th>
     * <th><strong>Existing in 1688</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>品牌</td>
     * <td>其他</td>
     * <td>供电方式</td>
     * <td>USB充电（内置电池）</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>续航时长</td>
     * <td>3-6h(含)</td>
     * <td>可充电电池</td>
     * <td>锂系电池</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>附加功能</td>
     * <td>数显</td>
     * <td>电池容量（mAh）</td>
     * <td>4000</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>内置蓄电池容量</td>
     * <td>2000mAh-4000mAh（含）</td>
     * <td>风扇功能</td>
     * <td>高速特征</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>货号</td>
     * <td>X699</td>
     * <td>控制方式</td>
     * <td>按键</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>主要下游平台</td>
     * <td>ebay,亚马逊,wish,速卖通,独立站,LAZADA,其他</td>
     * <td>完成类型</td>
     * <td>涂漆</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>有可授权的自有品牌</td>
     * <td>否</td>
     * <td>推荐使用</td>
     * <td>冷却</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>尺寸</td>
     * <td>65\*60\*171</td>
     * <td>电风扇设计</td>
     * <td>可穿戴风扇</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>适用送礼场合</td>
     * <td>个人礼品</td>
     * <td>包含的组件</td>
     * <td>无</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>外壳工艺</td>
     * <td>喷涂（UV漆，橡胶漆，金属漆，钢琴烤漆，珠光粉）</td>
     * <td>材料</td>
     * <td>塑料</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>包装体积</td>
     * <td>65\*60\*171</td>
     * <td>特殊功能</td>
     * <td>便携式</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>外观尺寸</td>
     * <td>51\*36\*34</td>
     * <td>室内外使用</td>
     * <td>室内室外均可</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>风速档位</td>
     * <td>3档</td>
     * <td>品牌名</td>
     * <td>无</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>操作方式</td>
     * <td>普通按钮</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>扇叶材质</td>
     * <td>ABS</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>电源方式</td>
     * <td>USB</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>是否内置电池</td>
     * <td>内置电池</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>是否专利货源</td>
     * <td>否</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>颜色</td>
     * <td>X699风扇-黄色,X699风扇-浅紫色,X699风扇-天蓝色,X699风扇-橙色,X699风扇-浅绿色,普通小风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>主要销售地区</td>
     * <td>日韩,非洲,韩国,日本,欧洲,南美,东南亚,北美,东北亚,中东,拉丁美洲,欧美,其他</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>是否跨境出口专供货源</td>
     * <td>是</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>风格</td>
     * <td>清新</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>电机类型</td>
     * <td>无刷电机</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>噪音</td>
     * <td>36dB(A)-45dB(A)(含)</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>产品净重</td>
     * <td>125g</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>扇叶数量</td>
     * <td>6片及以上</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>风扇分类</td>
     * <td>手持风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides a cross-platform product category and attribute intelligent filling service based on multimodal large models. Takes product information from a source platform, automatically matches the category on the target listing platform, and intelligently fills in all required attribute fields under that category, offering a one-stop solution for category selection and attribute filling during product listing. (Synchronous).</p>
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
     * <p>Cross-platform product listing attribute filling: When merchants list products across platforms, different platforms such as the source platform and the TEMU platform require different attribute fields for different categories, with complex hierarchical associations (such as material → wood type → density). Manual filling is time-consuming and error-prone. This service automatically understands product information and intelligently fills in attributes. It is applicable to scenarios such as automated bulk listing for top sellers, ERP/SaaS platform integration, and quick product listing for SMB merchants.</p>
     * <h1>Features</h1>
     * <p>Users input the product title, source category, product details, SKU, product attributes, and product images (up to 10). The system uses multimodal AI to understand product semantics and visual features, and completes two core tasks: ① Matches the precise category path for the product on the TEMU platform. ② Automatically fills in the required attributes under that category (such as material, battery properties, size, and connectivity), and returns the confidence score and reasoning for each attribute. The API uses synchronous mode and returns results immediately upon invocation.</p>
     * <h1>Comparison</h1>
     * <p>The following example shows the attributes of a USB fan:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>1688 Attribute</strong></th>
     * <th><strong>1688 Attribute Value</strong></th>
     * <th><strong>TEMU Attribute</strong></th>
     * <th><strong>TEMU Attribute Value</strong></th>
     * <th><strong>Existing in 1688</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>品牌</td>
     * <td>其他</td>
     * <td>供电方式</td>
     * <td>USB充电（内置电池）</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>续航时长</td>
     * <td>3-6h(含)</td>
     * <td>可充电电池</td>
     * <td>锂系电池</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>附加功能</td>
     * <td>数显</td>
     * <td>电池容量（mAh）</td>
     * <td>4000</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>内置蓄电池容量</td>
     * <td>2000mAh-4000mAh（含）</td>
     * <td>风扇功能</td>
     * <td>高速特征</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>货号</td>
     * <td>X699</td>
     * <td>控制方式</td>
     * <td>按键</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>主要下游平台</td>
     * <td>ebay,亚马逊,wish,速卖通,独立站,LAZADA,其他</td>
     * <td>完成类型</td>
     * <td>涂漆</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>有可授权的自有品牌</td>
     * <td>否</td>
     * <td>推荐使用</td>
     * <td>冷却</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>尺寸</td>
     * <td>65\*60\*171</td>
     * <td>电风扇设计</td>
     * <td>可穿戴风扇</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>适用送礼场合</td>
     * <td>个人礼品</td>
     * <td>包含的组件</td>
     * <td>无</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>外壳工艺</td>
     * <td>喷涂（UV漆，橡胶漆，金属漆，钢琴烤漆，珠光粉）</td>
     * <td>材料</td>
     * <td>塑料</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>包装体积</td>
     * <td>65\*60\*171</td>
     * <td>特殊功能</td>
     * <td>便携式</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>外观尺寸</td>
     * <td>51\*36\*34</td>
     * <td>室内外使用</td>
     * <td>室内室外均可</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>风速档位</td>
     * <td>3档</td>
     * <td>品牌名</td>
     * <td>无</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>操作方式</td>
     * <td>普通按钮</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>扇叶材质</td>
     * <td>ABS</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>电源方式</td>
     * <td>USB</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>是否内置电池</td>
     * <td>内置电池</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>是否专利货源</td>
     * <td>否</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>颜色</td>
     * <td>X699风扇-黄色,X699风扇-浅紫色,X699风扇-天蓝色,X699风扇-橙色,X699风扇-浅绿色,普通小风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>主要销售地区</td>
     * <td>日韩,非洲,韩国,日本,欧洲,南美,东南亚,北美,东北亚,中东,拉丁美洲,欧美,其他</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>是否跨境出口专供货源</td>
     * <td>是</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>风格</td>
     * <td>清新</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>电机类型</td>
     * <td>无刷电机</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>噪音</td>
     * <td>36dB(A)-45dB(A)(含)</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>产品净重</td>
     * <td>125g</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>扇叶数量</td>
     * <td>6片及以上</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>风扇分类</td>
     * <td>手持风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides a cross-platform product category and attribute intelligent filling service based on multimodal large models. Takes product information from a source platform, automatically matches the category on the target listing platform, and intelligently fills in all required attribute fields under that category, offering a one-stop solution for category selection and attribute filling during product listing. (Synchronous).</p>
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
     * <p>Provides a large language model-based cross-platform product category intelligent matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help sellers quickly select categories for cross-platform product listing. (Synchronous)</p>
     * <h2>Common scenarios</h2>
     * <p>Cross-platform product listing: After sourcing products, sellers need to map them to the correct categories in the target platform\&quot;s category tree. Manually selecting categories requires familiarity with the target platform\&quot;s entire category structure, which is time-consuming, labor-intensive, and error-prone. Incorrect category mapping can cause products to be delisted.
     * This service automates category mapping and is suitable for bulk API calls from large sellers\&quot; proprietary systems, integration into ERP/SaaS platforms for automated listing workflows, and quick single-product listing for SMB sellers.
     * The current version supports only TEMU as the target listing platform. Automatic retrieval of product information from source platforms is not yet supported and requires manual parameter input. This capability and support for additional source and target platforms will be added in future releases.</p>
     * <h2>Functions and features</h2>
     * <p>You can input fields such as product title, source category, product description, SKU information, and product attributes. The system uses an AI model to understand product semantics and matches the most appropriate category path from the full TEMU platform category tree. The response includes the complete category path (CategoryPath), category name (CategoryName), confidence score (0–100), and matching reason. The API uses synchronous mode and returns results immediately, making it suitable for embedding in real-time business workflows.</p>
     * <h2>Demo</h2>
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
     * <td>USB风扇、迷你风扇</td>
     * <td>TEMU</td>
     * <td>家电</td>
     * </tr>
     * <tr>
     * <td>\&gt;加热、冷却和空气质量电器</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;电风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;USB 风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>1688</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/jP2lRYjv7234mO8g/img/8a546f7d-826e-43d6-b5f3-12d1edef8897.png" alt="image.png"></td>
     * <td>手链</td>
     * <td>TEMU</td>
     * <td>服装、鞋靴和珠宝饰品</td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士饰品</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚手链、手镯</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚吊饰和吊饰手链</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚吊饰手链</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚链式吊饰手链</td>
     * <td>.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides a large language model-based cross-platform product category intelligent matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help sellers quickly select categories for cross-platform product listing. (Synchronous)</p>
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
     * <p>Provides a large language model-based cross-platform product category intelligent matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help sellers quickly select categories for cross-platform product listing. (Synchronous)</p>
     * <h2>Common scenarios</h2>
     * <p>Cross-platform product listing: After sourcing products, sellers need to map them to the correct categories in the target platform\&quot;s category tree. Manually selecting categories requires familiarity with the target platform\&quot;s entire category structure, which is time-consuming, labor-intensive, and error-prone. Incorrect category mapping can cause products to be delisted.
     * This service automates category mapping and is suitable for bulk API calls from large sellers\&quot; proprietary systems, integration into ERP/SaaS platforms for automated listing workflows, and quick single-product listing for SMB sellers.
     * The current version supports only TEMU as the target listing platform. Automatic retrieval of product information from source platforms is not yet supported and requires manual parameter input. This capability and support for additional source and target platforms will be added in future releases.</p>
     * <h2>Functions and features</h2>
     * <p>You can input fields such as product title, source category, product description, SKU information, and product attributes. The system uses an AI model to understand product semantics and matches the most appropriate category path from the full TEMU platform category tree. The response includes the complete category path (CategoryPath), category name (CategoryName), confidence score (0–100), and matching reason. The API uses synchronous mode and returns results immediately, making it suitable for embedding in real-time business workflows.</p>
     * <h2>Demo</h2>
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
     * <td>USB风扇、迷你风扇</td>
     * <td>TEMU</td>
     * <td>家电</td>
     * </tr>
     * <tr>
     * <td>\&gt;加热、冷却和空气质量电器</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;电风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;USB 风扇</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>1688</td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/jP2lRYjv7234mO8g/img/8a546f7d-826e-43d6-b5f3-12d1edef8897.png" alt="image.png"></td>
     * <td>手链</td>
     * <td>TEMU</td>
     * <td>服装、鞋靴和珠宝饰品</td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士饰品</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚手链、手镯</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚吊饰和吊饰手链</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚吊饰手链</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>\&gt;女士时尚链式吊饰手链</td>
     * <td>.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides a large language model-based cross-platform product category intelligent matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help sellers quickly select categories for cross-platform product listing. (Synchronous)</p>
     * 
     * @param request CategoryMatchRequest
     * @return CategoryMatchResponse
     */
    public CategoryMatchResponse categoryMatch(CategoryMatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.categoryMatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>Designed specifically for document translation, this service supports translation between more than 100 language pairs (including bridged pairs), handling multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * The service excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, parameter and unit accuracy.</li>
     * <li>Structural integrity: overall layout continuity, page margin and layout preservation.</li>
     * </ul>
     * <h2>Common scenarios</h2>
     * <p>Cross-border e-commerce product manuals, contracts, agreements, business proposals, qualification documents, textbooks, courseware, and other scenarios.
     * 3. Features</p>
     * <ul>
     * <li>Supports PDF and Word formats. Supports source documents that contain multiple languages. For a detailed list of supported languages, see section 4.5.</li>
     * <li>Supports translation of text within images in documents, as well as complex translation scenarios such as charts and special symbols.</li>
     * <li>Supports high-fidelity layout preservation after translation.</li>
     * <li>A single PDF supports up to 100 pages, and a single Word document supports up to 100 pages.</li>
     * <li>Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for brand name protection. Pass the corresponding glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 glossary entries. If you need more, contact the platform for assistance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Designed specifically for document translation, this service supports translation between more than 100 language pairs (including bridged pairs), handling multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * The service excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, parameter and unit accuracy.</li>
     * <li>Structural integrity: overall layout continuity, page margin and layout preservation.</li>
     * </ul>
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
     * <h2>Product Introduction</h2>
     * <p>Designed specifically for document translation, this service supports translation between more than 100 language pairs (including bridged pairs), handling multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * The service excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, parameter and unit accuracy.</li>
     * <li>Structural integrity: overall layout continuity, page margin and layout preservation.</li>
     * </ul>
     * <h2>Common scenarios</h2>
     * <p>Cross-border e-commerce product manuals, contracts, agreements, business proposals, qualification documents, textbooks, courseware, and other scenarios.
     * 3. Features</p>
     * <ul>
     * <li>Supports PDF and Word formats. Supports source documents that contain multiple languages. For a detailed list of supported languages, see section 4.5.</li>
     * <li>Supports translation of text within images in documents, as well as complex translation scenarios such as charts and special symbols.</li>
     * <li>Supports high-fidelity layout preservation after translation.</li>
     * <li>A single PDF supports up to 100 pages, and a single Word document supports up to 100 pages.</li>
     * <li>Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for brand name protection. Pass the corresponding glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 glossary entries. If you need more, contact the platform for assistance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Designed specifically for document translation, this service supports translation between more than 100 language pairs (including bridged pairs), handling multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * The service excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, parameter and unit accuracy.</li>
     * <li>Structural integrity: overall layout continuity, page margin and layout preservation.</li>
     * </ul>
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
     * <h2>Product Overview</h2>
     * <p>The image cropping product can resize input images to specified dimensions. It supports automatic identification of the main subject area in images and precisely crops to various sizes to meet design requirements for different scenarios. (Synchronous)</p>
     * <h2>Use Cases</h2>
     * <ul>
     * <li><p><strong>Multi-platform Content Distribution</strong>: Automatically generate content in multiple sizes to meet the different image size requirements of various platforms and scenarios.</p>
     * </li>
     * <li><p><strong>Content Placement</strong>: Automatically adjust sizes for different ad slots on different platforms, highlighting the main content, reducing blank space, and showcasing product features.</p>
     * </li>
     * </ul>
     * <h2>Feature Description</h2>
     * <ul>
     * <li><p>Automatically identify the main subject area of an image and crop precisely.</p>
     * </li>
     * <li><p>Support custom crop size output to adapt to different platforms and devices.</p>
     * </li>
     * </ul>
     * <h2>Effect Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original Image</strong></th>
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
     * <p>Intelligently crop images to specified dimensions, automatically identify the main subject area of the image, and precisely crop to various sizes to meet design requirements for different scenarios. (Synchronous)</p>
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
     * <h2>Product Overview</h2>
     * <p>The image cropping product can resize input images to specified dimensions. It supports automatic identification of the main subject area in images and precisely crops to various sizes to meet design requirements for different scenarios. (Synchronous)</p>
     * <h2>Use Cases</h2>
     * <ul>
     * <li><p><strong>Multi-platform Content Distribution</strong>: Automatically generate content in multiple sizes to meet the different image size requirements of various platforms and scenarios.</p>
     * </li>
     * <li><p><strong>Content Placement</strong>: Automatically adjust sizes for different ad slots on different platforms, highlighting the main content, reducing blank space, and showcasing product features.</p>
     * </li>
     * </ul>
     * <h2>Feature Description</h2>
     * <ul>
     * <li><p>Automatically identify the main subject area of an image and crop precisely.</p>
     * </li>
     * <li><p>Support custom crop size output to adapt to different platforms and devices.</p>
     * </li>
     * </ul>
     * <h2>Effect Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original Image</strong></th>
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
     * <p>Intelligently crop images to specified dimensions, automatically identify the main subject area of the image, and precisely crop to various sizes to meet design requirements for different scenarios. (Synchronous)</p>
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
     * <h2>Product Introduction</h2>
     * <p>Intelligent image matting automatically identifies salient subjects in images, separates subjects from backgrounds, and returns subject images with backgrounds removed. The product also provides multiple background options and custom size selections to optimize product display. (Synchronous).</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Secondary editing of materials</strong>: After separating the image subject from the background, you can further edit the image.</p>
     * </li>
     * <li><p><strong>Improved material processing efficiency</strong>: Quickly extract subjects from various material images for easy background replacement, improving the production efficiency of advertising visuals and marketing posters.</p>
     * </li>
     * </ul>
     * <h2>Features.</h2>
     * <h4>1. One-click precise subject recognition</h4>
     * <ul>
     * <li><p><strong>AI automatic recognition</strong>: Based on deep learning models, the feature intelligently distinguishes foreground subjects (portraits, products, objects, etc.) from backgrounds without manual tracing.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports precise segmentation in complex scenarios (such as hair strands, transparent objects, and fur edges) with an accuracy rate exceeding 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization of edge aliasing and semi-transparent areas (such as smoke and glass) while preserving natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, suitable for e-commerce, design, and other scenarios.</p>
     * </li>
     * <li><p><strong>Custom background color support</strong>.</p>
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
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/62b39e16-5b30-469f-88cd-7f31ba790008.jpeg" alt="主图3.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/bfad041f-a8e0-4d6f-a2bf-999292ea9ebc.jpeg" alt="ae4cd8ce912c4d9fa171dc5217be576d_202605251928_0.5899999737739563.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/b201b356-24b8-4f98-babc-c7fe918bdc37.jpeg" alt="主图2.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/8b266603-e80a-42dd-9d3d-6fa9f0948e52.jpeg" alt="52033655bd054737960a87518655d935_202605251926_5.959999978542328.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/d3c0d876-42a0-4294-8ce5-2a20df2deab9.jpeg" alt="主图6.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/5677f55e-4fe3-4978-a676-1ce71ad604b0.jpeg" alt="abdecd31cc45450f83b33f9baf4499c6_202605251930_7.9700000286102295.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligent image matting automatically identifies salient subjects in images, separates subjects from backgrounds, and returns subject images with backgrounds removed. The product also provides multiple background options and custom size selections to optimize product display. (Synchronous).</p>
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
     * <h2>Product Introduction</h2>
     * <p>Intelligent image matting automatically identifies salient subjects in images, separates subjects from backgrounds, and returns subject images with backgrounds removed. The product also provides multiple background options and custom size selections to optimize product display. (Synchronous).</p>
     * <h2>Scenarios</h2>
     * <ul>
     * <li><p><strong>Secondary editing of materials</strong>: After separating the image subject from the background, you can further edit the image.</p>
     * </li>
     * <li><p><strong>Improved material processing efficiency</strong>: Quickly extract subjects from various material images for easy background replacement, improving the production efficiency of advertising visuals and marketing posters.</p>
     * </li>
     * </ul>
     * <h2>Features.</h2>
     * <h4>1. One-click precise subject recognition</h4>
     * <ul>
     * <li><p><strong>AI automatic recognition</strong>: Based on deep learning models, the feature intelligently distinguishes foreground subjects (portraits, products, objects, etc.) from backgrounds without manual tracing.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports precise segmentation in complex scenarios (such as hair strands, transparent objects, and fur edges) with an accuracy rate exceeding 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization of edge aliasing and semi-transparent areas (such as smoke and glass) while preserving natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, suitable for e-commerce, design, and other scenarios.</p>
     * </li>
     * <li><p><strong>Custom background color support</strong>.</p>
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
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/62b39e16-5b30-469f-88cd-7f31ba790008.jpeg" alt="主图3.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/bfad041f-a8e0-4d6f-a2bf-999292ea9ebc.jpeg" alt="ae4cd8ce912c4d9fa171dc5217be576d_202605251928_0.5899999737739563.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/b201b356-24b8-4f98-babc-c7fe918bdc37.jpeg" alt="主图2.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/8b266603-e80a-42dd-9d3d-6fa9f0948e52.jpeg" alt="52033655bd054737960a87518655d935_202605251926_5.959999978542328.jpeg"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/d3c0d876-42a0-4294-8ce5-2a20df2deab9.jpeg" alt="主图6.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/a2QnV4jwexAy7O4X/img/5677f55e-4fe3-4978-a676-1ce71ad604b0.jpeg" alt="abdecd31cc45450f83b33f9baf4499c6_202605251930_7.9700000286102295.jpeg"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligent image matting automatically identifies salient subjects in images, separates subjects from backgrounds, and returns subject images with backgrounds removed. The product also provides multiple background options and custom size selections to optimize product display. (Synchronous).</p>
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
     * <h2>Product Introduction</h2>
     * <p>The Intelligent Element Recognition API is designed specifically for identifying specific elements in e-commerce images. It analyzes image details in depth, helping you quickly identify elements such as text, logos, watermarks, and text-containing color blocks in both the subject and background of images. This greatly improves the efficiency and accuracy of image screening. (Synchronous).</p>
     * <h2>Scenarios</h2>
     * <p><strong>1. Intelligent image screening and optimization:</strong>
     * Merchants and platforms can use the Intelligent Element Recognition API for image screening to automatically identify images that contain specific elements such as watermarks and logos. After screening, you can call the Intelligent Removal API to optimize these images, improve image quality, and shorten the product release cycle.
     * <strong>2. Automated image processing and efficiency improvement:</strong>
     * With the Intelligent Element Recognition API, merchants and platforms can automate the image processing workflow by automatically identifying and marking image elements that require optimization. This process reduces manual intervention and improves image processing efficiency.</p>
     * <h2>Features</h2>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, refer to the related examples in the removal documentation (reserved text link)</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image</p>
     * </li>
     * <li><p>Image background: The remaining part of the image other than the product subject</p>
     * </li>
     * <li><p>Text: Horizontal, vertical, or diagonal English or Chinese text</p>
     * </li>
     * <li><p>Logo: An emblem or trademark</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, emblems, images, URLs, or store names</p>
     * </li>
     * <li><p>Text-containing color block: A color block outside the subject that contains text</p>
     * </li>
     * </ul>
     * <p><strong>2. The main features of the Intelligent Element Recognition API include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether elements such as text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow coordination: Works in conjunction with the Intelligent Removal API. First, the Intelligent Element Recognition API identifies elements that need to be removed, and then the Intelligent Removal API effectively removes them, ensuring accuracy and efficiency in image processing.</p>
     * </li>
     * </ul>
     * <h2>Technical advantages</h2>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the Intelligent Element Recognition API can process large volumes of images while maintaining fast response times, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: You can select the element types to recognize based on your needs, including elements in both the subject and non-subject areas such as watermarks, logos, and text, to meet personalized recognition requirements.</p>
     * </li>
     * </ul>
     * <h2>Comparison</h2>
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
     * <li><p>Text-containing color block: true |.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Intelligent element recognition.</p>
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
     * <p>The Intelligent Element Recognition API is designed specifically for identifying specific elements in e-commerce images. It analyzes image details in depth, helping you quickly identify elements such as text, logos, watermarks, and text-containing color blocks in both the subject and background of images. This greatly improves the efficiency and accuracy of image screening. (Synchronous).</p>
     * <h2>Scenarios</h2>
     * <p><strong>1. Intelligent image screening and optimization:</strong>
     * Merchants and platforms can use the Intelligent Element Recognition API for image screening to automatically identify images that contain specific elements such as watermarks and logos. After screening, you can call the Intelligent Removal API to optimize these images, improve image quality, and shorten the product release cycle.
     * <strong>2. Automated image processing and efficiency improvement:</strong>
     * With the Intelligent Element Recognition API, merchants and platforms can automate the image processing workflow by automatically identifying and marking image elements that require optimization. This process reduces manual intervention and improves image processing efficiency.</p>
     * <h2>Features</h2>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, refer to the related examples in the removal documentation (reserved text link)</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image</p>
     * </li>
     * <li><p>Image background: The remaining part of the image other than the product subject</p>
     * </li>
     * <li><p>Text: Horizontal, vertical, or diagonal English or Chinese text</p>
     * </li>
     * <li><p>Logo: An emblem or trademark</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, emblems, images, URLs, or store names</p>
     * </li>
     * <li><p>Text-containing color block: A color block outside the subject that contains text</p>
     * </li>
     * </ul>
     * <p><strong>2. The main features of the Intelligent Element Recognition API include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether elements such as text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow coordination: Works in conjunction with the Intelligent Removal API. First, the Intelligent Element Recognition API identifies elements that need to be removed, and then the Intelligent Removal API effectively removes them, ensuring accuracy and efficiency in image processing.</p>
     * </li>
     * </ul>
     * <h2>Technical advantages</h2>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the Intelligent Element Recognition API can process large volumes of images while maintaining fast response times, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: You can select the element types to recognize based on your needs, including elements in both the subject and non-subject areas such as watermarks, logos, and text, to meet personalized recognition requirements.</p>
     * </li>
     * </ul>
     * <h2>Comparison</h2>
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
     * <li><p>Text-containing color block: true |.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Intelligent element recognition.</p>
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
     * <h2>Product Overview</h2>
     * <p>The Intelligent Image Removal product is specially designed for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and blemishes from e-commerce images. You can specify objects to remove from images as needed, enabling efficient and accurate batch processing of large volumes of images and simplifying the image editing workflow. (Synchronous)</p>
     * <h2>Use Cases</h2>
     * <ul>
     * <li><strong>Efficient E-commerce Image Processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide a cleaner, more focused product display and enhance the customer shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform Product Information Synchronization:</strong></li>
     * </ul>
     * <p>When merchants simultaneously list products across different e-commerce platforms, they can quickly remove specific text and blemishes to comply with different platform image specifications.</p>
     * <ul>
     * <li><strong>Marketing Material Preparation:</strong></li>
     * </ul>
     * <p>Merchants can easily remove existing promotional information and quickly update it with the latest campaign details.</p>
     * <blockquote>
     * <p>Note: Merchants or platforms can batch remove impurities from images to optimize image quality. We recommend using this in combination with the &quot;Intelligent Recognition API&quot; (coming soon). First, filter out images containing text, specific names, transparent text blocks, and blemishes, then use the &quot;Intelligent Removal API&quot; to batch remove them. The Intelligent Recognition API focuses on &quot;recognition,&quot; while the Intelligent Removal API focuses on &quot;removal.&quot; By calling them in sequence, you can maximize removal effectiveness and reduce &quot;false removals&quot; and &quot;false recognitions.&quot;</p>
     * </blockquote>
     * <h2>Feature Introduction</h2>
     * <ol>
     * <li><p>First, clarify the definitions of image subject and image background. In actual use, when specifying removal targets, you can choose whether the removal scope is the image subject or the image background area. Both API and editor integration methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: The core product area in the image</p>
     * </li>
     * <li><p>Image background: The remaining portion of the image apart from the product subject</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the removal targets support the following four types: text, specific names, transparent text blocks, and blemishes. You can use the following examples to clarify your usage requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Effect Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Removable Objects in Images</strong></th>
     * <th><strong>Original Image</strong></th>
     * <th><strong>Image After Removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Text</td>
     * <td>*   Involving the image subject area</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code>![done-image-4a2a96c2-9ac6-4b35-b76b-a6eac303740f (1).png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d72a7982-e761-4b45-af1e-f8f90b3f1fc3.png)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/47428227-7523-432e-89ce-eba263e5ebda.png" alt="image.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d69e38e4-5657-471d-aff6-1e6a4c269455.png" alt="359ddfcf-a2b1-4e59-ae54-5e76705d0adf.png"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/365024b4-4863-46d4-9013-bdd9408ea6b9.png" alt="c35611f8-dab4-4df2-8942-36d7375ed55f.png"> |
     * | Specific Names | *   Involving the image subject area</p>
     * <pre><code>![done-image-aca80515-aca6-4f4e-9429-47c5dd6b811f.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ac35f8bc-d527-49de-8fba-cdeb71e3b058.png)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/2db445c8-6bdd-424e-b6a7-2ddb46e6786d.png" alt="done-image-29a89f03-964a-455e-968c-7c8d5282ebbb.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/36ace8aa-3b3b-4b1c-81e6-b691104262f0.png" alt="fd2db0ab-1b89-4085-b91d-99f40a1aea77.png"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/a7653a0c-d14e-4f97-9c2f-83327b43203f.png" alt="8726b148-ab74-4409-a6c1-4c50fcac3887.png"> |
     * | Transparent Text Blocks | *   Involving the image subject area</p>
     * <pre><code>![image.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0f6068f0-168a-47bd-9fcd-c38b9e520506.png)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c9ac2a4c-0aa3-40ee-8855-62a262364dbe.png" alt="image.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/06ac537f-875a-48e2-8934-a84a79dfd8ff.jpeg" alt="8e84a5d6-da8c-4e3e-a705-71a66d0c78a2.jpeg"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/05759aef-1720-41cd-8800-f7d0801e4d95.jpeg" alt="b05173e7-2ae5-494e-99d2-7111fc966fd5.jpeg"> |
     * | Blemishes | *   Involving the image subject area</p>
     * <pre><code>![2.jpeg](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/bf1442f8-a9fa-40d3-bcb0-7a8a41b49b5d.jpeg)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0d68612e-845d-466f-8a4a-b85facea095b.png" alt="image.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/621daadc-454f-41b4-9ac4-752d457034b6.jpeg" alt="b6ef803f-743f-4e61-b901-d1f68167186f.jpeg"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |</p>
     * 
     * <b>summary</b> : 
     * <p>The Intelligent Image Removal product is specially designed for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and blemishes from e-commerce images. You can specify objects to remove from images as needed, enabling efficient and accurate batch processing of large volumes of images and simplifying the image editing workflow. (Synchronous)</p>
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
     * <h2>Product Overview</h2>
     * <p>The Intelligent Image Removal product is specially designed for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and blemishes from e-commerce images. You can specify objects to remove from images as needed, enabling efficient and accurate batch processing of large volumes of images and simplifying the image editing workflow. (Synchronous)</p>
     * <h2>Use Cases</h2>
     * <ul>
     * <li><strong>Efficient E-commerce Image Processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide a cleaner, more focused product display and enhance the customer shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform Product Information Synchronization:</strong></li>
     * </ul>
     * <p>When merchants simultaneously list products across different e-commerce platforms, they can quickly remove specific text and blemishes to comply with different platform image specifications.</p>
     * <ul>
     * <li><strong>Marketing Material Preparation:</strong></li>
     * </ul>
     * <p>Merchants can easily remove existing promotional information and quickly update it with the latest campaign details.</p>
     * <blockquote>
     * <p>Note: Merchants or platforms can batch remove impurities from images to optimize image quality. We recommend using this in combination with the &quot;Intelligent Recognition API&quot; (coming soon). First, filter out images containing text, specific names, transparent text blocks, and blemishes, then use the &quot;Intelligent Removal API&quot; to batch remove them. The Intelligent Recognition API focuses on &quot;recognition,&quot; while the Intelligent Removal API focuses on &quot;removal.&quot; By calling them in sequence, you can maximize removal effectiveness and reduce &quot;false removals&quot; and &quot;false recognitions.&quot;</p>
     * </blockquote>
     * <h2>Feature Introduction</h2>
     * <ol>
     * <li><p>First, clarify the definitions of image subject and image background. In actual use, when specifying removal targets, you can choose whether the removal scope is the image subject or the image background area. Both API and editor integration methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: The core product area in the image</p>
     * </li>
     * <li><p>Image background: The remaining portion of the image apart from the product subject</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the removal targets support the following four types: text, specific names, transparent text blocks, and blemishes. You can use the following examples to clarify your usage requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Effect Comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Removable Objects in Images</strong></th>
     * <th><strong>Original Image</strong></th>
     * <th><strong>Image After Removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Text</td>
     * <td>*   Involving the image subject area</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code>![done-image-4a2a96c2-9ac6-4b35-b76b-a6eac303740f (1).png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d72a7982-e761-4b45-af1e-f8f90b3f1fc3.png)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/47428227-7523-432e-89ce-eba263e5ebda.png" alt="image.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/d69e38e4-5657-471d-aff6-1e6a4c269455.png" alt="359ddfcf-a2b1-4e59-ae54-5e76705d0adf.png"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/365024b4-4863-46d4-9013-bdd9408ea6b9.png" alt="c35611f8-dab4-4df2-8942-36d7375ed55f.png"> |
     * | Specific Names | *   Involving the image subject area</p>
     * <pre><code>![done-image-aca80515-aca6-4f4e-9429-47c5dd6b811f.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ac35f8bc-d527-49de-8fba-cdeb71e3b058.png)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/2db445c8-6bdd-424e-b6a7-2ddb46e6786d.png" alt="done-image-29a89f03-964a-455e-968c-7c8d5282ebbb.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/36ace8aa-3b3b-4b1c-81e6-b691104262f0.png" alt="fd2db0ab-1b89-4085-b91d-99f40a1aea77.png"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/a7653a0c-d14e-4f97-9c2f-83327b43203f.png" alt="8726b148-ab74-4409-a6c1-4c50fcac3887.png"> |
     * | Transparent Text Blocks | *   Involving the image subject area</p>
     * <pre><code>![image.png](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0f6068f0-168a-47bd-9fcd-c38b9e520506.png)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c9ac2a4c-0aa3-40ee-8855-62a262364dbe.png" alt="image.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/06ac537f-875a-48e2-8934-a84a79dfd8ff.jpeg" alt="8e84a5d6-da8c-4e3e-a705-71a66d0c78a2.jpeg"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/05759aef-1720-41cd-8800-f7d0801e4d95.jpeg" alt="b05173e7-2ae5-494e-99d2-7111fc966fd5.jpeg"> |
     * | Blemishes | *   Involving the image subject area</p>
     * <pre><code>![2.jpeg](https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/bf1442f8-a9fa-40d3-bcb0-7a8a41b49b5d.jpeg)
     * </code></pre>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/0d68612e-845d-466f-8a4a-b85facea095b.png" alt="image.png"> | *   Involving the image subject area</p>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/621daadc-454f-41b4-9ac4-752d457034b6.jpeg" alt="b6ef803f-743f-4e61-b901-d1f68167186f.jpeg"></p>
     * <ul>
     * <li>Not involving the image subject area</li>
     * </ul>
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |</p>
     * 
     * <b>summary</b> : 
     * <p>The Intelligent Image Removal product is specially designed for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and blemishes from e-commerce images. You can specify objects to remove from images as needed, enabling efficient and accurate batch processing of large volumes of images and simplifying the image editing workflow. (Synchronous)</p>
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
     * <h2>Product Introduction</h2>
     * <p>Image Translation Plus is designed specifically for e-commerce images. It uses a Mixture of Experts (MOE) architecture and outperforms Image Translation Lite and Pro in translation accuracy for multiple minor languages. We recommend using it for the following language pairs, with more to be supported in the future.
     * Supported language pairs:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>No.</strong></th>
     * <th><strong>Source Language</strong></th>
     * <th></th>
     * <th><strong>Target Language</strong></th>
     * <th></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Language Code</td>
     * <td>Language Name</td>
     * <td>Language Code</td>
     * <td>Language Name</td>
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
     * <h2>Common scenarios</h2>
     * <p>Main product images and detail images for cross-border e-commerce.</p>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><p><strong>Product body information protection</strong>: Supports custom selection of whether to translate text on the product body. This helps protect body information such as embedded product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Supports custom selection of whether to translate brand names on images. This helps protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Image Translation Plus is designed specifically for e-commerce images. It uses a Mixture of Experts (MOE) architecture and outperforms Image Translation Lite and Pro in translation accuracy for multiple minor languages. We recommend using it for the following 8 language pairs, with more to be supported in the future.</p>
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
     * <h2>Product Introduction</h2>
     * <p>Image Translation Plus is designed specifically for e-commerce images. It uses a Mixture of Experts (MOE) architecture and outperforms Image Translation Lite and Pro in translation accuracy for multiple minor languages. We recommend using it for the following language pairs, with more to be supported in the future.
     * Supported language pairs:</p>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>No.</strong></th>
     * <th><strong>Source Language</strong></th>
     * <th></th>
     * <th><strong>Target Language</strong></th>
     * <th></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>Language Code</td>
     * <td>Language Name</td>
     * <td>Language Code</td>
     * <td>Language Name</td>
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
     * <h2>Common scenarios</h2>
     * <p>Main product images and detail images for cross-border e-commerce.</p>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><p><strong>Product body information protection</strong>: Supports custom selection of whether to translate text on the product body. This helps protect body information such as embedded product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Supports custom selection of whether to translate brand names on images. This helps protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Image Translation Plus is designed specifically for e-commerce images. It uses a Mixture of Experts (MOE) architecture and outperforms Image Translation Lite and Pro in translation accuracy for multiple minor languages. We recommend using it for the following 8 language pairs, with more to be supported in the future.</p>
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
     * <h2>Product Introduction</h2>
     * <p>The Image Translation Pro version is specifically designed for e-commerce images, integrating multimodal large model technology to achieve more accurate understanding of images, significantly improving translation quality, and continuously expanding and optimizing multilingual translation capabilities. It supports over 100 language pairs (including bridged translations).</p>
     * <h2>Applicable Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios</p>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Product Subject Information Protection</strong>: Supports custom selection of whether to translate text on the product subject, helping you protect subject information from being translated, such as embedded product names.</li>
     * <li><strong>Post-translation Secondary Editing</strong>: Supports custom selection of whether to return layout information such as text position, font, and color. This can be used for secondary editing when integrating with an image editor. The editor SDK package is not yet publicly available; please follow platform notifications.</li>
     * <li><strong>Brand Name Protection</strong>: Supports custom selection of whether to translate brand names on images, helping you protect brand name information from being translated.</li>
     * <li><strong>Translation Intervention Support</strong>: Allows customization of translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). Commonly used for brand name protection scenarios. Simply pass the corresponding glossary ID when calling the API to achieve this, meeting your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention terms. For additional needs, please contact the platform for assistance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The Image Translation Pro version is specifically designed for e-commerce images, integrating multimodal large model technology to achieve more accurate understanding of images, significantly improving translation quality, and continuously expanding and optimizing multilingual translation capabilities. It supports over 100 language pairs (including bridged translations).</p>
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
     * <h2>Product Introduction</h2>
     * <p>The Image Translation Pro version is specifically designed for e-commerce images, integrating multimodal large model technology to achieve more accurate understanding of images, significantly improving translation quality, and continuously expanding and optimizing multilingual translation capabilities. It supports over 100 language pairs (including bridged translations).</p>
     * <h2>Applicable Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios</p>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Product Subject Information Protection</strong>: Supports custom selection of whether to translate text on the product subject, helping you protect subject information from being translated, such as embedded product names.</li>
     * <li><strong>Post-translation Secondary Editing</strong>: Supports custom selection of whether to return layout information such as text position, font, and color. This can be used for secondary editing when integrating with an image editor. The editor SDK package is not yet publicly available; please follow platform notifications.</li>
     * <li><strong>Brand Name Protection</strong>: Supports custom selection of whether to translate brand names on images, helping you protect brand name information from being translated.</li>
     * <li><strong>Translation Intervention Support</strong>: Allows customization of translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). Commonly used for brand name protection scenarios. Simply pass the corresponding glossary ID when calling the API to achieve this, meeting your translation needs in different scenarios. Generally, you can upload up to 100,000 intervention terms. For additional needs, please contact the platform for assistance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The Image Translation Pro version is specifically designed for e-commerce images, integrating multimodal large model technology to achieve more accurate understanding of images, significantly improving translation quality, and continuously expanding and optimizing multilingual translation capabilities. It supports over 100 language pairs (including bridged translations).</p>
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
     * <h2>Product Introduction</h2>
     * <p>Image Translation is designed specifically for e-commerce images. It supports more than 100 language directions, accurately processes complex text layouts within images, and ensures that translated content matches the image content. This helps e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content.</p>
     * <h2>Common scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><strong>Product subject information protection</strong>: You can choose whether to translate text on the product subject. This helps protect subject information from being translated, such as embedded information like product names.</li>
     * <li><strong>Brand name protection</strong>: You can choose whether to translate brand names on images. This helps protect brand name information from being translated.</li>
     * <li><strong>Translation intervention support</strong>: You can customize translation results, including keeping text untranslated (ABC-ABC), specifying translations (ABC-DEF), or removing text (ABC-empty value). This is commonly used for brand name protection and similar scenarios. Pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Image Translation is designed specifically for e-commerce images. It supports more than 100 language directions, accurately processes complex text layouts within images, and ensures that translated content matches the image content. This helps e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content.</p>
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
     * <h2>Product Introduction</h2>
     * <p>Image Translation is designed specifically for e-commerce images. It supports more than 100 language directions, accurately processes complex text layouts within images, and ensures that translated content matches the image content. This helps e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content.</p>
     * <h2>Common scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><strong>Product subject information protection</strong>: You can choose whether to translate text on the product subject. This helps protect subject information from being translated, such as embedded information like product names.</li>
     * <li><strong>Brand name protection</strong>: You can choose whether to translate brand names on images. This helps protect brand name information from being translated.</li>
     * <li><strong>Translation intervention support</strong>: You can customize translation results, including keeping text untranslated (ABC-ABC), specifying translations (ABC-DEF), or removing text (ABC-empty value). This is commonly used for brand name protection and similar scenarios. Pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Image Translation is designed specifically for e-commerce images. It supports more than 100 language directions, accurately processes complex text layouts within images, and ensures that translated content matches the image content. This helps e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content.</p>
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
     * <h2>Product Introduction</h2>
     * <p>Supports automatic language detection for 24 languages. Applicable to short text such as search queries, titles, and conversations.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports automatic language detection for 24 languages. Applicable to short text such as search queries, titles, and conversations.</p>
     * 
     * @param request LanguageDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LanguageDetectResponse
     */
    public LanguageDetectResponse languageDetectWithOptions(LanguageDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <p>Supports automatic language detection for 24 languages. Applicable to short text such as search queries, titles, and conversations.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports automatic language detection for 24 languages. Applicable to short text such as search queries, titles, and conversations.</p>
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
     * <h2><strong>适用场景</strong></h2>
     * <ul>
     * <li><p><strong>门店营销物料合规巡检</strong>：自动判定门店内是否按总部下发的标准陈列指引摆放 / 张贴指定营销物料（功能台卡、海报、门型展架等），识别「未摆放、摆放错误、内容不符」等典型问题。</p>
     * </li>
     * <li><p><strong>新品 / 活动期素材落地核验</strong>：新品发布或大促活动期间，对门店实拍图中的活动物料是否已按要求上架进行批量自动核验，替代人工抽检。</p>
     * </li>
     * <li><p><strong>双图比对与单图检测自适应</strong>：同一接口同时支持「参考图 + 目标图」双图比对（模式 A）与「仅目标图」单图检测（模式 B），根据是否传入 <code>ImageRefer</code> 自动切换，调用方无需区分调用方式。</p>
     * </li>
     * </ul>
     * <h2><strong>功能介绍</strong></h2>
     * <ul>
     * <li><p><strong>多模式智能路由</strong>：内置物料类型解析能力，基于 <code>Rules</code> 自然语言文本自动识别目标物料类型，路由至对应的素材检测链路；调用方仅需传入图像 URL 与规则文本。目前已支持「功能台卡」「海报」「门型展架」「其他素材」4 套检测项路由，后续将持续增加细分营销物料类型的检测链路。</p>
     * </li>
     * <li><p><strong>MLLM 语义级理解 + 规则结构化协同</strong>：采用多模态大模型完成物料识别、内容比对、文字 OCR 等语义级理解，配合规则清洗与结构化模型将自然语言规则拆解为可逐条判定的步骤（S1 / S2…），在保证准确率的同时兼顾规则灵活性与可追溯性。</p>
     * </li>
     * <li><p><strong>结构化审核结论输出</strong>：输出统一为 <code>Result.OverallResult</code> + <code>Result.Steps[]</code> + <code>Result.Evidence</code> 的结构，整体结论由各步骤逻辑 AND 得出，每条步骤独立可见，便于直接驱动下游业务系统并支持 case 级人审追溯。</p>
     * </li>
     * <li><p><strong>支持的输入格式</strong>：当前支持公网可访问的图像 URL；支持单图（模式 B）与双图（模式 A）两种调用形态，输出结构完全一致。</p>
     * </li>
     * </ul>
     * <h2><strong>调用方式</strong></h2>
     * <ul>
     * <li><p><strong>同步调用</strong>：单次请求即返回检测结果，无需轮询。响应为 <code>Code</code> / <code>Message</code> / <code>RequestId</code> / <code>Success</code> / <code>Data</code> 统一信封。</p>
     * </li>
     * <li><p><strong>鉴权与签名</strong>：经 Aidge 网关调用，鉴权、签名与公共参数遵循平台统一接入方式。具体请求路径以正式发布的接口文档为准。</p>
     * </li>
     * <li><p><strong>超时设置</strong>：建议将请求超时设置为不低于接口的最长响应时间（具体值以正式发布为准）。</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>物料陈列检测</p>
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
     * <h2><strong>适用场景</strong></h2>
     * <ul>
     * <li><p><strong>门店营销物料合规巡检</strong>：自动判定门店内是否按总部下发的标准陈列指引摆放 / 张贴指定营销物料（功能台卡、海报、门型展架等），识别「未摆放、摆放错误、内容不符」等典型问题。</p>
     * </li>
     * <li><p><strong>新品 / 活动期素材落地核验</strong>：新品发布或大促活动期间，对门店实拍图中的活动物料是否已按要求上架进行批量自动核验，替代人工抽检。</p>
     * </li>
     * <li><p><strong>双图比对与单图检测自适应</strong>：同一接口同时支持「参考图 + 目标图」双图比对（模式 A）与「仅目标图」单图检测（模式 B），根据是否传入 <code>ImageRefer</code> 自动切换，调用方无需区分调用方式。</p>
     * </li>
     * </ul>
     * <h2><strong>功能介绍</strong></h2>
     * <ul>
     * <li><p><strong>多模式智能路由</strong>：内置物料类型解析能力，基于 <code>Rules</code> 自然语言文本自动识别目标物料类型，路由至对应的素材检测链路；调用方仅需传入图像 URL 与规则文本。目前已支持「功能台卡」「海报」「门型展架」「其他素材」4 套检测项路由，后续将持续增加细分营销物料类型的检测链路。</p>
     * </li>
     * <li><p><strong>MLLM 语义级理解 + 规则结构化协同</strong>：采用多模态大模型完成物料识别、内容比对、文字 OCR 等语义级理解，配合规则清洗与结构化模型将自然语言规则拆解为可逐条判定的步骤（S1 / S2…），在保证准确率的同时兼顾规则灵活性与可追溯性。</p>
     * </li>
     * <li><p><strong>结构化审核结论输出</strong>：输出统一为 <code>Result.OverallResult</code> + <code>Result.Steps[]</code> + <code>Result.Evidence</code> 的结构，整体结论由各步骤逻辑 AND 得出，每条步骤独立可见，便于直接驱动下游业务系统并支持 case 级人审追溯。</p>
     * </li>
     * <li><p><strong>支持的输入格式</strong>：当前支持公网可访问的图像 URL；支持单图（模式 B）与双图（模式 A）两种调用形态，输出结构完全一致。</p>
     * </li>
     * </ul>
     * <h2><strong>调用方式</strong></h2>
     * <ul>
     * <li><p><strong>同步调用</strong>：单次请求即返回检测结果，无需轮询。响应为 <code>Code</code> / <code>Message</code> / <code>RequestId</code> / <code>Success</code> / <code>Data</code> 统一信封。</p>
     * </li>
     * <li><p><strong>鉴权与签名</strong>：经 Aidge 网关调用，鉴权、签名与公共参数遵循平台统一接入方式。具体请求路径以正式发布的接口文档为准。</p>
     * </li>
     * <li><p><strong>超时设置</strong>：建议将请求超时设置为不低于接口的最长响应时间（具体值以正式发布为准）。</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>物料陈列检测</p>
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
     * <h2>Product Introduction</h2>
     * <p>An intelligent logistics parcel auditing product built on the synergy of Multimodal Large Language Models (MLLM) and specialized vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured auditing across multiple dimensions including <strong>bounding box validity, bounding box fit accuracy, and foreign object interference</strong> on parcels placed on scanning platforms. It supports different hardware acquisition scenarios such as white background boards and green background boards, and outputs Boolean audit conclusions with Chinese reason descriptions that can be directly integrated into business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * <h2>Applicable Scenarios</h2>
     * <ol>
     * <li><strong>Parcel Bounding Box Audit</strong>: Automatically determines whether the operator\&quot;s manual bounding box constitutes the &quot;minimum valid bounding rectangle&quot; for the parcel, identifying typical issues such as oversized or undersized bounding boxes.</li>
     * <li><strong>Foreign Object Interference Detection</strong>: Automatically identifies whether non-target objects such as fingers, keyboards, or auxiliary tools have entered the scanning area.</li>
     * <li><strong>Multi-Acquisition Environment Adaptation</strong>: A single API can handle two common acquisition modes — white background board (blue box) and green background board (blue box + red box) — without requiring the caller to distinguish between scenarios.</li>
     * <li><strong>Inbound Quality Inspection Pipeline</strong>: Used for automated review in the piece-weight-dimension stage of the logistics warehouse new product inbound SOP, replacing or assisting manual outsourced auditing.
     * Additionally, the product can also be used for general image &quot;box-subject&quot; relationship audit scenarios, such as product photography material review and document scanning quality verification.</li>
     * </ol>
     * <h2>Feature Introduction</h2>
     * <ol>
     * <li><strong>Multi-Scenario Intelligent Routing</strong>: The product has a built-in scenario classification capability that can automatically identify the background type (white/green) and bounding box type (none/single box/double box) in the image, and route the request to the corresponding audit sub-process. The caller only needs to provide the image URL without manually specifying the scenario.</li>
     * <li><strong>MLLM + Specialized CV Model Synergy</strong>: Multimodal large language models are used for semantic-level scene understanding and foreign object recognition, while specialized parcel segmentation and IoU evaluation models are used for pixel-level bounding box fit quantification, ensuring accuracy while controlling inference latency and cost.</li>
     * <li><strong>Structured Audit Conclusions</strong>: The output is uniformly structured as <code>result</code> (Boolean) + <code>info</code> (Chinese reason). Supported reason types include &quot;Audit passed&quot;, &quot;Audit not passed: bounding box too large&quot;, &quot;Audit not passed: bounding box too small&quot;, &quot;Audit not passed: foreign object present&quot;, etc., facilitating direct integration with downstream business systems.</li>
     * <li><strong>Supported Input Formats</strong>: Currently supports publicly accessible image URLs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>An intelligent logistics parcel auditing product built on the synergy of Multimodal Large Language Models (MLLM) and specialized vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured auditing across multiple dimensions including bounding box validity, bounding box fit accuracy, and foreign object interference on parcels placed on scanning platforms. It supports different hardware acquisition scenarios such as white background boards and green background boards, and outputs Boolean audit conclusions with Chinese reason descriptions that can be directly integrated into business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
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
     * <p>An intelligent logistics parcel auditing product built on the synergy of Multimodal Large Language Models (MLLM) and specialized vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured auditing across multiple dimensions including <strong>bounding box validity, bounding box fit accuracy, and foreign object interference</strong> on parcels placed on scanning platforms. It supports different hardware acquisition scenarios such as white background boards and green background boards, and outputs Boolean audit conclusions with Chinese reason descriptions that can be directly integrated into business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * <h2>Applicable Scenarios</h2>
     * <ol>
     * <li><strong>Parcel Bounding Box Audit</strong>: Automatically determines whether the operator\&quot;s manual bounding box constitutes the &quot;minimum valid bounding rectangle&quot; for the parcel, identifying typical issues such as oversized or undersized bounding boxes.</li>
     * <li><strong>Foreign Object Interference Detection</strong>: Automatically identifies whether non-target objects such as fingers, keyboards, or auxiliary tools have entered the scanning area.</li>
     * <li><strong>Multi-Acquisition Environment Adaptation</strong>: A single API can handle two common acquisition modes — white background board (blue box) and green background board (blue box + red box) — without requiring the caller to distinguish between scenarios.</li>
     * <li><strong>Inbound Quality Inspection Pipeline</strong>: Used for automated review in the piece-weight-dimension stage of the logistics warehouse new product inbound SOP, replacing or assisting manual outsourced auditing.
     * Additionally, the product can also be used for general image &quot;box-subject&quot; relationship audit scenarios, such as product photography material review and document scanning quality verification.</li>
     * </ol>
     * <h2>Feature Introduction</h2>
     * <ol>
     * <li><strong>Multi-Scenario Intelligent Routing</strong>: The product has a built-in scenario classification capability that can automatically identify the background type (white/green) and bounding box type (none/single box/double box) in the image, and route the request to the corresponding audit sub-process. The caller only needs to provide the image URL without manually specifying the scenario.</li>
     * <li><strong>MLLM + Specialized CV Model Synergy</strong>: Multimodal large language models are used for semantic-level scene understanding and foreign object recognition, while specialized parcel segmentation and IoU evaluation models are used for pixel-level bounding box fit quantification, ensuring accuracy while controlling inference latency and cost.</li>
     * <li><strong>Structured Audit Conclusions</strong>: The output is uniformly structured as <code>result</code> (Boolean) + <code>info</code> (Chinese reason). Supported reason types include &quot;Audit passed&quot;, &quot;Audit not passed: bounding box too large&quot;, &quot;Audit not passed: bounding box too small&quot;, &quot;Audit not passed: foreign object present&quot;, etc., facilitating direct integration with downstream business systems.</li>
     * <li><strong>Supported Input Formats</strong>: Currently supports publicly accessible image URLs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>An intelligent logistics parcel auditing product built on the synergy of Multimodal Large Language Models (MLLM) and specialized vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured auditing across multiple dimensions including bounding box validity, bounding box fit accuracy, and foreign object interference on parcels placed on scanning platforms. It supports different hardware acquisition scenarios such as white background boards and green background boards, and outputs Boolean audit conclusions with Chinese reason descriptions that can be directly integrated into business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * 
     * @param request PackageWeightSizeCheckRequest
     * @return PackageWeightSizeCheckResponse
     */
    public PackageWeightSizeCheckResponse packageWeightSizeCheck(PackageWeightSizeCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.packageWeightSizeCheckWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>API name on the POP gateway: QueryAsyncTaskResult.</p>
     * 
     * <b>summary</b> : 
     * <p>API name on the POP gateway: QueryAsyncTaskResult.</p>
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
     * <p>API name on the POP gateway: QueryAsyncTaskResult.</p>
     * 
     * <b>summary</b> : 
     * <p>API name on the POP gateway: QueryAsyncTaskResult.</p>
     * 
     * @param request QueryAsyncTaskResultRequest
     * @return QueryAsyncTaskResultResponse
     */
    public QueryAsyncTaskResultResponse queryAsyncTaskResult(QueryAsyncTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAsyncTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>1. Product Introduction</h1>
     * <p>Detects whether an image contains a size chart. (Synchronous).</p>
     * <h1>2. Common scenarios</h1>
     * <p><strong>Batch processing scenarios:</strong> Detect images that contain size charts from a batch of images for further translation or extraction. The size chart detection service helps reduce costs.</p>
     * <h1>3. Functions and features</h1>
     * <p>The size chart detection service uses image recognition technology to automatically determine whether an input image contains a size chart. You provide an image URL, and the system returns a detection result (True/False) indicating whether the image is a size chart.
     * You can customize the confidence threshold (default: 0.4) and flexibly adjust the detection sensitivity based on your business accuracy requirements. A lower threshold results in more lenient detection, while a higher threshold results in stricter detection. The API processes a single image per request and is suitable for integration into automated batch workflows for sequential invocation.</p>
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
     * <p>Detects whether an image contains a size chart. (Synchronous).</p>
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
     * <p>Detects whether an image contains a size chart. (Synchronous).</p>
     * <h1>2. Common scenarios</h1>
     * <p><strong>Batch processing scenarios:</strong> Detect images that contain size charts from a batch of images for further translation or extraction. The size chart detection service helps reduce costs.</p>
     * <h1>3. Functions and features</h1>
     * <p>The size chart detection service uses image recognition technology to automatically determine whether an input image contains a size chart. You provide an image URL, and the system returns a detection result (True/False) indicating whether the image is a size chart.
     * You can customize the confidence threshold (default: 0.4) and flexibly adjust the detection sensitivity based on your business accuracy requirements. A lower threshold results in more lenient detection, while a higher threshold results in stricter detection. The API processes a single image per request and is suitable for integration into automated batch workflows for sequential invocation.</p>
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
     * <p>Detects whether an image contains a size chart. (Synchronous).</p>
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
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous).</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p>Size charts: Extracts size charts from apparel categories into text.</p>
     * </li>
     * <li><p>Package weight/dimensions: Extracts package weight and dimension information from images.</p>
     * </li>
     * </ul>
     * <h2>Functions and features</h2>
     * <p>The size chart extraction service is based on a multimodal large language model. It automatically recognizes size chart or package weight/dimension information in images and converts it into structured text output. You provide an image URL, and the system processes the request as an asynchronous task and returns the extracted structured data. You can use the ColumnNameList parameter to specify the column names to recognize (such as Size, Bust, and Length) for precise targeted extraction. You can also use the LanguageModel parameter to control the output language. Valid values: cn (Chinese) and en (English). If you leave this parameter empty, the original language is retained. This service is applicable to scenarios such as converting apparel size charts to text and batch structuring of product weight/dimension information.
     * Core capabilities: Provide an image URL and optional column name configurations as input, and receive structured data of size charts or package weight/dimensions from the image as output. The API uses an asynchronous task mode (background: true). After submission, a task ID is returned. Poll for the final result. This mode is suitable for processing complex images or high-volume calls.</p>
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
     * <p>} |.</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous).</p>
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
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous).</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p>Size charts: Extracts size charts from apparel categories into text.</p>
     * </li>
     * <li><p>Package weight/dimensions: Extracts package weight and dimension information from images.</p>
     * </li>
     * </ul>
     * <h2>Functions and features</h2>
     * <p>The size chart extraction service is based on a multimodal large language model. It automatically recognizes size chart or package weight/dimension information in images and converts it into structured text output. You provide an image URL, and the system processes the request as an asynchronous task and returns the extracted structured data. You can use the ColumnNameList parameter to specify the column names to recognize (such as Size, Bust, and Length) for precise targeted extraction. You can also use the LanguageModel parameter to control the output language. Valid values: cn (Chinese) and en (English). If you leave this parameter empty, the original language is retained. This service is applicable to scenarios such as converting apparel size charts to text and batch structuring of product weight/dimension information.
     * Core capabilities: Provide an image URL and optional column name configurations as input, and receive structured data of size charts or package weight/dimensions from the image as output. The API uses an asynchronous task mode (background: true). After submission, a task ID is returned. Poll for the final result. This mode is suitable for processing complex images or high-volume calls.</p>
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
     * <p>} |.</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently extracts structured information such as size charts and package weight/dimension data from images by using a multimodal large language model. (Asynchronous).</p>
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
     * <h2>Product Introduction</h2>
     * <p>Corrects errors in search terms and titles. Currently supports the following 14 languages:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>No.</th>
     * <th>Language Name (English)</th>
     * <th>Language Code</th>
     * <th>Language Name (Chinese)</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1</td>
     * <td>Arabic</td>
     * <td>ar</td>
     * <td>Arabic</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>German</td>
     * <td>de</td>
     * <td>German</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>English</td>
     * <td>en</td>
     * <td>English</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>Spanish</td>
     * <td>es</td>
     * <td>Spanish</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>French</td>
     * <td>fr</td>
     * <td>French</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>Hebrew</td>
     * <td>he</td>
     * <td>Hebrew</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>Italian</td>
     * <td>it</td>
     * <td>Italian</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>Japanese</td>
     * <td>ja</td>
     * <td>Japanese</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>Korean</td>
     * <td>ko</td>
     * <td>Korean</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>Dutch</td>
     * <td>nl</td>
     * <td>Dutch</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>Polish</td>
     * <td>pl</td>
     * <td>Polish</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>Portuguese</td>
     * <td>pt</td>
     * <td>Portuguese (Brazil)</td>
     * </tr>
     * <tr>
     * <td>13</td>
     * <td>Russian</td>
     * <td>ru</td>
     * <td>Russian</td>
     * </tr>
     * <tr>
     * <td>14</td>
     * <td>Ukrainian</td>
     * <td>uk</td>
     * <td>Ukrainian</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Correct errors in search terms and titles</p>
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
     * <p>Corrects errors in search terms and titles. Currently supports the following 14 languages:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>No.</th>
     * <th>Language Name (English)</th>
     * <th>Language Code</th>
     * <th>Language Name (Chinese)</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1</td>
     * <td>Arabic</td>
     * <td>ar</td>
     * <td>Arabic</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>German</td>
     * <td>de</td>
     * <td>German</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>English</td>
     * <td>en</td>
     * <td>English</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>Spanish</td>
     * <td>es</td>
     * <td>Spanish</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>French</td>
     * <td>fr</td>
     * <td>French</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>Hebrew</td>
     * <td>he</td>
     * <td>Hebrew</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>Italian</td>
     * <td>it</td>
     * <td>Italian</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>Japanese</td>
     * <td>ja</td>
     * <td>Japanese</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>Korean</td>
     * <td>ko</td>
     * <td>Korean</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>Dutch</td>
     * <td>nl</td>
     * <td>Dutch</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>Polish</td>
     * <td>pl</td>
     * <td>Polish</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>Portuguese</td>
     * <td>pt</td>
     * <td>Portuguese (Brazil)</td>
     * </tr>
     * <tr>
     * <td>13</td>
     * <td>Russian</td>
     * <td>ru</td>
     * <td>Russian</td>
     * </tr>
     * <tr>
     * <td>14</td>
     * <td>Ukrainian</td>
     * <td>uk</td>
     * <td>Ukrainian</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Correct errors in search terms and titles</p>
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
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs. The model is continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT can accurately translate phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco MT supports long text translation and HTML format, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are typically short and may contain e-commerce-specific terms such as model numbers and specifications.</li>
     * <li>Customer service conversations: In customer service scenarios, Marco MT can handle issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Marco MT can also be used for general-purpose translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong> Marco MT supports translation between more than 100 languages and language detection for 23 languages. For specific language directions, refer to the language mapping table in Section 5.6.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong> Marco MT is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it delivers faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong> Currently supports text and html text types.</li>
     * <li><strong>Translation intervention</strong> Supports custom translation results, including do-not-translate (ABC→ABC), specified translation (ABC→DEF), and skip translation (ABC→empty value). This is commonly used for brand name protection. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
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
     * <td>Clearer and more accurate product subject description. The product is a &quot;key bag&quot; rather than a &quot;keychain.&quot; Other translations may cause ambiguity about the product subject</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs. The model is continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
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
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs. The model is continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT can accurately translate phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco MT supports long text translation and HTML format, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are typically short and may contain e-commerce-specific terms such as model numbers and specifications.</li>
     * <li>Customer service conversations: In customer service scenarios, Marco MT can handle issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Marco MT can also be used for general-purpose translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong> Marco MT supports translation between more than 100 languages and language detection for 23 languages. For specific language directions, refer to the language mapping table in Section 5.6.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong> Marco MT is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it delivers faster translation inference and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong> Currently supports text and html text types.</li>
     * <li><strong>Translation intervention</strong> Supports custom translation results, including do-not-translate (ABC→ABC), specified translation (ABC→DEF), and skip translation (ABC→empty value). This is commonly used for brand name protection. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
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
     * <td>Clearer and more accurate product subject description. The product is a &quot;key bag&quot; rather than a &quot;keychain.&quot; Other translations may cause ambiguity about the product subject</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs. The model is continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify a source language, automatic detection is performed.</p>
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
     * <h1>1. Product Introduction</h1>
     * <p>A one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous).</p>
     * <h1>2. Common scenarios</h1>
     * <p>Applicable to batch optimization of product images for cross-platform listing scenarios. Adapts source product images into main images, SKU images, and detail images required by listing platforms. Supported capabilities include:</p>
     * <ul>
     * <li><p>Detecting low-quality images that contain text, watermarks, logos, or overlay patches, and allowing users to filter images that require processing</p>
     * </li>
     * <li><p>Removing non-compliant elements such as watermarks, logos, overlay patches, and Chinese text from original images</p>
     * </li>
     * <li><p>Removing the background around the product subject edges</p>
     * </li>
     * <li><p>Translating text within images into other languages</p>
     * </li>
     * <li><p>Expanding images to other dimensions (by ratio, size, or other methods) with automatic background completion</p>
     * </li>
     * <li><p>Cropping images to specified dimensions</p>
     * </li>
     * <li><p>Upscaling image resolution by a specified factor.</p>
     * </li>
     * </ul>
     * <h1>3. Features</h1>
     * <p>Provide a product image URL and use the Ability parameter to select the AI capability combination to invoke (1 = intelligent element detection, 2 = intelligent matting, 3 = intelligent removal, 4 = Image Translation Pro, 5 = image expansion, 6 = intelligent cropping, 7 = HD upscaling). The system executes the selected capabilities sequentially in a preset order. Because intelligent element detection helps users determine whether an image contains certain specified elements, and the presence of elements affects subsequent AI capability selection, an additional input is provided that allows users to either filter images out of or retain images in the subsequent AI processing pipeline.
     * <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/bddb522a-0795-4b5c-b25d-10e933426367.svg" alt="ai-pipeline-flowchart.svg">
     * Each AI capability is described as follows:</p>
     * <ol>
     * <li><p><strong>Intelligent element detection:</strong> An element detection capability designed for e-commerce images. Detects text, logos, watermarks, and text-bearing color blocks in both the subject and background of an image, and returns Boolean detection results. Allows users to filter images based on detection results (for example, process only images that contain watermarks). Works in conjunction with subsequent capabilities — first identifies the types of elements that need optimization, then precisely executes removal and other operations.</p>
     * </li>
     * <li><p><strong>Intelligent matting:</strong> Automatically identifies the product subject in an image and precisely separates the subject from the background. Based on deep learning models, supports accurate segmentation of complex edges such as hair strands and transparent objects. Outputs images with a transparent or white background, supports custom background colors and target dimension cropping, and directly generates product display images that comply with e-commerce platform specifications.</p>
     * </li>
     * <li><p><strong>Intelligent removal:</strong> Automatically detects and removes non-compliant elements from e-commerce images, including text, specific names (brand/store names), transparent text blocks, and overlay patches. Supports specifying removal of elements in the subject area or non-subject area separately, and also supports precise removal area specification through the Mask parameter for efficient compliance cleanup of large batches of images.</p>
     * </li>
     * <li><p><strong>Image Translation Pro:</strong> Leverages multimodal foundation model technology to translate text in images into a target language and render it directly at the corresponding position in the original image. Supports more than 100 language pairs. Provides product subject text protection, brand name protection, and translation intervention glossaries to prevent mistranslation of embedded product information. After translation, returns layout information such as text position, font, and color for secondary editing.</p>
     * </li>
     * <li><p><strong>Intelligent image expansion:</strong> Expands the image canvas using AI generation technology to broaden the image view without cropping the subject. Supports multiple expansion methods: by aspect ratio (1:1, 3:4, 4:3, 9:16, 16:9), by horizontal/vertical scaling ratio (1.0× to 3.0×), or by pixel offset in the up, down, left, and right directions. AI automatically generates naturally transitioning background content.</p>
     * </li>
     * <li><p><strong>Intelligent cropping:</strong> Intelligently crops images to specified dimensions, automatically identifies the subject area, and precisely preserves core content. Supports custom output width and height (100 to 5000 pixels) to meet the image dimension requirements of different e-commerce platforms and ad placements, ensuring the subject remains prominent and the composition stays balanced after cropping.</p>
     * </li>
     * <li><p><strong>HD upscaling:</strong> Enhances details and reduces noise while upscaling images. Supports 2× to 4× upscaling. Suitable for improving the clarity of low-resolution product images and optimizing visual presentation. Supports output in PNG, JPG, BMP, and other formats.</p>
     * </li>
     * </ol>
     * <h1>4. Before and after comparison</h1>
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
     * <td>*   Intelligent detection</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Image Translation Pro</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/c2579e3e-389e-4717-84e3-834e60fea6b0.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/a92d14a9-ecf4-4e77-ad96-a2fcdd95dd1d.png" alt="image.png"> | *   Intelligent matting</p>
     * </li>
     * <li><p>Intelligent removal</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/f631f578-3496-4aa1-b5ef-cd1ea603e049.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/12965cf8-cfdf-4a85-95fe-fdfcefcaa4ae.png" alt="C2.png"> | *   Intelligent detection</p>
     * </li>
     * <li><p>Intelligent removal</p>
     * </li>
     * <li><p>HD upscaling | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/95d29e79-8622-45fb-b284-cd580fe40ea0.jpeg" alt="R2.jpeg"> |.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous).</p>
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
     * <h1>1. Product Introduction</h1>
     * <p>A one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous).</p>
     * <h1>2. Common scenarios</h1>
     * <p>Applicable to batch optimization of product images for cross-platform listing scenarios. Adapts source product images into main images, SKU images, and detail images required by listing platforms. Supported capabilities include:</p>
     * <ul>
     * <li><p>Detecting low-quality images that contain text, watermarks, logos, or overlay patches, and allowing users to filter images that require processing</p>
     * </li>
     * <li><p>Removing non-compliant elements such as watermarks, logos, overlay patches, and Chinese text from original images</p>
     * </li>
     * <li><p>Removing the background around the product subject edges</p>
     * </li>
     * <li><p>Translating text within images into other languages</p>
     * </li>
     * <li><p>Expanding images to other dimensions (by ratio, size, or other methods) with automatic background completion</p>
     * </li>
     * <li><p>Cropping images to specified dimensions</p>
     * </li>
     * <li><p>Upscaling image resolution by a specified factor.</p>
     * </li>
     * </ul>
     * <h1>3. Features</h1>
     * <p>Provide a product image URL and use the Ability parameter to select the AI capability combination to invoke (1 = intelligent element detection, 2 = intelligent matting, 3 = intelligent removal, 4 = Image Translation Pro, 5 = image expansion, 6 = intelligent cropping, 7 = HD upscaling). The system executes the selected capabilities sequentially in a preset order. Because intelligent element detection helps users determine whether an image contains certain specified elements, and the presence of elements affects subsequent AI capability selection, an additional input is provided that allows users to either filter images out of or retain images in the subsequent AI processing pipeline.
     * <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/bddb522a-0795-4b5c-b25d-10e933426367.svg" alt="ai-pipeline-flowchart.svg">
     * Each AI capability is described as follows:</p>
     * <ol>
     * <li><p><strong>Intelligent element detection:</strong> An element detection capability designed for e-commerce images. Detects text, logos, watermarks, and text-bearing color blocks in both the subject and background of an image, and returns Boolean detection results. Allows users to filter images based on detection results (for example, process only images that contain watermarks). Works in conjunction with subsequent capabilities — first identifies the types of elements that need optimization, then precisely executes removal and other operations.</p>
     * </li>
     * <li><p><strong>Intelligent matting:</strong> Automatically identifies the product subject in an image and precisely separates the subject from the background. Based on deep learning models, supports accurate segmentation of complex edges such as hair strands and transparent objects. Outputs images with a transparent or white background, supports custom background colors and target dimension cropping, and directly generates product display images that comply with e-commerce platform specifications.</p>
     * </li>
     * <li><p><strong>Intelligent removal:</strong> Automatically detects and removes non-compliant elements from e-commerce images, including text, specific names (brand/store names), transparent text blocks, and overlay patches. Supports specifying removal of elements in the subject area or non-subject area separately, and also supports precise removal area specification through the Mask parameter for efficient compliance cleanup of large batches of images.</p>
     * </li>
     * <li><p><strong>Image Translation Pro:</strong> Leverages multimodal foundation model technology to translate text in images into a target language and render it directly at the corresponding position in the original image. Supports more than 100 language pairs. Provides product subject text protection, brand name protection, and translation intervention glossaries to prevent mistranslation of embedded product information. After translation, returns layout information such as text position, font, and color for secondary editing.</p>
     * </li>
     * <li><p><strong>Intelligent image expansion:</strong> Expands the image canvas using AI generation technology to broaden the image view without cropping the subject. Supports multiple expansion methods: by aspect ratio (1:1, 3:4, 4:3, 9:16, 16:9), by horizontal/vertical scaling ratio (1.0× to 3.0×), or by pixel offset in the up, down, left, and right directions. AI automatically generates naturally transitioning background content.</p>
     * </li>
     * <li><p><strong>Intelligent cropping:</strong> Intelligently crops images to specified dimensions, automatically identifies the subject area, and precisely preserves core content. Supports custom output width and height (100 to 5000 pixels) to meet the image dimension requirements of different e-commerce platforms and ad placements, ensuring the subject remains prominent and the composition stays balanced after cropping.</p>
     * </li>
     * <li><p><strong>HD upscaling:</strong> Enhances details and reduces noise while upscaling images. Supports 2× to 4× upscaling. Suitable for improving the clarity of low-resolution product images and optimizing visual presentation. Supports output in PNG, JPG, BMP, and other formats.</p>
     * </li>
     * </ol>
     * <h1>4. Before and after comparison</h1>
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
     * <td>*   Intelligent detection</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><p>Image Translation Pro</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/c2579e3e-389e-4717-84e3-834e60fea6b0.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/a92d14a9-ecf4-4e77-ad96-a2fcdd95dd1d.png" alt="image.png"> | *   Intelligent matting</p>
     * </li>
     * <li><p>Intelligent removal</p>
     * </li>
     * <li><p>Intelligent cropping | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/f631f578-3496-4aa1-b5ef-cd1ea603e049.png" alt="R1.png"> |
     * | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/12965cf8-cfdf-4a85-95fe-fdfcefcaa4ae.png" alt="C2.png"> | *   Intelligent detection</p>
     * </li>
     * <li><p>Intelligent removal</p>
     * </li>
     * <li><p>HD upscaling | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/95d29e79-8622-45fb-b284-cd580fe40ea0.jpeg" alt="R2.jpeg"> |.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous).</p>
     * 
     * @param request VisionFlowRequest
     * @return VisionFlowResponse
     */
    public VisionFlowResponse visionFlow(VisionFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.visionFlowWithOptions(request, runtime);
    }
}
