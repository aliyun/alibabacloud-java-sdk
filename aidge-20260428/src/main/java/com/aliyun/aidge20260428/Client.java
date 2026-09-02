// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428;

import com.aliyun.tea.*;
import com.aliyun.aidge20260428.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
     * <b>description</b> :
     * <h2>Product Introduction</h2>
     * <p>A one-click cross-platform product listing optimization service for cross-border e-commerce sellers (minimum cost edition). Accepts a source platform product URL and outputs all listing assets adapted to the target platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses an officially pre-built minimum-cost workflow that primarily filters and applies lightweight processing without calling expensive image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * <h2>Scenarios</h2>
     * <p>Suitable for cost-sensitive cross-platform listing scenarios where &quot;fast, high-volume, and cheap&quot; is the priority. Examples include bulk listing from 1688 to TEMU, batch uploading of high-SKU inventory, entry-level AI processing for top sellers and ERP/SaaS platforms, and merchants with high daily processing volumes but low requirements for marketing performance.
     * By filtering images that contain watermarks or non-compliant elements and prioritizing clean original images, the service reduces AI generation steps and helps merchants complete cross-platform listings at minimal cost.</p>
     * <h2>Features</h2>
     * <p>This service uses an officially pre-built &quot;minimum cost&quot; product optimization workflow that covers the entire pipeline from asset retrieval, compliance filtering, and text optimization to image processing:</p>
     * <ol>
     * <li>Automatically parses 1688 product URLs and extracts multiple asset types including titles, SKUs, main images, detail images, and attributes.</li>
     * <li>Performs text filtering and SEO optimization based on the TEMU platform blacklist and compliance rules.</li>
     * <li>Intelligently identifies watermarks, logos, and Chinese text in images, prioritizing clean original images through filtering. SKU images and a small number of main images are processed using image translation capabilities to comply with platform standards (high-conversion images with marketing text may be filtered out).</li>
     * <li>Completes category matching, attribute filling, and localized rewriting based on target platform requirements.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product listing optimization service for cross-border e-commerce sellers (minimum cost edition). Accepts a source platform product URL and outputs all listing assets adapted to the target platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses an officially pre-built minimum-cost workflow that primarily filters and applies lightweight processing without calling expensive image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
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
     * <p>A one-click cross-platform product listing optimization service for cross-border e-commerce sellers (minimum cost edition). Accepts a source platform product URL and outputs all listing assets adapted to the target platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses an officially pre-built minimum-cost workflow that primarily filters and applies lightweight processing without calling expensive image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
     * <h2>Scenarios</h2>
     * <p>Suitable for cost-sensitive cross-platform listing scenarios where &quot;fast, high-volume, and cheap&quot; is the priority. Examples include bulk listing from 1688 to TEMU, batch uploading of high-SKU inventory, entry-level AI processing for top sellers and ERP/SaaS platforms, and merchants with high daily processing volumes but low requirements for marketing performance.
     * By filtering images that contain watermarks or non-compliant elements and prioritizing clean original images, the service reduces AI generation steps and helps merchants complete cross-platform listings at minimal cost.</p>
     * <h2>Features</h2>
     * <p>This service uses an officially pre-built &quot;minimum cost&quot; product optimization workflow that covers the entire pipeline from asset retrieval, compliance filtering, and text optimization to image processing:</p>
     * <ol>
     * <li>Automatically parses 1688 product URLs and extracts multiple asset types including titles, SKUs, main images, detail images, and attributes.</li>
     * <li>Performs text filtering and SEO optimization based on the TEMU platform blacklist and compliance rules.</li>
     * <li>Intelligently identifies watermarks, logos, and Chinese text in images, prioritizing clean original images through filtering. SKU images and a small number of main images are processed using image translation capabilities to comply with platform standards (high-conversion images with marketing text may be filtered out).</li>
     * <li>Completes category matching, attribute filling, and localized rewriting based on target platform requirements.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product listing optimization service for cross-border e-commerce sellers (minimum cost edition). Accepts a source platform product URL and outputs all listing assets adapted to the target platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses an officially pre-built minimum-cost workflow that primarily filters and applies lightweight processing without calling expensive image translation capabilities, maximizing cost control while ensuring listing compliance. (Asynchronous)</p>
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
     * <p>A one-click cross-platform product listing optimization service for cross-border e-commerce sellers (best performance edition). Accepts a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting.</p>
     * <h2>Scenarios</h2>
     * <p>Suitable for scenarios that require high-quality cross-platform product listing assets and strong conversion performance. Examples include categories with high dependency on marketing assets such as apparel, accessories, beauty, and home goods. Also suitable for brand merchants and high-value products that need to retain marketing images with copywriting. Ideal for top sellers and ERP/SaaS platforms conducting localized operations across multiple languages and markets, as well as scenarios that require category-specific assets (such as size charts and package weight/dimensions) to improve listing quality and conversion rates.</p>
     * <h2>Features</h2>
     * <p>This service uses the officially pre-built &quot;Best Performance&quot; product optimization workflow, covering the entire pipeline from asset acquisition, diagnosis, filtering, and optimization to output:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract all assets including titles, SKUs, main images, detail images, and attributes. Intelligently diagnoses missing assets and optimization opportunities.</li>
     * <li>Uses LLM for text compliance filtering, SEO keyword optimization, five-point description generation, and multilingual localization rewriting.</li>
     * <li>Invokes multiple image processing capabilities including intelligent recognition, intelligent background removal, intelligent erasure, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling.</li>
     * <li>Outputs category-specific assets such as size charts and package weight/dimensions for apparel categories.</li>
     * <li>Outputs a standardized product asset package ready for direct listing.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product listing optimization service for cross-border e-commerce sellers (best performance edition). Accepts a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses the officially pre-built best-performance workflow to maximize AI capabilities, retains and localizes brand marketing assets, and outputs category-specific assets such as size charts for apparel categories. (Asynchronous)</p>
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
     * <p>A one-click cross-platform product listing optimization service for cross-border e-commerce sellers (best performance edition). Accepts a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting.</p>
     * <h2>Scenarios</h2>
     * <p>Suitable for scenarios that require high-quality cross-platform product listing assets and strong conversion performance. Examples include categories with high dependency on marketing assets such as apparel, accessories, beauty, and home goods. Also suitable for brand merchants and high-value products that need to retain marketing images with copywriting. Ideal for top sellers and ERP/SaaS platforms conducting localized operations across multiple languages and markets, as well as scenarios that require category-specific assets (such as size charts and package weight/dimensions) to improve listing quality and conversion rates.</p>
     * <h2>Features</h2>
     * <p>This service uses the officially pre-built &quot;Best Performance&quot; product optimization workflow, covering the entire pipeline from asset acquisition, diagnosis, filtering, and optimization to output:</p>
     * <ol>
     * <li>Automatically parses 1688 product links to extract all assets including titles, SKUs, main images, detail images, and attributes. Intelligently diagnoses missing assets and optimization opportunities.</li>
     * <li>Uses LLM for text compliance filtering, SEO keyword optimization, five-point description generation, and multilingual localization rewriting.</li>
     * <li>Invokes multiple image processing capabilities including intelligent recognition, intelligent background removal, intelligent erasure, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling.</li>
     * <li>Outputs category-specific assets such as size charts and package weight/dimensions for apparel categories.</li>
     * <li>Outputs a standardized product asset package ready for direct listing.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-click cross-platform product listing optimization service for cross-border e-commerce sellers (best performance edition). Accepts a 1688 product link as input and outputs a complete set of assets adapted to TEMU platform requirements, including titles, attributes, main images, SKU images, detail images, and copywriting. Uses the officially pre-built best-performance workflow to maximize AI capabilities, retains and localizes brand marketing assets, and outputs category-specific assets such as size charts for apparel categories. (Asynchronous)</p>
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
     * <h1>Applicable scenarios</h1>
     * <p>Cross-platform product listing attribute filling: When merchants list products across platforms, the attribute fields required by different platforms (source platform, TEMU platform) vary significantly, with complex hierarchical options (such as material → wood type → density). Manual filling is time-consuming and error-prone. This service automatically understands product information and intelligently fills in attributes. It is suitable for scenarios such as automated bulk listing for top sellers, ERP/SaaS platform integration, and quick product listing for SMB merchants.</p>
     * <h1>Feature overview</h1>
     * <p>Users input the product title, source category, product details, SKU, product attributes, and product images (up to 10). The system uses multimodal AI to understand product semantics and visual features, completing two core tasks: ① Matching the precise category path for the product on the TEMU platform. ② Automatically filling in the required attributes under that category (such as material, battery properties, size, connectivity), and returning the confidence level and reasoning for each attribute. The API operates in synchronous mode and returns results immediately upon invocation.</p>
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
     * <td>Brand</td>
     * <td>Other</td>
     * <td>Power Mode</td>
     * <td>USB Charging (Built-in Battery)</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Battery Life</td>
     * <td>3-6h (inclusive)</td>
     * <td>Rechargeable Battery</td>
     * <td>Lithium Battery</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Additional Features</td>
     * <td>Digital Display</td>
     * <td>Battery Capacity (mAh)</td>
     * <td>4000</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Built-in Battery Capacity</td>
     * <td>2000mAh-4000mAh (inclusive)</td>
     * <td>Fan Features</td>
     * <td>High Speed</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Item Number</td>
     * <td>X699</td>
     * <td>Control Method</td>
     * <td>Button</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Main Downstream Platforms</td>
     * <td>eBay, Amazon, Wish, AliExpress, Independent Sites, LAZADA, Other</td>
     * <td>Finish Type</td>
     * <td>Painted</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Has Licensable Own Brand</td>
     * <td>No</td>
     * <td>Recommended Use</td>
     * <td>Cooling</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Dimensions</td>
     * <td>65\*60\*171</td>
     * <td>Fan Design</td>
     * <td>Wearable Fan</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Applicable Gift Occasions</td>
     * <td>Personal Gifts</td>
     * <td>Included Components</td>
     * <td>None</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Shell Process</td>
     * <td>Spray Coating (UV Paint, Rubber Paint, Metallic Paint, Piano Lacquer, Pearl Powder)</td>
     * <td>Material</td>
     * <td>Plastic</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Package Volume</td>
     * <td>65\*60\*171</td>
     * <td>Special Features</td>
     * <td>Portable</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Appearance Dimensions</td>
     * <td>51\*36\*34</td>
     * <td>Indoor/Outdoor Use</td>
     * <td>Both Indoor and Outdoor</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Wind Speed Levels</td>
     * <td>3 Levels</td>
     * <td>Brand Name</td>
     * <td>None</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Operation Method</td>
     * <td>Standard Button</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Blade Material</td>
     * <td>ABS</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Power Mode</td>
     * <td>USB</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Built-in Battery</td>
     * <td>Yes</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Patented Source</td>
     * <td>No</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Color</td>
     * <td>X699 Fan-Yellow, X699 Fan-Light Purple, X699 Fan-Sky Blue, X699 Fan-Orange, X699 Fan-Light Green, Standard Small Fan</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Main Sales Regions</td>
     * <td>Japan/Korea, Africa, Korea, Japan, Europe, South America, Southeast Asia, North America, Northeast Asia, Middle East, Latin America, Europe/America, Other</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Cross-border Export Exclusive</td>
     * <td>Yes</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Style</td>
     * <td>Fresh</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Motor Type</td>
     * <td>Brushless Motor</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Noise</td>
     * <td>36dB(A)-45dB(A) (inclusive)</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Net Weight</td>
     * <td>125g</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Number of Blades</td>
     * <td>6 or more</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Fan Category</td>
     * <td>Handheld Fan</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides a cross-platform product category and attribute intelligent filling service based on multimodal large models. Takes product information from a source platform, automatically matches the category on the target listing platform, and intelligently fills in all required attribute fields under that category, offering a one-stop solution for category selection and attribute filling during product listing. (Synchronous)</p>
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
     * <h1>Applicable scenarios</h1>
     * <p>Cross-platform product listing attribute filling: When merchants list products across platforms, the attribute fields required by different platforms (source platform, TEMU platform) vary significantly, with complex hierarchical options (such as material → wood type → density). Manual filling is time-consuming and error-prone. This service automatically understands product information and intelligently fills in attributes. It is suitable for scenarios such as automated bulk listing for top sellers, ERP/SaaS platform integration, and quick product listing for SMB merchants.</p>
     * <h1>Feature overview</h1>
     * <p>Users input the product title, source category, product details, SKU, product attributes, and product images (up to 10). The system uses multimodal AI to understand product semantics and visual features, completing two core tasks: ① Matching the precise category path for the product on the TEMU platform. ② Automatically filling in the required attributes under that category (such as material, battery properties, size, connectivity), and returning the confidence level and reasoning for each attribute. The API operates in synchronous mode and returns results immediately upon invocation.</p>
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
     * <td>Brand</td>
     * <td>Other</td>
     * <td>Power Mode</td>
     * <td>USB Charging (Built-in Battery)</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Battery Life</td>
     * <td>3-6h (inclusive)</td>
     * <td>Rechargeable Battery</td>
     * <td>Lithium Battery</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Additional Features</td>
     * <td>Digital Display</td>
     * <td>Battery Capacity (mAh)</td>
     * <td>4000</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Built-in Battery Capacity</td>
     * <td>2000mAh-4000mAh (inclusive)</td>
     * <td>Fan Features</td>
     * <td>High Speed</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Item Number</td>
     * <td>X699</td>
     * <td>Control Method</td>
     * <td>Button</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Main Downstream Platforms</td>
     * <td>eBay, Amazon, Wish, AliExpress, Independent Sites, LAZADA, Other</td>
     * <td>Finish Type</td>
     * <td>Painted</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Has Licensable Own Brand</td>
     * <td>No</td>
     * <td>Recommended Use</td>
     * <td>Cooling</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Dimensions</td>
     * <td>65\*60\*171</td>
     * <td>Fan Design</td>
     * <td>Wearable Fan</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Applicable Gift Occasions</td>
     * <td>Personal Gifts</td>
     * <td>Included Components</td>
     * <td>None</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Shell Process</td>
     * <td>Spray Coating (UV Paint, Rubber Paint, Metallic Paint, Piano Lacquer, Pearl Powder)</td>
     * <td>Material</td>
     * <td>Plastic</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Package Volume</td>
     * <td>65\*60\*171</td>
     * <td>Special Features</td>
     * <td>Portable</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Appearance Dimensions</td>
     * <td>51\*36\*34</td>
     * <td>Indoor/Outdoor Use</td>
     * <td>Both Indoor and Outdoor</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Wind Speed Levels</td>
     * <td>3 Levels</td>
     * <td>Brand Name</td>
     * <td>None</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Operation Method</td>
     * <td>Standard Button</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Blade Material</td>
     * <td>ABS</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Power Mode</td>
     * <td>USB</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Built-in Battery</td>
     * <td>Yes</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Patented Source</td>
     * <td>No</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Color</td>
     * <td>X699 Fan-Yellow, X699 Fan-Light Purple, X699 Fan-Sky Blue, X699 Fan-Orange, X699 Fan-Light Green, Standard Small Fan</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Main Sales Regions</td>
     * <td>Japan/Korea, Africa, Korea, Japan, Europe, South America, Southeast Asia, North America, Northeast Asia, Middle East, Latin America, Europe/America, Other</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Cross-border Export Exclusive</td>
     * <td>Yes</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Style</td>
     * <td>Fresh</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Motor Type</td>
     * <td>Brushless Motor</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Noise</td>
     * <td>36dB(A)-45dB(A) (inclusive)</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Net Weight</td>
     * <td>125g</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Number of Blades</td>
     * <td>6 or more</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Fan Category</td>
     * <td>Handheld Fan</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Provides a cross-platform product category and attribute intelligent filling service based on multimodal large models. Takes product information from a source platform, automatically matches the category on the target listing platform, and intelligently fills in all required attribute fields under that category, offering a one-stop solution for category selection and attribute filling during product listing. (Synchronous)</p>
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
     * <p>A large language model-based intelligent cross-platform product category matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help merchants quickly select categories during cross-platform product listing. (Synchronization)</p>
     * <h2>Common scenarios</h2>
     * <p>Cross-platform product listing: After sourcing products, merchants list them on a target platform and need to match products to the correct category in the target platform\&quot;s category tree. Manually selecting categories requires familiarity with the target platform\&quot;s complete category system, which is time-consuming, labor-intensive, and error-prone. Incorrect category matching can cause product delisting and other issues.
     * This service automates category mapping and is suitable for bulk API calls from top sellers\&quot; self-built systems, ERP/SaaS platform integration for automated listing workflows, and quick single-product listing for SMB merchants.
     * The current version only supports TEMU as the target listing platform. Currently, automatic product information retrieval from source platforms is not supported and users must manually provide input parameters. This capability will be added in future versions, along with support for more source and target platforms.</p>
     * <h2>Functions and features</h2>
     * <p>Users input fields such as product title, source category, product description, SKU information, and product attributes. The system uses an AI model to understand product semantics and matches the most appropriate category path from the TEMU platform\&quot;s full category tree. The response includes the complete category path (CategoryPath), category name (CategoryName), confidence score (0-100), and matching reason. The API uses synchronous mode and returns results immediately after invocation, making it suitable for embedding in real-time business workflows.</p>
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
     * <td>USB fan, mini fan</td>
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
     * <td>Bracelet</td>
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
     * <td>\&gt;Women\&quot;s Jewelry</td>
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
     * <p>Provides a large language model-based intelligent cross-platform product category matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help merchants quickly select categories during cross-platform product listing. (Synchronization)</p>
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
     * <p>A large language model-based intelligent cross-platform product category matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help merchants quickly select categories during cross-platform product listing. (Synchronization)</p>
     * <h2>Common scenarios</h2>
     * <p>Cross-platform product listing: After sourcing products, merchants list them on a target platform and need to match products to the correct category in the target platform\&quot;s category tree. Manually selecting categories requires familiarity with the target platform\&quot;s complete category system, which is time-consuming, labor-intensive, and error-prone. Incorrect category matching can cause product delisting and other issues.
     * This service automates category mapping and is suitable for bulk API calls from top sellers\&quot; self-built systems, ERP/SaaS platform integration for automated listing workflows, and quick single-product listing for SMB merchants.
     * The current version only supports TEMU as the target listing platform. Currently, automatic product information retrieval from source platforms is not supported and users must manually provide input parameters. This capability will be added in future versions, along with support for more source and target platforms.</p>
     * <h2>Functions and features</h2>
     * <p>Users input fields such as product title, source category, product description, SKU information, and product attributes. The system uses an AI model to understand product semantics and matches the most appropriate category path from the TEMU platform\&quot;s full category tree. The response includes the complete category path (CategoryPath), category name (CategoryName), confidence score (0-100), and matching reason. The API uses synchronous mode and returns results immediately after invocation, making it suitable for embedding in real-time business workflows.</p>
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
     * <td>USB fan, mini fan</td>
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
     * <td>Bracelet</td>
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
     * <td>\&gt;Women\&quot;s Jewelry</td>
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
     * <p>Provides a large language model-based intelligent cross-platform product category matching service. Accepts product information from a source platform, automatically matches the best category on the target listing platform, and returns a confidence level score with matching reasons to help merchants quickly select categories during cross-platform product listing. (Synchronization)</p>
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
     * <h2>Description</h2>
     * <p><strong>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the floor display area inference service.</strong></p>
     * <ul>
     * <li>This operation infers the actual dimensions (lengths of two edges) and floor area of a floor display based on the provided overall display image, SKU knowledge base, and product location information in the image.</li>
     * <li>Make sure that the knowledge base corresponding to the specified <code>RagId</code> belongs to the caller and is in the available (<code>AVAILABLE</code>) state.</li>
     * <li>The <code>Products</code> array must contain at least one product item, and each product item must have at least one bounding box defined in <code>Boxes</code>.</li>
     * <li>All coordinate values are represented in a normalized coordinate system ranging from 0 to 1000. Make sure that the input satisfies the relationships <code>Left &lt; Right</code> and <code>Top &lt; Bottom</code>.</li>
     * <li>Set a reasonable timeout period when calling this operation (no more than 300 seconds recommended) to avoid failures caused by network latency or high processing complexity.</li>
     * <li>For production environments, use the POP Action method for access. The internal REST address is primarily used for integration testing during the development phase.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calculates the edge lengths and floor area of a floor display based on the display image and product detection boxes.</p>
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
     * <h2>Description</h2>
     * <p><strong>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the floor display area inference service.</strong></p>
     * <ul>
     * <li>This operation infers the actual dimensions (lengths of two edges) and floor area of a floor display based on the provided overall display image, SKU knowledge base, and product location information in the image.</li>
     * <li>Make sure that the knowledge base corresponding to the specified <code>RagId</code> belongs to the caller and is in the available (<code>AVAILABLE</code>) state.</li>
     * <li>The <code>Products</code> array must contain at least one product item, and each product item must have at least one bounding box defined in <code>Boxes</code>.</li>
     * <li>All coordinate values are represented in a normalized coordinate system ranging from 0 to 1000. Make sure that the input satisfies the relationships <code>Left &lt; Right</code> and <code>Top &lt; Bottom</code>.</li>
     * <li>Set a reasonable timeout period when calling this operation (no more than 300 seconds recommended) to avoid failures caused by network latency or high processing complexity.</li>
     * <li>For production environments, use the POP Action method for access. The internal REST address is primarily used for integration testing during the development phase.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calculates the edge lengths and floor area of a floor display based on the display image and product detection boxes.</p>
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
     * <h2>Product Introduction</h2>
     * <p>Designed specifically for document translation, this service supports translation between more than 100 language pairs (including bridged pairs), supporting multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * Excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, parameter and unit accuracy</li>
     * <li>Structural integrity: overall layout continuity, page margin and layout preservation</li>
     * </ul>
     * <h2>Scenarios</h2>
     * <p>Cross-border e-commerce product manuals, contracts, agreements, business proposals, qualification documents, textbooks and courseware, and other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li>Supports PDF and Word formats. Supports source documents containing multiple languages. For a detailed language list, see section 4.5.</li>
     * <li>Supports translation of text within images in documents, as well as complex translation scenarios such as charts and special symbols.</li>
     * <li>Supports high-fidelity layout preservation after translation.</li>
     * <li>A single PDF supports up to 100 pages. A single Word document supports up to 100 pages.</li>
     * <li>Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). Commonly used for brand name protection. Pass the corresponding glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 glossary entries. Contact the platform if you need more.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Designed specifically for document translation, this API supports translation between more than 100 language pairs (including bridged pairs), meeting the needs of multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * It excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, and accuracy of parameters and units.</li>
     * <li>Structural integrity: overall layout continuity, and page margin and layout restoration.</li>
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
     * <p>Designed specifically for document translation, this service supports translation between more than 100 language pairs (including bridged pairs), supporting multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * Excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, parameter and unit accuracy</li>
     * <li>Structural integrity: overall layout continuity, page margin and layout preservation</li>
     * </ul>
     * <h2>Scenarios</h2>
     * <p>Cross-border e-commerce product manuals, contracts, agreements, business proposals, qualification documents, textbooks and courseware, and other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li>Supports PDF and Word formats. Supports source documents containing multiple languages. For a detailed language list, see section 4.5.</li>
     * <li>Supports translation of text within images in documents, as well as complex translation scenarios such as charts and special symbols.</li>
     * <li>Supports high-fidelity layout preservation after translation.</li>
     * <li>A single PDF supports up to 100 pages. A single Word document supports up to 100 pages.</li>
     * <li>Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). Commonly used for brand name protection. Pass the corresponding glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 glossary entries. Contact the platform if you need more.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Designed specifically for document translation, this API supports translation between more than 100 language pairs (including bridged pairs), meeting the needs of multi-scenario, multi-page, and highly complex document translation. Scanned documents are not currently supported.
     * It excels in the following areas:</p>
     * <ul>
     * <li>Content accuracy: translation accuracy, and accuracy of parameters and units.</li>
     * <li>Structural integrity: overall layout continuity, and page margin and layout restoration.</li>
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
     * <h2><strong>Product Introduction</strong></h2>
     * <p>E-commerce Video Remix is an AI video service designed for product content production. It covers video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion-oriented expression, and large-scale production. It supports targeted replacement of products or persons based on hit video templates while preserving the original actions, shot rhythm, and marketing structure to rapidly generate multi-version content and reduce shooting, editing, and adaptation costs.</p>
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><strong>Video asset remix:</strong> Use an existing e-commerce video as a template and replace only the specified product or person while preserving the original shots, rhythm, and marketing expression. This is suitable for multi-SKU, multi-model, multi-region, and multi-version asset production.</li>
     * <li><strong>New product launch with rapid asset generation:</strong> For products launched in batches, reduce the need for live shooting, studio time, post-production editing, and repetitive production. Quickly generate video assets for new products and help merchants shorten the cycle from discovering a hit video to scripting and publishing new content.</li>
     * <li><strong>Product presentation and selling point expression:</strong> Suitable for apparel, beauty and personal care, food and beverages, home and daily essentials, 3C electronics, and small appliances. Based on the selling point structure, display actions, and shot rhythm of the original video, generate presentation videos optimized for new product conversion.</li>
     * <li><strong>Multi-selling-point and multi-version testing:</strong> Rapidly generate multiple versions based on different product selling points, target audiences, scripts, shots, and visual styles to support content testing and ad creative iteration.</li>
     * </ul>
     * <h2><strong>Capabilities</strong></h2>
     * <h3><strong>Core capabilities</strong></h3>
     * <p>Two replacement modes are supported:</p>
     * <ul>
     * <li><strong>Product replacement (product_replacement):</strong> Preserves the original video host identity, actions, scene, and selling structure while replacing the original product with the target product.</li>
     * <li><strong>Person replacement (person_replacement):</strong> Preserves the original video product, actions, scene, and selling structure while replacing the on-screen person with the target person from a reference image or description.</li>
     * <li><strong>Fully automated end-to-end generation with zero prompt requirements:</strong> Simply provide a reference video and a target product image or person image. The system automatically completes the entire pipeline including video understanding, script planning, storyboard design, first-frame generation, and video synthesis.</li>
     * <li><strong>Product understanding and information structuring:</strong> Identifies product category, appearance, material, color, structure, and key components, and combines merchant-provided titles, attributes, and selling points to generate usable video expression information.</li>
     * <li><strong>Template video element replacement:</strong> Supports replacing products or persons within the authorized scope, with configurable replacement and protection ranges to minimize changes in non-target areas.</li>
     * <li><strong>Product subject consistency:</strong> Maintains stable product shape, color, texture, pattern, packaging, and logo across different shots, angles, actions, and scenes.</li>
     * <li><strong>Product fidelity:</strong> Multi-round VL quality inspection locks product state (color, texture, structure, and print) throughout the process to prevent product feature drift.</li>
     * <li><strong>Strength category — Apparel:</strong> Faithfully restores apparel details with attention to silhouette, wrinkles, drape, fabric texture, buttons, zippers, prints, and accessories, reducing clipping, deformation, texture loss, and detail artifacts.</li>
     * <li><strong>Selling point script and storyboard replication:</strong> Replicates the selling point structure, video composition, shot sequence, display actions, voiceover content, and closing style of the original video.</li>
     * <li><strong>Commercial model matching:</strong> Supports matching model appearance and display style based on product style, silhouette, target audience, and market requirements.</li>
     * <li><strong>Quality verification and result feedback:</strong> Performs multi-dimensional checks on product subject, person, apparel, text, frame completeness, audio, and overall usability, and outputs result information for manual review.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>E-commerce Video Remix is an AI video service designed for product content production. It covers video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion-oriented expression, and large-scale production. It supports targeted replacement of products or persons based on hit video templates while preserving the original actions, shot rhythm, and marketing structure to rapidly generate multi-version content and reduce shooting, editing, and adaptation costs.</p>
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
     * <h2><strong>Product Introduction</strong></h2>
     * <p>E-commerce Video Remix is an AI video service designed for product content production. It covers video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion-oriented expression, and large-scale production. It supports targeted replacement of products or persons based on hit video templates while preserving the original actions, shot rhythm, and marketing structure to rapidly generate multi-version content and reduce shooting, editing, and adaptation costs.</p>
     * <h2><strong>Scenarios</strong></h2>
     * <ul>
     * <li><strong>Video asset remix:</strong> Use an existing e-commerce video as a template and replace only the specified product or person while preserving the original shots, rhythm, and marketing expression. This is suitable for multi-SKU, multi-model, multi-region, and multi-version asset production.</li>
     * <li><strong>New product launch with rapid asset generation:</strong> For products launched in batches, reduce the need for live shooting, studio time, post-production editing, and repetitive production. Quickly generate video assets for new products and help merchants shorten the cycle from discovering a hit video to scripting and publishing new content.</li>
     * <li><strong>Product presentation and selling point expression:</strong> Suitable for apparel, beauty and personal care, food and beverages, home and daily essentials, 3C electronics, and small appliances. Based on the selling point structure, display actions, and shot rhythm of the original video, generate presentation videos optimized for new product conversion.</li>
     * <li><strong>Multi-selling-point and multi-version testing:</strong> Rapidly generate multiple versions based on different product selling points, target audiences, scripts, shots, and visual styles to support content testing and ad creative iteration.</li>
     * </ul>
     * <h2><strong>Capabilities</strong></h2>
     * <h3><strong>Core capabilities</strong></h3>
     * <p>Two replacement modes are supported:</p>
     * <ul>
     * <li><strong>Product replacement (product_replacement):</strong> Preserves the original video host identity, actions, scene, and selling structure while replacing the original product with the target product.</li>
     * <li><strong>Person replacement (person_replacement):</strong> Preserves the original video product, actions, scene, and selling structure while replacing the on-screen person with the target person from a reference image or description.</li>
     * <li><strong>Fully automated end-to-end generation with zero prompt requirements:</strong> Simply provide a reference video and a target product image or person image. The system automatically completes the entire pipeline including video understanding, script planning, storyboard design, first-frame generation, and video synthesis.</li>
     * <li><strong>Product understanding and information structuring:</strong> Identifies product category, appearance, material, color, structure, and key components, and combines merchant-provided titles, attributes, and selling points to generate usable video expression information.</li>
     * <li><strong>Template video element replacement:</strong> Supports replacing products or persons within the authorized scope, with configurable replacement and protection ranges to minimize changes in non-target areas.</li>
     * <li><strong>Product subject consistency:</strong> Maintains stable product shape, color, texture, pattern, packaging, and logo across different shots, angles, actions, and scenes.</li>
     * <li><strong>Product fidelity:</strong> Multi-round VL quality inspection locks product state (color, texture, structure, and print) throughout the process to prevent product feature drift.</li>
     * <li><strong>Strength category — Apparel:</strong> Faithfully restores apparel details with attention to silhouette, wrinkles, drape, fabric texture, buttons, zippers, prints, and accessories, reducing clipping, deformation, texture loss, and detail artifacts.</li>
     * <li><strong>Selling point script and storyboard replication:</strong> Replicates the selling point structure, video composition, shot sequence, display actions, voiceover content, and closing style of the original video.</li>
     * <li><strong>Commercial model matching:</strong> Supports matching model appearance and display style based on product style, silhouette, target audience, and market requirements.</li>
     * <li><strong>Quality verification and result feedback:</strong> Performs multi-dimensional checks on product subject, person, apparel, text, frame completeness, audio, and overall usability, and outputs result information for manual review.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>E-commerce Video Remix is an AI video service designed for product content production. It covers video understanding, element replacement, quality verification, and result delivery. The service focuses on product and person consistency, detail restoration, conversion-oriented expression, and large-scale production. It supports targeted replacement of products or persons based on hit video templates while preserving the original actions, shot rhythm, and marketing structure to rapidly generate multi-version content and reduce shooting, editing, and adaptation costs.</p>
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
     * <h2>Product Introduction</h2>
     * <p>The image cropping service resizes input images to specified dimensions. It automatically identifies the main subject area and precisely crops to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p><strong>Multi-platform content distribution</strong>: Automatically generates content in multiple sizes to meet the different image size requirements of various platforms and scenarios.</p>
     * </li>
     * <li><p><strong>Content placement</strong>: Automatically adjusts sizes for different ad slots across platforms, highlights the main subject, reduces whitespace, and emphasizes product features.</p>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><p>Automatically identifies the main subject area of an image for precise cropping.</p>
     * </li>
     * <li><p>Supports custom cropping dimensions to adapt to different platforms and devices.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Cropped to 1000×1000</strong></th>
     * <th><strong>Cropped to 3000×2000</strong></th>
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
     * <p>Intelligently crops images to specified dimensions, automatically identifies the main subject area, and precisely crops to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
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
     * <h2>Product Introduction</h2>
     * <p>The image cropping service resizes input images to specified dimensions. It automatically identifies the main subject area and precisely crops to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p><strong>Multi-platform content distribution</strong>: Automatically generates content in multiple sizes to meet the different image size requirements of various platforms and scenarios.</p>
     * </li>
     * <li><p><strong>Content placement</strong>: Automatically adjusts sizes for different ad slots across platforms, highlights the main subject, reduces whitespace, and emphasizes product features.</p>
     * </li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><p>Automatically identifies the main subject area of an image for precise cropping.</p>
     * </li>
     * <li><p>Supports custom cropping dimensions to adapt to different platforms and devices.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Cropped to 1000×1000</strong></th>
     * <th><strong>Cropped to 3000×2000</strong></th>
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
     * <p>Intelligently crops images to specified dimensions, automatically identifies the main subject area, and precisely crops to various sizes to meet design requirements across different scenarios. (Synchronous)</p>
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
     * <p>The intelligent image matting product automatically identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. This product also provides multiple background options and custom size selections to optimize product display. (Synchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p><strong>Secondary editing of materials</strong>: After separating the image subject from the background, users can further edit the image.</p>
     * </li>
     * <li><p><strong>Improved material processing efficiency</strong>: Quickly extracts the subject from various material images for easy background replacement, improving the production efficiency of advertising visuals and marketing posters.</p>
     * </li>
     * </ul>
     * <h2>Functions and features.</h2>
     * <h4>1. One-click precise subject recognition</h4>
     * <ul>
     * <li><p><strong>AI automatic recognition</strong>: Based on deep learning models, intelligently distinguishes foreground subjects (portraits, products, objects, etc.) from backgrounds without manual tracing.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports precise segmentation in complex scenarios (such as hair strands, transparent objects, and fur edges) with accuracy exceeding 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization of edge aliasing and semi-transparent areas (such as smoke and glass), preserving natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, suitable for e-commerce, design, and other scenarios.</p>
     * </li>
     * <li><p><strong>Custom background color support</strong></p>
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
     * <p>Automatically identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. This product also provides multiple background options and custom size selections to optimize product display. (Synchronous)</p>
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
     * <p>The intelligent image matting product automatically identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. This product also provides multiple background options and custom size selections to optimize product display. (Synchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p><strong>Secondary editing of materials</strong>: After separating the image subject from the background, users can further edit the image.</p>
     * </li>
     * <li><p><strong>Improved material processing efficiency</strong>: Quickly extracts the subject from various material images for easy background replacement, improving the production efficiency of advertising visuals and marketing posters.</p>
     * </li>
     * </ul>
     * <h2>Functions and features.</h2>
     * <h4>1. One-click precise subject recognition</h4>
     * <ul>
     * <li><p><strong>AI automatic recognition</strong>: Based on deep learning models, intelligently distinguishes foreground subjects (portraits, products, objects, etc.) from backgrounds without manual tracing.</p>
     * </li>
     * <li><p><strong>Multi-scenario adaptation</strong>: Supports precise segmentation in complex scenarios (such as hair strands, transparent objects, and fur edges) with accuracy exceeding 95%.</p>
     * </li>
     * </ul>
     * <h4>2. Intelligent edge optimization</h4>
     * <ul>
     * <li><strong>Detail-level processing</strong>: Performs automatic optimization of edge aliasing and semi-transparent areas (such as smoke and glass), preserving natural transition effects.</li>
     * </ul>
     * <h4>3. Multi-format output and background operations</h4>
     * <ul>
     * <li><p><strong>Transparent background export</strong>: Directly generates PNG images with transparent backgrounds and white backgrounds, suitable for e-commerce, design, and other scenarios.</p>
     * </li>
     * <li><p><strong>Custom background color support</strong></p>
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
     * <p>Automatically identifies the salient subject in an image, separates the subject from the background, and returns the subject image with the background removed. This product also provides multiple background options and custom size selections to optimize product display. (Synchronous)</p>
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
     * <p>The Intelligent Element Recognition API is designed specifically for identifying specific elements in e-commerce images. It can deeply analyze image details, helping users quickly identify elements such as text, logos, watermarks, and text-containing color blocks in both the subject and background of images. This greatly improves the efficiency and accuracy of image screening. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <p><strong>1. Intelligent image screening and optimization:</strong>
     * Merchants and platforms can use the Intelligent Element Recognition API for image screening to automatically identify images containing specific elements (such as watermarks and logos). After screening, you can call the Intelligent Removal API to optimize these images, improve image quality, and shorten the product release cycle.
     * <strong>2. Automated image processing and efficiency improvement:</strong>
     * With the Intelligent Element Recognition API, merchants and platforms can automate the image processing workflow by automatically identifying and marking image elements that need optimization. This process reduces manual intervention and improves image processing efficiency.</p>
     * <h2>Features</h2>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, refer to the related examples in the removal documentation (reserved text link)</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image</p>
     * </li>
     * <li><p>Image background: The remaining part of the image other than the product subject</p>
     * </li>
     * <li><p>Text: Horizontal/vertical/diagonal English/Chinese text</p>
     * </li>
     * <li><p>Logo: An emblem or trademark</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, emblems, images, URLs, or store names</p>
     * </li>
     * <li><p>Text-containing color block: A color block containing text outside the subject area</p>
     * </li>
     * </ul>
     * <p><strong>2. The main features of the Intelligent Element Recognition API include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow coordination: Used in combination with the Intelligent Removal API. First, the Intelligent Element Recognition API identifies elements that need to be removed, and then the Intelligent Removal API effectively removes them, ensuring the accuracy and efficiency of image processing.</p>
     * </li>
     * </ul>
     * <h2>Technical advantages</h2>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the Intelligent Element Recognition API can process large volumes of images while maintaining fast response times, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: Users can select the element types to identify as needed, including elements in both subject and non-subject areas such as watermarks, logos, and text, meeting personalized recognition requirements.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
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
     * <p>Identifies intelligent elements in e-commerce images.</p>
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
     * <p>The Intelligent Element Recognition API is designed specifically for identifying specific elements in e-commerce images. It can deeply analyze image details, helping users quickly identify elements such as text, logos, watermarks, and text-containing color blocks in both the subject and background of images. This greatly improves the efficiency and accuracy of image screening. (Synchronous)</p>
     * <h2>Scenarios</h2>
     * <p><strong>1. Intelligent image screening and optimization:</strong>
     * Merchants and platforms can use the Intelligent Element Recognition API for image screening to automatically identify images containing specific elements (such as watermarks and logos). After screening, you can call the Intelligent Removal API to optimize these images, improve image quality, and shorten the product release cycle.
     * <strong>2. Automated image processing and efficiency improvement:</strong>
     * With the Intelligent Element Recognition API, merchants and platforms can automate the image processing workflow by automatically identifying and marking image elements that need optimization. This process reduces manual intervention and improves image processing efficiency.</p>
     * <h2>Features</h2>
     * <p><strong>1. Definitions of image subject, image background, text, logo, watermark, and text-containing color block: For details, refer to the related examples in the removal documentation (reserved text link)</strong></p>
     * <ul>
     * <li><p>Image subject: The core product area in the image</p>
     * </li>
     * <li><p>Image background: The remaining part of the image other than the product subject</p>
     * </li>
     * <li><p>Text: Horizontal/vertical/diagonal English/Chinese text</p>
     * </li>
     * <li><p>Logo: An emblem or trademark</p>
     * </li>
     * <li><p>Watermark: Monochrome transparent text, emblems, images, URLs, or store names</p>
     * </li>
     * <li><p>Text-containing color block: A color block containing text outside the subject area</p>
     * </li>
     * </ul>
     * <p><strong>2. The main features of the Intelligent Element Recognition API include:</strong></p>
     * <ul>
     * <li><p>Element recognition: Identifies whether text, logos, watermarks, and text-containing color blocks exist in the image subject and background.</p>
     * </li>
     * <li><p>Workflow coordination: Used in combination with the Intelligent Removal API. First, the Intelligent Element Recognition API identifies elements that need to be removed, and then the Intelligent Removal API effectively removes them, ensuring the accuracy and efficiency of image processing.</p>
     * </li>
     * </ul>
     * <h2>Technical advantages</h2>
     * <ul>
     * <li><p>Synchronous batch processing: As a synchronous API, the Intelligent Element Recognition API can process large volumes of images while maintaining fast response times, adapting to business needs of different scales.</p>
     * </li>
     * <li><p>Flexibility: Users can select the element types to identify as needed, including elements in both subject and non-subject areas such as watermarks, logos, and text, meeting personalized recognition requirements.</p>
     * </li>
     * </ul>
     * <h2>Effect comparison</h2>
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
     * <p>Identifies intelligent elements in e-commerce images.</p>
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
     * <h2>Product introduction</h2>
     * <p>The intelligent image removal product is designed specifically for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and watermarks from e-commerce images. You can specify objects to remove as needed, enabling efficient and precise batch processing of images and simplifying image editing workflows. (Synchronous/Asynchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide clearer, more focused product displays and enhance the shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform product information synchronization:</strong></li>
     * </ul>
     * <p>When merchants list products across different e-commerce platforms, they can quickly remove specific text and watermarks to comply with image specifications of different platforms.</p>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, clarify the definitions of image subject and image background. When specifying objects to remove, you can choose whether the removal scope is the image subject or the image background area. Both API and editor access methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the remaining part of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the following four types of objects can be removed: text, specific names, transparent text blocks, and watermarks. Refer to the following examples to clarify your requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/AJdl65AyryVZyOke/img/4bd2c812-ed3c-45da-8a86-ebd29102f4b1.jpeg" alt="Main image 1 - Leopard print large capacity millennium crossbody canvas bag.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/eff0eb1b-36df-431d-a010-3bb3b7348ff9.png" alt="image.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/c44ac17b-3fa4-4a6f-b411-90f1062b183b.jpeg" alt="Main image 1 - Short round-tip French false nails with handle.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/af779684-4aa5-49b0-8668-34ab8bd4bcc1.png" alt="image.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligently identifies and removes text, specific names, transparent text blocks, and watermarks from e-commerce images, supports specifying objects to remove as needed, enables efficient and precise batch processing of images, and simplifies image editing workflows (synchronous/asynchronous).</p>
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
     * <h2>Product introduction</h2>
     * <p>The intelligent image removal product is designed specifically for e-commerce images. It automatically identifies and removes text, specific names, transparent text blocks, and watermarks from e-commerce images. You can specify objects to remove as needed, enabling efficient and precise batch processing of images and simplifying image editing workflows. (Synchronous/Asynchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide clearer, more focused product displays and enhance the shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform product information synchronization:</strong></li>
     * </ul>
     * <p>When merchants list products across different e-commerce platforms, they can quickly remove specific text and watermarks to comply with image specifications of different platforms.</p>
     * <h2>Features</h2>
     * <ol>
     * <li><p>First, clarify the definitions of image subject and image background. When specifying objects to remove, you can choose whether the removal scope is the image subject or the image background area. Both API and editor access methods are supported to meet different types of requirements.</p>
     * <ol>
     * <li><p>Image subject: the core product area in the image.</p>
     * </li>
     * <li><p>Image background: the remaining part of the image other than the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>Second, the following four types of objects can be removed: text, specific names, transparent text blocks, and watermarks. Refer to the following examples to clarify your requirements and perform targeted operations:</p>
     * </li>
     * </ol>
     * <h2>Effect comparison</h2>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Original image</strong></th>
     * <th><strong>Image after removal</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/AJdl65AyryVZyOke/img/4bd2c812-ed3c-45da-8a86-ebd29102f4b1.jpeg" alt="Main image 1 - Leopard print large capacity millennium crossbody canvas bag.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/eff0eb1b-36df-431d-a010-3bb3b7348ff9.png" alt="image.png"></td>
     * </tr>
     * <tr>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/c44ac17b-3fa4-4a6f-b411-90f1062b183b.jpeg" alt="Main image 1 - Short round-tip French false nails with handle.jpeg"></td>
     * <td><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/5VLqXLbGJZd3VqX1/img/af779684-4aa5-49b0-8668-34ab8bd4bcc1.png" alt="image.png"></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Intelligently identifies and removes text, specific names, transparent text blocks, and watermarks from e-commerce images, supports specifying objects to remove as needed, enables efficient and precise batch processing of images, and simplifies image editing workflows (synchronous/asynchronous).</p>
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
     * <h1>Product Introduction</h1>
     * <p>The intelligent image removal product is designed specifically for e-commerce images. It automatically detects and removes text, specific names, transparent text blocks, and visual clutter from e-commerce images. You can specify objects to remove on demand, enabling efficient and precise batch processing of large volumes of images to simplify image editing workflows. (Synchronous)</p>
     * <h1>Common scenarios</h1>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide clearer, more focused product displays and enhance the shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform product information synchronization:</strong></li>
     * </ul>
     * <p>When listing products across different e-commerce platforms, quickly remove specific text and visual clutter to comply with image specifications of different platforms.</p>
     * <ul>
     * <li><strong>Marketing material preparation:</strong></li>
     * </ul>
     * <p>Easily remove existing promotional information and quickly update images with the latest campaign details.</p>
     * <blockquote>
     * <p>Note: Merchants or platforms can batch-remove impurities from images to optimize image quality. We recommend using this in combination with the &quot;Intelligent Recognition API&quot; (coming soon). First, filter out images containing text, specific names, transparent text blocks, and visual clutter, then use the &quot;Intelligent Removal API&quot; for batch removal. The Intelligent Recognition API focuses on &quot;recognition,&quot; while the Intelligent Removal API focuses on &quot;removal.&quot; By calling them sequentially, you can maximize removal effectiveness and reduce false removals and false identifications.</p>
     * </blockquote>
     * <h1>Features</h1>
     * <ol>
     * <li><p>First, understand the definitions of image subject and image background. When specifying removal targets, you can choose whether the removal scope is the image subject or the image background area. Both API and editor access methods are supported to meet different requirements.</p>
     * <ol>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The remaining portion of the image excluding the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>The following three removal target options are supported:</p>
     * <ol>
     * <li><p>Select by type only. Supported types include text, specific names, transparent text blocks, and visual clutter. Refer to the following examples to clarify your requirements and perform targeted operations.</p>
     * </li>
     * <li><p>(Upgrade) Specify images to remove. You can specify multiple images at a time.</p>
     * </li>
     * <li><p>(Upgrade) Specify text to remove. You can specify multiple text strings at a time.</p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>Processing workflow: User submits original image URL → OCR+VLM model detects text or image positions → Determines coordinates of areas to repair → AI repairs and generates a clean image → Returns the result image URL.</p>
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
     * | Specific names | *   Involving the image subject area</p>
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
     * | Transparent text blocks | *   Involving the image subject area</p>
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
     * | Visual clutter | *   Involving the image subject area</p>
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
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |
     * | Specified image element removal (supports multiple image links) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/9297951f-53c1-4476-8c69-5c31df3fce21.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ef3f35aa-609f-454c-bba0-dd1710c83945.png" alt="image.png"> |
     * | Specified text removal (supports multiple text strings) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c784d8be-4b4d-4972-8b99-828c742b8f03.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/805423ca-bd0d-4d44-a18e-a7d7bfe88587.png" alt="image.png"> |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images, automatically detecting and erasing text, specific names, transparent text blocks, and visual clutter. Supports specifying objects to remove on demand, enabling efficient and precise batch processing of large volumes of images to simplify image editing workflows. (Synchronous)</p>
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
     * <p>The intelligent image removal product is designed specifically for e-commerce images. It automatically detects and removes text, specific names, transparent text blocks, and visual clutter from e-commerce images. You can specify objects to remove on demand, enabling efficient and precise batch processing of large volumes of images to simplify image editing workflows. (Synchronous)</p>
     * <h1>Common scenarios</h1>
     * <ul>
     * <li><strong>Efficient e-commerce image processing:</strong></li>
     * </ul>
     * <p>Remove irrelevant visual elements to provide clearer, more focused product displays and enhance the shopping experience.</p>
     * <ul>
     * <li><strong>Multi-platform product information synchronization:</strong></li>
     * </ul>
     * <p>When listing products across different e-commerce platforms, quickly remove specific text and visual clutter to comply with image specifications of different platforms.</p>
     * <ul>
     * <li><strong>Marketing material preparation:</strong></li>
     * </ul>
     * <p>Easily remove existing promotional information and quickly update images with the latest campaign details.</p>
     * <blockquote>
     * <p>Note: Merchants or platforms can batch-remove impurities from images to optimize image quality. We recommend using this in combination with the &quot;Intelligent Recognition API&quot; (coming soon). First, filter out images containing text, specific names, transparent text blocks, and visual clutter, then use the &quot;Intelligent Removal API&quot; for batch removal. The Intelligent Recognition API focuses on &quot;recognition,&quot; while the Intelligent Removal API focuses on &quot;removal.&quot; By calling them sequentially, you can maximize removal effectiveness and reduce false removals and false identifications.</p>
     * </blockquote>
     * <h1>Features</h1>
     * <ol>
     * <li><p>First, understand the definitions of image subject and image background. When specifying removal targets, you can choose whether the removal scope is the image subject or the image background area. Both API and editor access methods are supported to meet different requirements.</p>
     * <ol>
     * <li><p>Image subject: The core product area in the image.</p>
     * </li>
     * <li><p>Image background: The remaining portion of the image excluding the product subject.</p>
     * </li>
     * </ol>
     * </li>
     * <li><p>The following three removal target options are supported:</p>
     * <ol>
     * <li><p>Select by type only. Supported types include text, specific names, transparent text blocks, and visual clutter. Refer to the following examples to clarify your requirements and perform targeted operations.</p>
     * </li>
     * <li><p>(Upgrade) Specify images to remove. You can specify multiple images at a time.</p>
     * </li>
     * <li><p>(Upgrade) Specify text to remove. You can specify multiple text strings at a time.</p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>Processing workflow: User submits original image URL → OCR+VLM model detects text or image positions → Determines coordinates of areas to repair → AI repairs and generates a clean image → Returns the result image URL.</p>
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
     * | Specific names | *   Involving the image subject area</p>
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
     * | Transparent text blocks | *   Involving the image subject area</p>
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
     * | Visual clutter | *   Involving the image subject area</p>
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
     * <p><img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/caa6994b-2f97-484d-a807-671a0dc75947.jpeg" alt="dee0c7cf-8b0d-4d6d-9677-d5f2e6099834.jpeg"> |
     * | Specified image element removal (supports multiple image links) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/9297951f-53c1-4476-8c69-5c31df3fce21.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/ef3f35aa-609f-454c-bba0-dd1710c83945.png" alt="image.png"> |
     * | Specified text removal (supports multiple text strings) | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/c784d8be-4b4d-4972-8b99-828c742b8f03.png" alt="image.png"> | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/Mp7ld7bZAb2VAOBQ/img/805423ca-bd0d-4d44-a18e-a7d7bfe88587.png" alt="image.png"> |</p>
     * 
     * <b>summary</b> : 
     * <p>Intelligently removes unwanted elements from e-commerce images, automatically detecting and erasing text, specific names, transparent text blocks, and visual clutter. Supports specifying objects to remove on demand, enabling efficient and precise batch processing of large volumes of images to simplify image editing workflows. (Synchronous)</p>
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
     * <h2>Common scenarios</h2>
     * <p>Main product images and detail images for cross-border e-commerce.</p>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><p><strong>Product body information protection</strong>: Allows you to choose whether to translate text on the product body, helping you protect body information such as embedded product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to choose whether to translate brand names on images, helping you protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention support</strong>: Allows you to customize translation results, including no translation (ABC-ABC), specified translation (ABC-DEF), and removal (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates text in images using the PLUS edition, which is designed specifically for e-commerce images and adopts a Mixture of Experts (MOE) architecture. Compared to the Lite and Pro editions of image translation, this edition delivers superior translation accuracy for multiple minority languages. We recommend using it for the following 8 language directions, with more language directions to be supported in the future.</p>
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
     * <h2>Common scenarios</h2>
     * <p>Main product images and detail images for cross-border e-commerce.</p>
     * <h2>Functions and features</h2>
     * <ul>
     * <li><p><strong>Product body information protection</strong>: Allows you to choose whether to translate text on the product body, helping you protect body information such as embedded product names from being translated.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to choose whether to translate brand names on images, helping you protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Translation intervention support</strong>: Allows you to customize translation results, including no translation (ABC-ABC), specified translation (ABC-DEF), and removal (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates text in images using the PLUS edition, which is designed specifically for e-commerce images and adopts a Mixture of Experts (MOE) architecture. Compared to the Lite and Pro editions of image translation, this edition delivers superior translation accuracy for multiple minority languages. We recommend using it for the following 8 language directions, with more language directions to be supported in the future.</p>
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
     * <p>The Image Translation Pro edition is designed specifically for e-commerce images. It integrates multimodal large model technology to achieve more accurate image understanding, significantly improve translation quality, and continuously expand and optimize multilingual translation capabilities. It supports more than 100 language directions (including bridged directions).</p>
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Product subject protection</strong>: Allows you to choose whether to translate text on the product subject, helping you protect subject information such as embedded product names from being translated.</li>
     * <li><strong>Post-translation editing</strong>: Allows you to choose whether to return layout information such as text position, font, and color. This can be used for secondary editing when integrated with an image editor. The editor SDK is not yet available. Follow platform notifications for updates.</li>
     * <li><strong>Brand name protection</strong>: Allows you to choose whether to translate brand names on images, helping you protect brand name information from being translated.</li>
     * <li><strong>Translation intervention</strong>: Allows you to customize translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). This is commonly used for brand name protection and similar scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.  </li>
     * <li><strong>Image editor integration</strong>: For more information, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image Translation Editor Protocol</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates images using the Pro edition, which is designed for e-commerce images and integrates multimodal large model technology to achieve more accurate image understanding, significantly improve translation quality, and continuously expand and optimize multilingual translation capabilities. Supports more than 100 language directions (including bridged directions).</p>
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
     * <p>The Image Translation Pro edition is designed specifically for e-commerce images. It integrates multimodal large model technology to achieve more accurate image understanding, significantly improve translation quality, and continuously expand and optimize multilingual translation capabilities. It supports more than 100 language directions (including bridged directions).</p>
     * <h2>Scenarios</h2>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Product subject protection</strong>: Allows you to choose whether to translate text on the product subject, helping you protect subject information such as embedded product names from being translated.</li>
     * <li><strong>Post-translation editing</strong>: Allows you to choose whether to return layout information such as text position, font, and color. This can be used for secondary editing when integrated with an image editor. The editor SDK is not yet available. Follow platform notifications for updates.</li>
     * <li><strong>Brand name protection</strong>: Allows you to choose whether to translate brand names on images, helping you protect brand name information from being translated.</li>
     * <li><strong>Translation intervention</strong>: Allows you to customize translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). This is commonly used for brand name protection and similar scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.  </li>
     * <li><strong>Image editor integration</strong>: For more information, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image Translation Editor Protocol</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates images using the Pro edition, which is designed for e-commerce images and integrates multimodal large model technology to achieve more accurate image understanding, significantly improve translation quality, and continuously expand and optimize multilingual translation capabilities. Supports more than 100 language directions (including bridged directions).</p>
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
     * <h1>1. Product Introduction</h1>
     * <p>The image translation product is designed specifically for e-commerce images, supporting over 100 language directions (including bridging). It accurately handles complex text layouts within images and ensures that translated content matches the image context, helping e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content. The product also returns layer information such as text position, font, and color, enabling secondary editing of translation results through an image editor.</p>
     * <h1>2. Common scenarios</h1>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h1>3. Features</h1>
     * <ul>
     * <li><p><strong>Product area protection</strong>: Allows you to choose whether to translate text on the product area. This helps protect product information from being translated, avoiding translation of embedded information such as product names.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to choose whether to translate brand names on images. This helps protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Secondary editing after translation (layer information)</strong>: Allows you to choose whether to return layer information such as text position, font, and color. This can be used to integrate with an image editor for secondary editing of translation results. For the release progress of the editor SDK package, follow platform notifications.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including no translation (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.  </p>
     * </li>
     * <li><p><strong>Image editor integration</strong>: For more information, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image translation editor protocol</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates text in images with support for over 100 language directions (including bridging). This product is designed specifically for e-commerce images, accurately handling complex text layouts within images and ensuring that translated content matches the image context. It helps e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content. The product also returns layer information such as text position, font, and color, enabling secondary editing of translation results through an image editor.</p>
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
     * <p>The image translation product is designed specifically for e-commerce images, supporting over 100 language directions (including bridging). It accurately handles complex text layouts within images and ensures that translated content matches the image context, helping e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content. The product also returns layer information such as text position, font, and color, enabling secondary editing of translation results through an image editor.</p>
     * <h1>2. Common scenarios</h1>
     * <p>E-commerce product images, marketing images, and images for various other scenarios.</p>
     * <h1>3. Features</h1>
     * <ul>
     * <li><p><strong>Product area protection</strong>: Allows you to choose whether to translate text on the product area. This helps protect product information from being translated, avoiding translation of embedded information such as product names.</p>
     * </li>
     * <li><p><strong>Brand name protection</strong>: Allows you to choose whether to translate brand names on images. This helps protect brand name information from being translated.</p>
     * </li>
     * <li><p><strong>Secondary editing after translation (layer information)</strong>: Allows you to choose whether to return layer information such as text position, font, and color. This can be used to integrate with an image editor for secondary editing of translation results. For the release progress of the editor SDK package, follow platform notifications.</p>
     * </li>
     * <li><p><strong>Translation intervention</strong>: Allows you to customize translation results, including no translation (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs in different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.  </p>
     * </li>
     * <li><p><strong>Image editor integration</strong>: For more information, see <a href="https://www.alibabacloud.com/help/en/document_detail/3042647.html">Image translation editor protocol</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Translates text in images with support for over 100 language directions (including bridging). This product is designed specifically for e-commerce images, accurately handling complex text layouts within images and ensuring that translated content matches the image context. It helps e-commerce platforms and developers easily achieve multilingual conversion and rendering of image content. The product also returns layer information such as text position, font, and color, enabling secondary editing of translation results through an image editor.</p>
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
     * <p>Supports automatic language identification for 31 languages in query phrase scenarios and 35 languages in general scenarios. Applicable to short text language identification such as search terms, titles, and conversations. For supported language directions, refer to the <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports automatic language identification for 31 languages in query scenarios and 35 languages in general scenarios. Applicable to short text language identification such as search terms, titles, and conversations.</p>
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
     * <p>Supports automatic language identification for 31 languages in query phrase scenarios and 35 languages in general scenarios. Applicable to short text language identification such as search terms, titles, and conversations. For supported language directions, refer to the <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Supports automatic language identification for 31 languages in query scenarios and 35 languages in general scenarios. Applicable to short text language identification such as search terms, titles, and conversations.</p>
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
     * <li><p><strong>In-store marketing material compliance inspection</strong>: Automatically determines whether marketing materials (functional display cards, posters, door-shaped display stands, etc.) are placed or posted according to the standard display guidelines issued by headquarters. Identifies typical issues such as &quot;not placed,&quot; &quot;placed incorrectly,&quot; or &quot;content mismatch.&quot;</p>
     * </li>
     * <li><p><strong>New product/campaign material deployment verification</strong>: During new product launches or sales promotions, automatically verifies in batch whether campaign materials in store photos have been deployed as required for listing, replacing manual spot checks.</p>
     * </li>
     * <li><p><strong>Adaptive dual-image comparison and single-image detection</strong>: The same API supports both &quot;reference image + target image&quot; dual-image comparison (Mode A) and &quot;target image only&quot; single-image detection (Mode B). The mode switches automatically based on whether <code>ImageRefer</code> is provided. Callers do not need to differentiate between invocation methods.</p>
     * </li>
     * </ul>
     * <h2><strong>Features</strong></h2>
     * <ul>
     * <li><p><strong>Multi-mode intelligent routing</strong>: Built-in material type parsing capability that automatically identifies the target material type based on <code>Rules</code> natural language text and routes to the corresponding material detection pipeline. Callers only need to provide image URLs and rule text. Currently, four detection routing pipelines are supported: &quot;functional display card,&quot; &quot;poster,&quot; &quot;door-shaped display stand,&quot; and &quot;other materials.&quot; Additional detection pipelines for specific marketing material types will be added over time.</p>
     * </li>
     * <li><p><strong>MLLM semantic-level understanding + rule structuring collaboration</strong>: Uses a multimodal large model for material recognition, content comparison, text OCR, and other semantic-level understanding tasks. Combined with rule cleaning and structuring models, natural language rules are decomposed into individually assessable steps (S1/S2...), ensuring accuracy while maintaining rule flexibility and traceability.</p>
     * </li>
     * <li><p><strong>Structured audit conclusion output</strong>: Output is unified into the <code>Result.OverallResult</code> + <code>Result.Steps[]</code> + <code>Result.Evidence</code> structure. The overall conclusion is derived from the logical AND of all steps. Each step is independently visible, facilitating direct integration with downstream business systems and supporting case-level manual review traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs. Both single-image (Mode B) and dual-image (Mode A) calling modes are supported, with identical output structures.</p>
     * </li>
     * </ul>
     * <h2><strong>Invocation method</strong></h2>
     * <ul>
     * <li><p><strong>Synchronous call</strong>: A single request returns the detection result without polling. The response uses the unified envelope of <code>Code</code> / <code>Message</code> / <code>RequestId</code> / <code>Success</code> / <code>Data</code>.</p>
     * </li>
     * <li><p><strong>Authentication and signing</strong>: Invoked through the Aidge gateway. Authentication, signing, and common parameters follow the platform\&quot;s unified access method. Refer to the officially published API reference for the specific request path.</p>
     * </li>
     * <li><p><strong>Timeout settings</strong>: Set the request timeout to no less than the maximum response time of the API (refer to the official publication for the specific value).</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects the compliance of marketing material displays in retail stores based on a multimodal large language model (MLLM). This API targets in-store marketing material inspection scenarios for offline retail and channel stores. It performs natural-language-level compliance checks on standard materials such as functional display cards, posters, and door-shaped display stands, as well as long-tail materials such as light cloth banners, KT boards, floor stickers, and light boxes in store photos, according to inspection rules. It outputs structured conclusions and Chinese-language evidence descriptions that can be directly integrated with business systems. This is a <strong>synchronous</strong> call that returns results in a single request.</p>
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
     * <li><p><strong>In-store marketing material compliance inspection</strong>: Automatically determines whether marketing materials (functional display cards, posters, door-shaped display stands, etc.) are placed or posted according to the standard display guidelines issued by headquarters. Identifies typical issues such as &quot;not placed,&quot; &quot;placed incorrectly,&quot; or &quot;content mismatch.&quot;</p>
     * </li>
     * <li><p><strong>New product/campaign material deployment verification</strong>: During new product launches or sales promotions, automatically verifies in batch whether campaign materials in store photos have been deployed as required for listing, replacing manual spot checks.</p>
     * </li>
     * <li><p><strong>Adaptive dual-image comparison and single-image detection</strong>: The same API supports both &quot;reference image + target image&quot; dual-image comparison (Mode A) and &quot;target image only&quot; single-image detection (Mode B). The mode switches automatically based on whether <code>ImageRefer</code> is provided. Callers do not need to differentiate between invocation methods.</p>
     * </li>
     * </ul>
     * <h2><strong>Features</strong></h2>
     * <ul>
     * <li><p><strong>Multi-mode intelligent routing</strong>: Built-in material type parsing capability that automatically identifies the target material type based on <code>Rules</code> natural language text and routes to the corresponding material detection pipeline. Callers only need to provide image URLs and rule text. Currently, four detection routing pipelines are supported: &quot;functional display card,&quot; &quot;poster,&quot; &quot;door-shaped display stand,&quot; and &quot;other materials.&quot; Additional detection pipelines for specific marketing material types will be added over time.</p>
     * </li>
     * <li><p><strong>MLLM semantic-level understanding + rule structuring collaboration</strong>: Uses a multimodal large model for material recognition, content comparison, text OCR, and other semantic-level understanding tasks. Combined with rule cleaning and structuring models, natural language rules are decomposed into individually assessable steps (S1/S2...), ensuring accuracy while maintaining rule flexibility and traceability.</p>
     * </li>
     * <li><p><strong>Structured audit conclusion output</strong>: Output is unified into the <code>Result.OverallResult</code> + <code>Result.Steps[]</code> + <code>Result.Evidence</code> structure. The overall conclusion is derived from the logical AND of all steps. Each step is independently visible, facilitating direct integration with downstream business systems and supporting case-level manual review traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs. Both single-image (Mode B) and dual-image (Mode A) calling modes are supported, with identical output structures.</p>
     * </li>
     * </ul>
     * <h2><strong>Invocation method</strong></h2>
     * <ul>
     * <li><p><strong>Synchronous call</strong>: A single request returns the detection result without polling. The response uses the unified envelope of <code>Code</code> / <code>Message</code> / <code>RequestId</code> / <code>Success</code> / <code>Data</code>.</p>
     * </li>
     * <li><p><strong>Authentication and signing</strong>: Invoked through the Aidge gateway. Authentication, signing, and common parameters follow the platform\&quot;s unified access method. Refer to the officially published API reference for the specific request path.</p>
     * </li>
     * <li><p><strong>Timeout settings</strong>: Set the request timeout to no less than the maximum response time of the API (refer to the official publication for the specific value).</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects the compliance of marketing material displays in retail stores based on a multimodal large language model (MLLM). This API targets in-store marketing material inspection scenarios for offline retail and channel stores. It performs natural-language-level compliance checks on standard materials such as functional display cards, posters, and door-shaped display stands, as well as long-tail materials such as light cloth banners, KT boards, floor stickers, and light boxes in store photos, according to inspection rules. It outputs structured conclusions and Chinese-language evidence descriptions that can be directly integrated with business systems. This is a <strong>synchronous</strong> call that returns results in a single request.</p>
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
     * <p>Display detection is an intelligent product display recognition capability built on a multimodal large language model (MLLM) combined with visual vector recall. It targets shelf and floor-stack inspection scenarios in offline retail and channel stores. For photos of shelves or floor stacks taken in stores, the product first uses a multimodal large model to detect the bounding box and preliminary name of each product, then performs similarity recall against the customer\&quot;s dedicated SKU vector library to exactly match each product to the customer\&quot;s own SKUs. The output is per-product structured results that can be directly integrated with business systems. It is suitable for large-scale, high-concurrent visual recognition pipelines such as remote auditing of in-store displays by headquarters, SKU distribution verification, and display compliance inspection.</p>
     * <h2><strong>Common scenarios</strong></h2>
     * <ul>
     * <li><p><strong>Shelf/floor-stack display recognition and inventory</strong>: Identifies each product in a shelf or floor-stack image and matches it to the customer\&quot;s SKU library, outputting a per-product list (product name + position + similarity score) to replace manual counting.</p>
     * </li>
     * <li><p><strong>Distribution verification/SKU compliance</strong>: Verifies whether stores display specified SKUs as required by headquarters and whether out-of-stock or misplaced items exist, supporting batch automated verification during promotions or new product launches.</p>
     * </li>
     * <li><p><strong>Customer-dedicated SKU library</strong>: Customers upload their own SKU reference images to build a dedicated vector library (isolated by <code>RagId</code>). During recognition, retrieval is performed only within that customer\&quot;s library, ensuring name accuracy and data isolation between customers.</p>
     * </li>
     * </ul>
     * <h2><strong>Functions and features</strong></h2>
     * <ul>
     * <li><p><strong>Two-stage detection + retrieval collaboration</strong>: The multimodal large model detects each product bounding box and preliminary name on the full image (semantic-level understanding, adapted for dense displays and partial occlusion). Then visual embedding vectors perform similarity retrieval within the customer\&quot;s SKU library, overriding the preliminary name with the top-1 precise SKU name to balance recall rate and name accuracy.</p>
     * </li>
     * <li><p><strong>Dedicated vector library with isolated retrieval</strong>: A dedicated SKU vector library is maintained for each customer by <code>RagId</code>. Recognition retrieves only within the corresponding library with strict isolation between customers. Newly added or updated SKUs take effect in real time.</p>
     * </li>
     * <li><p><strong>Per-product structured output</strong>: Output is unified as <code>Result.Items[]</code>, with each product independently providing a bounding box, recalled SKU name, SKU code, and similarity score. This facilitates direct integration with downstream inventory/verification systems and supports case-level manual review and traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports image URLs accessible over the public network or from OSS. A single shelf or floor-stack image is sufficient for recognition, and the output structure is consistent.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects and identifies products displayed on store shelves or floor stacks by combining a multimodal large language model (MLLM) with visual vector recall, targeting shelf and floor-stack inspection scenarios in offline retail and channel stores. For photos of shelves or floor stacks taken in stores, the product first uses a multimodal large model to detect the bounding box and preliminary name of each product, then performs similarity recall against the customer\&quot;s dedicated SKU vector library to exactly match each product to the customer\&quot;s own SKUs. The output is per-product structured results that can be directly integrated with business systems. It is suitable for large-scale, high-concurrent visual recognition pipelines such as remote auditing of in-store displays by headquarters, SKU distribution verification, and display compliance inspection.</p>
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
     * <p>Display detection is an intelligent product display recognition capability built on a multimodal large language model (MLLM) combined with visual vector recall. It targets shelf and floor-stack inspection scenarios in offline retail and channel stores. For photos of shelves or floor stacks taken in stores, the product first uses a multimodal large model to detect the bounding box and preliminary name of each product, then performs similarity recall against the customer\&quot;s dedicated SKU vector library to exactly match each product to the customer\&quot;s own SKUs. The output is per-product structured results that can be directly integrated with business systems. It is suitable for large-scale, high-concurrent visual recognition pipelines such as remote auditing of in-store displays by headquarters, SKU distribution verification, and display compliance inspection.</p>
     * <h2><strong>Common scenarios</strong></h2>
     * <ul>
     * <li><p><strong>Shelf/floor-stack display recognition and inventory</strong>: Identifies each product in a shelf or floor-stack image and matches it to the customer\&quot;s SKU library, outputting a per-product list (product name + position + similarity score) to replace manual counting.</p>
     * </li>
     * <li><p><strong>Distribution verification/SKU compliance</strong>: Verifies whether stores display specified SKUs as required by headquarters and whether out-of-stock or misplaced items exist, supporting batch automated verification during promotions or new product launches.</p>
     * </li>
     * <li><p><strong>Customer-dedicated SKU library</strong>: Customers upload their own SKU reference images to build a dedicated vector library (isolated by <code>RagId</code>). During recognition, retrieval is performed only within that customer\&quot;s library, ensuring name accuracy and data isolation between customers.</p>
     * </li>
     * </ul>
     * <h2><strong>Functions and features</strong></h2>
     * <ul>
     * <li><p><strong>Two-stage detection + retrieval collaboration</strong>: The multimodal large model detects each product bounding box and preliminary name on the full image (semantic-level understanding, adapted for dense displays and partial occlusion). Then visual embedding vectors perform similarity retrieval within the customer\&quot;s SKU library, overriding the preliminary name with the top-1 precise SKU name to balance recall rate and name accuracy.</p>
     * </li>
     * <li><p><strong>Dedicated vector library with isolated retrieval</strong>: A dedicated SKU vector library is maintained for each customer by <code>RagId</code>. Recognition retrieves only within the corresponding library with strict isolation between customers. Newly added or updated SKUs take effect in real time.</p>
     * </li>
     * <li><p><strong>Per-product structured output</strong>: Output is unified as <code>Result.Items[]</code>, with each product independently providing a bounding box, recalled SKU name, SKU code, and similarity score. This facilitates direct integration with downstream inventory/verification systems and supports case-level manual review and traceability.</p>
     * </li>
     * <li><p><strong>Supported input formats</strong>: Currently supports image URLs accessible over the public network or from OSS. A single shelf or floor-stack image is sufficient for recognition, and the output structure is consistent.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects and identifies products displayed on store shelves or floor stacks by combining a multimodal large language model (MLLM) with visual vector recall, targeting shelf and floor-stack inspection scenarios in offline retail and channel stores. For photos of shelves or floor stacks taken in stores, the product first uses a multimodal large model to detect the bounding box and preliminary name of each product, then performs similarity recall against the customer\&quot;s dedicated SKU vector library to exactly match each product to the customer\&quot;s own SKUs. The output is per-product structured results that can be directly integrated with business systems. It is suitable for large-scale, high-concurrent visual recognition pipelines such as remote auditing of in-store displays by headquarters, SKU distribution verification, and display compliance inspection.</p>
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
     * <h2>Product Introduction</h2>
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured review across multiple dimensions including <strong>bounding box validity, bounding box fit accuracy, and foreign object interference</strong> for parcels on scanning platforms. It adapts to different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese reason descriptions that can directly interface with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * <h2>Scenarios</h2>
     * <ol>
     * <li><strong>Parcel bounding box review</strong>: Automatically determines whether the operator\&quot;s manual bounding box constitutes the &quot;minimum effective border rectangle&quot; for the parcel, identifying typical issues such as oversized or undersized bounding boxes.</li>
     * <li><strong>Foreign object interference detection</strong>: Automatically identifies whether non-target objects such as fingers, keyboards, or supporting tools are present in the scanning area.</li>
     * <li><strong>Multi-capture environment adaptation</strong>: A single API handles both white background board (blue frame) and green background board (blue frame + red frame) capture patterns without requiring the caller to distinguish between scenarios.</li>
     * <li><strong>Inbound quality inspection pipeline</strong>: Used for automated compliance review in the piece-weight-dimension stage of the logistics warehouse new product inbound SOP, as a replacement for or supplement to manual outsourced review.
     * The product is also applicable to general image &quot;frame-subject&quot; relationship review scenarios, such as product photography material review and document scanning quality verification.</li>
     * </ol>
     * <h2>Features</h2>
     * <ol>
     * <li><strong>Multi-scenario intelligent routing</strong>: The product has built-in scenario classification capabilities that automatically identify the background type (white/green) and bounding box type (none/single frame/double frame) in images, and route requests to the corresponding review sub-process. Callers only need to pass in the image URL without manually specifying the scenario.</li>
     * <li><strong>MLLM + dedicated CV model collaboration</strong>: Uses a multimodal large language model for semantic-level scene understanding and foreign object recognition, and uses dedicated parcel segmentation and IoU evaluation models for pixel-level bounding box fit quantification, ensuring accuracy while controlling inference latency and cost.</li>
     * <li><strong>Structured review conclusions</strong>: Output is unified as <code>result</code> (Boolean) + <code>info</code> (Chinese reason) structure. Supported reason types include &quot;Review passed&quot;, &quot;Review failed: bounding box too large&quot;, &quot;Review failed: bounding box too small&quot;, &quot;Review failed: foreign object detected&quot;, and others, enabling direct integration with downstream business systems.</li>
     * <li><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured review across multiple dimensions including bounding box validity, bounding box fit accuracy, and foreign object interference for parcels on scanning platforms. It adapts to different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese reason descriptions that can directly interface with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
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
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured review across multiple dimensions including <strong>bounding box validity, bounding box fit accuracy, and foreign object interference</strong> for parcels on scanning platforms. It adapts to different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese reason descriptions that can directly interface with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
     * <h2>Scenarios</h2>
     * <ol>
     * <li><strong>Parcel bounding box review</strong>: Automatically determines whether the operator\&quot;s manual bounding box constitutes the &quot;minimum effective border rectangle&quot; for the parcel, identifying typical issues such as oversized or undersized bounding boxes.</li>
     * <li><strong>Foreign object interference detection</strong>: Automatically identifies whether non-target objects such as fingers, keyboards, or supporting tools are present in the scanning area.</li>
     * <li><strong>Multi-capture environment adaptation</strong>: A single API handles both white background board (blue frame) and green background board (blue frame + red frame) capture patterns without requiring the caller to distinguish between scenarios.</li>
     * <li><strong>Inbound quality inspection pipeline</strong>: Used for automated compliance review in the piece-weight-dimension stage of the logistics warehouse new product inbound SOP, as a replacement for or supplement to manual outsourced review.
     * The product is also applicable to general image &quot;frame-subject&quot; relationship review scenarios, such as product photography material review and document scanning quality verification.</li>
     * </ol>
     * <h2>Features</h2>
     * <ol>
     * <li><strong>Multi-scenario intelligent routing</strong>: The product has built-in scenario classification capabilities that automatically identify the background type (white/green) and bounding box type (none/single frame/double frame) in images, and route requests to the corresponding review sub-process. Callers only need to pass in the image URL without manually specifying the scenario.</li>
     * <li><strong>MLLM + dedicated CV model collaboration</strong>: Uses a multimodal large language model for semantic-level scene understanding and foreign object recognition, and uses dedicated parcel segmentation and IoU evaluation models for pixel-level bounding box fit quantification, ensuring accuracy while controlling inference latency and cost.</li>
     * <li><strong>Structured review conclusions</strong>: Output is unified as <code>result</code> (Boolean) + <code>info</code> (Chinese reason) structure. Supported reason types include &quot;Review passed&quot;, &quot;Review failed: bounding box too large&quot;, &quot;Review failed: bounding box too small&quot;, &quot;Review failed: foreign object detected&quot;, and others, enabling direct integration with downstream business systems.</li>
     * <li><strong>Supported input formats</strong>: Currently supports publicly accessible image URLs.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>An intelligent logistics parcel review product built on the collaboration of a multimodal large language model (MLLM) and dedicated vision algorithms, designed for automated compliance review in the &quot;piece-weight-dimension&quot; stage of e-commerce logistics. The product performs structured review across multiple dimensions including bounding box validity, bounding box fit accuracy, and foreign object interference for parcels on scanning platforms. It adapts to different hardware capture scenarios such as white and green background boards, and outputs Boolean review conclusions with Chinese reason descriptions that can directly interface with business systems. It is suitable for large-scale, high-concurrency inbound quality inspection pipelines.</p>
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
     * <h2>Product Introduction</h2>
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion\+ high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify the source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT large model translation accurately translates phrases, keywords, and trending words in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco large model translation supports long text translation and HTML format, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are short and may contain e-commerce-specific terms such as model numbers and parameters.</li>
     * <li>Customer service conversations: In customer service scenarios, the model optimizes issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Marco MT large model translation can also be used for general-purpose translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong> Marco MT large model translation supports translation between more than 100 languages and language detection for 23 languages. For specific language directions, refer to the language mapping table in Section 5.6.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong> Marco MT large model translation is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it offers faster translation inference speed and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong> Currently supports text and html text types.</li>
     * <li><strong>Translation intervention support</strong> Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
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
     * <td>Clearer and more precise product subject expression. The translation correctly identifies &quot;key bag&quot; rather than &quot;keychain&quot;, avoiding ambiguity about the product type</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify the source language, automatic detection is performed.</p>
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
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion\+ high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify the source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT large model translation accurately translates phrases, keywords, and trending words in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco large model translation supports long text translation and HTML format, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are short and may contain e-commerce-specific terms such as model numbers and parameters.</li>
     * <li>Customer service conversations: In customer service scenarios, the model optimizes issues such as missing context and typos, and supports polite expressions for certain language directions.
     * Marco MT large model translation can also be used for general-purpose translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language directions</strong> Marco MT large model translation supports translation between more than 100 languages and language detection for 23 languages. For specific language directions, refer to the language mapping table in Section 5.6.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong> Marco MT large model translation is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it offers faster translation inference speed and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong> Currently supports text and html text types.</li>
     * <li><strong>Translation intervention support</strong> Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and no translation (ABC-empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. If you need more, contact the platform for assistance.</li>
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
     * <td>Clearer and more precise product subject expression. The translation correctly identifies &quot;key bag&quot; rather than &quot;keychain&quot;, avoiding ambiguity about the product type</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 language directions. If you do not specify the source language, automatic detection is performed.</p>
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
     * <p><strong>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the product hotzone recognition service.</strong>
     * This API automatically identifies and locates specified products in a target scene image based on the provided target scene image and product reference images, and outputs the product name and normalized bounding box. Each request takes one target scene image and a set of product reference images. If the same case has multiple target images, call the operation separately for each target image.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Image URLs must use HTTPS and be accessible by the server.</li>
     * <li>Common image formats such as JPEG, PNG, and WebP are supported.</li>
     * <li>Each image should not exceed 2 MB.</li>
     * <li>When using signed URLs, set the validity period to at least 30 minutes.</li>
     * <li>If the same case has multiple target scene images, call the operation separately for each target image. The reference image list can be reused.</li>
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
     * <p><strong>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the product hotzone recognition service.</strong>
     * This API automatically identifies and locates specified products in a target scene image based on the provided target scene image and product reference images, and outputs the product name and normalized bounding box. Each request takes one target scene image and a set of product reference images. If the same case has multiple target images, call the operation separately for each target image.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Image URLs must use HTTPS and be accessible by the server.</li>
     * <li>Common image formats such as JPEG, PNG, and WebP are supported.</li>
     * <li>Each image should not exceed 2 MB.</li>
     * <li>When using signed URLs, set the validity period to at least 30 minutes.</li>
     * <li>If the same case has multiple target scene images, call the operation separately for each target image. The reference image list can be reused.</li>
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
     * <p>The API name on the POP gateway is QueryAsyncTaskResult.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an asynchronous task. The API name on the POP gateway is QueryAsyncTaskResult.</p>
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
     * <p>The API name on the POP gateway is QueryAsyncTaskResult.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an asynchronous task. The API name on the POP gateway is QueryAsyncTaskResult.</p>
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
     * <p>Detects whether an image contains a size chart. (Synchronous)</p>
     * <h1>2. Common scenarios</h1>
     * <p><strong>Batch processing scenario:</strong> Detect images containing size charts from a batch of images for further image translation or extraction. The size chart detection service helps reduce costs.</p>
     * <h1>3. Features</h1>
     * <p>The size chart detection service uses image recognition technology to automatically determine whether an input image contains size chart content. You provide an image URL, and the system returns a detection result (True/False) indicating whether the image is a size chart.
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
     * <p><strong>Batch processing scenario:</strong> Detect images containing size charts from a batch of images for further image translation or extraction. The size chart detection service helps reduce costs.</p>
     * <h1>3. Features</h1>
     * <p>The size chart detection service uses image recognition technology to automatically determine whether an input image contains size chart content. You provide an image URL, and the system returns a detection result (True/False) indicating whether the image is a size chart.
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
     * <p>Intelligently extracts structured information such as size charts and package weight/dimensions from images using a multimodal foundation model. (Asynchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p>Size chart: Extracts size charts from apparel category images into text.</p>
     * </li>
     * <li><p>Package weight/dimensions: Extracts package weight and dimension information from images.</p>
     * </li>
     * </ul>
     * <h2>Functions and features</h2>
     * <p>The size chart extraction service is based on a multimodal foundation model that automatically identifies size tables or package weight/dimension information in images and converts them into structured text output. You provide an image URL, and the system processes it as an asynchronous task, returning the extracted structured data. You can specify column names to recognize (such as Size, Bust, Length) through ColumnNameList for precise targeted extraction. You can also control the output language through the LanguageModel parameter, with options for Chinese (cn) or English (en). If not specified, the original language is preserved. This service is suitable for scenarios such as converting apparel size tables to text and batch structuring of product package weight/dimension information.
     * Core capabilities: Input an image URL and optional column name configuration, and output structured data of size charts or package weight/dimensions from the image. The API uses an asynchronous task mode (background: true). After submission, a task ID is returned, and you need to poll for the final result. This is suitable for processing complex images or high-volume call scenarios.</p>
     * <h2>Effect comparison</h2>
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
     * <p>Intelligently extracts structured information such as size charts and package weight/dimensions from images using a multimodal foundation model. (Asynchronous)</p>
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
     * <p>Intelligently extracts structured information such as size charts and package weight/dimensions from images using a multimodal foundation model. (Asynchronous)</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li><p>Size chart: Extracts size charts from apparel category images into text.</p>
     * </li>
     * <li><p>Package weight/dimensions: Extracts package weight and dimension information from images.</p>
     * </li>
     * </ul>
     * <h2>Functions and features</h2>
     * <p>The size chart extraction service is based on a multimodal foundation model that automatically identifies size tables or package weight/dimension information in images and converts them into structured text output. You provide an image URL, and the system processes it as an asynchronous task, returning the extracted structured data. You can specify column names to recognize (such as Size, Bust, Length) through ColumnNameList for precise targeted extraction. You can also control the output language through the LanguageModel parameter, with options for Chinese (cn) or English (en). If not specified, the original language is preserved. This service is suitable for scenarios such as converting apparel size tables to text and batch structuring of product package weight/dimension information.
     * Core capabilities: Input an image URL and optional column name configuration, and output structured data of size charts or package weight/dimensions from the image. The API uses an asynchronous task mode (background: true). After submission, a task ID is returned, and you need to poll for the final result. This is suitable for processing complex images or high-volume call scenarios.</p>
     * <h2>Effect comparison</h2>
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
     * <p>Intelligently extracts structured information such as size charts and package weight/dimensions from images using a multimodal foundation model. (Asynchronous)</p>
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
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 languages. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT can accurately translate phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco MT supports long text translation and HTML format, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are short and may contain e-commerce-specific terms such as model numbers and parameters.</li>
     * <li>Customer service conversations: In customer service scenarios, Marco MT can handle issues such as missing context and typos, and supports polite expressions for certain language pairs.
     * Marco MT can also be used for general translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language pairs</strong><br>Marco MT supports translation between more than 100 languages and language detection for 24 languages. For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong><br>Marco MT is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it offers faster translation inference speed and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong><br>Currently supports text and html format types.</li>
     * <li><strong>Translation intervention</strong><br>Supports custom translation results, including do-not-translate (ABC→ABC), specified translation (ABC→DEF), and skip translation (ABC→empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. Contact the platform for additional capacity.</li>
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
     * <td>Clearer product subject description — correctly identifies &quot;key bag&quot; rather than &quot;keychain,&quot; avoiding ambiguity about the product</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 languages. If you do not specify a source language, automatic detection is performed.</p>
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
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 languages. If you do not specify a source language, automatic detection is performed.</p>
     * <h2>Common scenarios</h2>
     * <ul>
     * <li>Product titles: Marco MT can accurately translate phrases, keywords, and trending terms in product titles into the target language, improving product visibility on e-commerce platforms.</li>
     * <li>Product descriptions: Product descriptions are typically long with diverse and complex formatting. Marco MT supports long text translation and HTML format, delivering excellent translation quality and format preservation.</li>
     * <li>Product attributes: Product attribute terms are short and may contain e-commerce-specific terms such as model numbers and parameters.</li>
     * <li>Customer service conversations: In customer service scenarios, Marco MT can handle issues such as missing context and typos, and supports polite expressions for certain language pairs.
     * Marco MT can also be used for general translation scenarios such as office work, meetings, and daily conversations.</li>
     * </ul>
     * <h2>Features</h2>
     * <ul>
     * <li><strong>Supported language pairs</strong><br>Marco MT supports translation between more than 100 languages and language detection for 24 languages. For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.</li>
     * <li><strong>Ultra-low hallucination rate and high-speed inference</strong><br>Marco MT is a large language model with preference alignment for translation scenarios. Compared with general-purpose large language models, it offers faster translation inference speed and an extremely low hallucination rate, making it especially suitable for large-scale invocation scenarios.</li>
     * <li><strong>Supported text format types</strong><br>Currently supports text and html format types.</li>
     * <li><strong>Translation intervention</strong><br>Supports custom translation results, including do-not-translate (ABC→ABC), specified translation (ABC→DEF), and skip translation (ABC→empty value). This is commonly used for brand name protection scenarios. Simply pass the corresponding intervention glossary ID when calling the API to meet your translation needs across different scenarios. You can upload up to 100,000 intervention terms. Contact the platform for additional capacity.</li>
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
     * <td>Clearer product subject description — correctly identifies &quot;key bag&quot; rather than &quot;keychain,&quot; avoiding ambiguity about the product</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Marco MT is an e-commerce translation model trained on over 1 billion high-quality bilingual sentence pairs, continuously optimized for e-commerce-specific terminology such as brands, models, materials, and attributes. It supports translation between more than 100 language pairs (including bridged translations), especially Chinese-English, Chinese-multilingual, and English-multilingual translations. It supports language detection for 24 languages. If you do not specify a source language, automatic detection is performed.</p>
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
     * <h1>Scenarios</h1>
     * <ul>
     * <li>Sellers/platforms batch-generate product short videos: Supports multiple video aspect ratios and sizes (3:4, 9:16), suitable for product detail page video slots, product homepage displays, information feed placements, short video content marketing, campaign material, and other scenarios.</li>
     * <li>New product launches with rapid initial video material generation: When merchants have a large number of new products to list, they only need to upload product images, product titles, and other basic information to quickly generate product showcase videos, model try-on videos, voiceover explanation videos, and other content, helping merchants rapidly complete material preparation during the launch phase.</li>
     * <li>High-fidelity apparel display: Generates model showcase videos based on product main images that closely resemble real commercial photography, with key optimizations for silhouette accuracy, fabric texture preservation, color fidelity, and consistent detail stability. Supports common e-commerce display methods such as garment try-on, turning, walking, close-up shots, and multi-angle switching.</li>
     * <li>High-quality commercial photography models: Includes 20+ built-in target audience model libraries covering plus-size women, plus-size men, swimwear, youthful style, smart casual commuter, young casual, business menswear, sports and fitness, and other body types, skin tones, and ethnicities. Supports multiple commercial photography presentation methods such as standing poses, side views, walking displays, and detail close-ups.</li>
     * <li>Standard product explanation and other high-frequency e-commerce scenarios: Suitable for standardized product categories such as skincare, cosmetics, personal care small appliances, food and beverages, household cleaning products, and 3C digital products. Quickly generates product explanation videos based on product main images, titles, selling point information, and explanation scripts.</li>
     * <li>Multi-product and multi-selling-point testing to improve placement efficiency: For information feed advertising, short video placement, and content marketing scenarios, quickly generates multiple versions of video materials, enabling businesses to cost-effectively validate the conversion performance of different selling points and presentation formats, improving placement ROI.</li>
     * </ul>
     * <h1>Features</h1>
     * <ul>
     * <li>Fully automated end-to-end batch generation with zero prompt threshold: Callers only need to provide product image URLs and titles. The system automatically completes the entire process from product understanding, storyboard planning, to video generation, without manual prompt writing, template selection, or repeated parameter tuning. Built-in multi-agent capabilities for product understanding, visual quality inspection, script planning, and directing/camera movement significantly lower the barrier to use.</li>
     * <li>Highly stable generation with low waste rate: Uses a deterministic generation process and multi-layer quality control mechanism to output usable materials with fewer retries, reducing invalid generation and resource waste, making overall production costs more controllable.</li>
     * <li>E-commerce-specific product fidelity: Built-in multi-round quality inspection agents lock product state throughout video generation (for example, zippers will not be unzipped, sleeves will not be lowered, prints will not disappear). Multi-layer defense through &quot;script rewriting + explicit constraint injection + failure-aware retry&quot; ensures product consistency.</li>
     * <li>Reference image priority + 6-axis consistency verification: Uses a Reference-Image-First generation paradigm with the original product image as the sole visual source of truth. Automatically performs 6-dimensional VL diagnostics (color drift, pattern loss, contour deviation, structural addition/removal, model matching, stain detection), fundamentally preventing generated images from deviating from the product.</li>
     * <li>Flexible storyboard arrangement and duration control: Supports adjustable video duration from 5–30 seconds. The agent autonomously plans independent storyboards to showcase the product in different scenarios. Also supports fixed-scene mode for in-depth product presentation under a unified visual style.</li>
     * <li>Cinematic camera movement capabilities: Built-in advanced camera movement modes including bullet time, Grammy-style slow motion, 360° orbital rotation, and full-body model rotation display, achieving deterministic output through segment-level precise control.</li>
     * <li>Model library and customization services: Built-in multi-type model resource library. Supports merchants in specifying fixed models, customizing exclusive model personas, and long-term brand visual identity binding to ensure brand visual consistency.</li>
     * <li>Adapted for high-frequency e-commerce content scenarios: Supports multiple resolutions such as 720P and 1080P and multiple aspect ratios such as 3:4 and 9:16, suitable for product detail page video slots, product homepage video displays, waterfall/information feed placements, campaign materials, and new product launch and promotional video generation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The E-commerce AI Video Generation Agent is designed for e-commerce merchants and platforms. Based on product main images, titles, selling points, and other information, it automatically generates 5–30 second product showcase short videos, helping customers efficiently produce and distribute e-commerce content. The product supports multiple resolution outputs such as 720P and 1080P, supports both quick single-product calls and multi-product batch generation, and accommodates both daily operations and large-scale product content production needs. Currently, it covers all apparel categories (tops, pants, skirts, suits, underwear, swimwear, etc.) and is gradually expanding to skincare, cosmetics, food and beverages, home appliances, and other core e-commerce categories.</p>
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
     * <li>Sellers/platforms batch-generate product short videos: Supports multiple video aspect ratios and sizes (3:4, 9:16), suitable for product detail page video slots, product homepage displays, information feed placements, short video content marketing, campaign material, and other scenarios.</li>
     * <li>New product launches with rapid initial video material generation: When merchants have a large number of new products to list, they only need to upload product images, product titles, and other basic information to quickly generate product showcase videos, model try-on videos, voiceover explanation videos, and other content, helping merchants rapidly complete material preparation during the launch phase.</li>
     * <li>High-fidelity apparel display: Generates model showcase videos based on product main images that closely resemble real commercial photography, with key optimizations for silhouette accuracy, fabric texture preservation, color fidelity, and consistent detail stability. Supports common e-commerce display methods such as garment try-on, turning, walking, close-up shots, and multi-angle switching.</li>
     * <li>High-quality commercial photography models: Includes 20+ built-in target audience model libraries covering plus-size women, plus-size men, swimwear, youthful style, smart casual commuter, young casual, business menswear, sports and fitness, and other body types, skin tones, and ethnicities. Supports multiple commercial photography presentation methods such as standing poses, side views, walking displays, and detail close-ups.</li>
     * <li>Standard product explanation and other high-frequency e-commerce scenarios: Suitable for standardized product categories such as skincare, cosmetics, personal care small appliances, food and beverages, household cleaning products, and 3C digital products. Quickly generates product explanation videos based on product main images, titles, selling point information, and explanation scripts.</li>
     * <li>Multi-product and multi-selling-point testing to improve placement efficiency: For information feed advertising, short video placement, and content marketing scenarios, quickly generates multiple versions of video materials, enabling businesses to cost-effectively validate the conversion performance of different selling points and presentation formats, improving placement ROI.</li>
     * </ul>
     * <h1>Features</h1>
     * <ul>
     * <li>Fully automated end-to-end batch generation with zero prompt threshold: Callers only need to provide product image URLs and titles. The system automatically completes the entire process from product understanding, storyboard planning, to video generation, without manual prompt writing, template selection, or repeated parameter tuning. Built-in multi-agent capabilities for product understanding, visual quality inspection, script planning, and directing/camera movement significantly lower the barrier to use.</li>
     * <li>Highly stable generation with low waste rate: Uses a deterministic generation process and multi-layer quality control mechanism to output usable materials with fewer retries, reducing invalid generation and resource waste, making overall production costs more controllable.</li>
     * <li>E-commerce-specific product fidelity: Built-in multi-round quality inspection agents lock product state throughout video generation (for example, zippers will not be unzipped, sleeves will not be lowered, prints will not disappear). Multi-layer defense through &quot;script rewriting + explicit constraint injection + failure-aware retry&quot; ensures product consistency.</li>
     * <li>Reference image priority + 6-axis consistency verification: Uses a Reference-Image-First generation paradigm with the original product image as the sole visual source of truth. Automatically performs 6-dimensional VL diagnostics (color drift, pattern loss, contour deviation, structural addition/removal, model matching, stain detection), fundamentally preventing generated images from deviating from the product.</li>
     * <li>Flexible storyboard arrangement and duration control: Supports adjustable video duration from 5–30 seconds. The agent autonomously plans independent storyboards to showcase the product in different scenarios. Also supports fixed-scene mode for in-depth product presentation under a unified visual style.</li>
     * <li>Cinematic camera movement capabilities: Built-in advanced camera movement modes including bullet time, Grammy-style slow motion, 360° orbital rotation, and full-body model rotation display, achieving deterministic output through segment-level precise control.</li>
     * <li>Model library and customization services: Built-in multi-type model resource library. Supports merchants in specifying fixed models, customizing exclusive model personas, and long-term brand visual identity binding to ensure brand visual consistency.</li>
     * <li>Adapted for high-frequency e-commerce content scenarios: Supports multiple resolutions such as 720P and 1080P and multiple aspect ratios such as 3:4 and 9:16, suitable for product detail page video slots, product homepage video displays, waterfall/information feed placements, campaign materials, and new product launch and promotional video generation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The E-commerce AI Video Generation Agent is designed for e-commerce merchants and platforms. Based on product main images, titles, selling points, and other information, it automatically generates 5–30 second product showcase short videos, helping customers efficiently produce and distribute e-commerce content. The product supports multiple resolution outputs such as 720P and 1080P, supports both quick single-product calls and multi-product batch generation, and accommodates both daily operations and large-scale product content production needs. Currently, it covers all apparel categories (tops, pants, skirts, suits, underwear, swimwear, etc.) and is gradually expanding to skincare, cosmetics, food and beverages, home appliances, and other core e-commerce categories.</p>
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
     * <h2>1. Product Introduction</h2>
     * <p>The Video Translation API translates embedded text (subtitles, promotional text, etc.) in video frames into a target language and erases the original text. This API is applicable to scenarios such as multilingual distribution of e-commerce videos, international social media marketing, and global brand advertising.
     * The API uses an asynchronous call mode: after submitting a translation task, you receive a <code>task_id</code>, then poll the query endpoint for the task status until the task is completed and results are available.</p>
     * <h2>2. Common scenarios</h2>
     * <ul>
     * <li><p><strong>Cross-border e-commerce video localization</strong>: Translates promotional text in product introduction videos into the target market language to facilitate overseas platform promotion.</p>
     * </li>
     * <li><p><strong>International social media marketing</strong>: Localizes text content in video frames with one click for platforms such as TikTok, Instagram, and YouTube, improving comprehension and conversion rates among overseas users.</p>
     * </li>
     * <li><p><strong>Global brand advertising</strong>: Automatically generates video versions in the language of the target region, reducing manual production costs.</p>
     * </li>
     * <li><p><strong>Training and product documentation</strong>: Translates on-screen text in training courses or product demonstration videos into multiple languages for use by global teams.</p>
     * </li>
     * </ul>
     * <h2>3. Features</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>Capability</th>
     * <th>Identifier</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Visual translation</td>
     * <td><code>visual</code></td>
     * <td>Translates embedded text (subtitles, promotional text, etc.) in video frames into the target language and erases the original text</td>
     * </tr>
     * </tbody></table>
     * <h2>4. Developer guide.</h2>
     * <h3>4.1 Submit a translation task.</h3>
     * <h4>Request</h4>
     * <p><code>POST /api/v1/video/translation</code></p>
     * 
     * <b>summary</b> : 
     * <p>Translates embedded text (subtitles, promotional text, etc.) in video frames into a target language and erases the original text.</p>
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

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capabilitiesShrink)) {
            body.put("Capabilities", request.capabilitiesShrink);
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
     * <h2>1. Product Introduction</h2>
     * <p>The Video Translation API translates embedded text (subtitles, promotional text, etc.) in video frames into a target language and erases the original text. This API is applicable to scenarios such as multilingual distribution of e-commerce videos, international social media marketing, and global brand advertising.
     * The API uses an asynchronous call mode: after submitting a translation task, you receive a <code>task_id</code>, then poll the query endpoint for the task status until the task is completed and results are available.</p>
     * <h2>2. Common scenarios</h2>
     * <ul>
     * <li><p><strong>Cross-border e-commerce video localization</strong>: Translates promotional text in product introduction videos into the target market language to facilitate overseas platform promotion.</p>
     * </li>
     * <li><p><strong>International social media marketing</strong>: Localizes text content in video frames with one click for platforms such as TikTok, Instagram, and YouTube, improving comprehension and conversion rates among overseas users.</p>
     * </li>
     * <li><p><strong>Global brand advertising</strong>: Automatically generates video versions in the language of the target region, reducing manual production costs.</p>
     * </li>
     * <li><p><strong>Training and product documentation</strong>: Translates on-screen text in training courses or product demonstration videos into multiple languages for use by global teams.</p>
     * </li>
     * </ul>
     * <h2>3. Features</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>Capability</th>
     * <th>Identifier</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Visual translation</td>
     * <td><code>visual</code></td>
     * <td>Translates embedded text (subtitles, promotional text, etc.) in video frames into the target language and erases the original text</td>
     * </tr>
     * </tbody></table>
     * <h2>4. Developer guide.</h2>
     * <h3>4.1 Submit a translation task.</h3>
     * <h4>Request</h4>
     * <p><code>POST /api/v1/video/translation</code></p>
     * 
     * <b>summary</b> : 
     * <p>Translates embedded text (subtitles, promotional text, etc.) in video frames into a target language and erases the original text.</p>
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
     * <h1>1. Product Introduction</h1>
     * <p>A one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Users upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous)</p>
     * <h1>2. Applicable scenarios</h1>
     * <p>Applicable to batch optimization of product images in cross-platform listing scenarios. Adapts source product images into main images, SKU images, and detail images required by listing platforms. Supported capabilities include:</p>
     * <ul>
     * <li><p>Detecting low-quality images that contain text, watermarks, logos, or ad patches, allowing users to filter images that need processing</p>
     * </li>
     * <li><p>Removing non-compliant elements such as watermarks, logos, ad patches, and Chinese text from original images</p>
     * </li>
     * <li><p>Removing the background around the product subject edges</p>
     * </li>
     * <li><p>Translating text within images into other languages</p>
     * </li>
     * <li><p>Expanding images to other dimensions (by ratio, size, etc.) with automatic background fill</p>
     * </li>
     * <li><p>Cropping images to specified dimensions</p>
     * </li>
     * <li><p>Upscaling image pixels by a specified factor</p>
     * </li>
     * </ul>
     * <h1>3. Feature overview</h1>
     * <p>Users provide a product image URL and select the desired AI capability combination through the Ability parameter (1=Intelligent Element Detection, 2=Intelligent Matting, 3=Intelligent Removal, 4=Image Translation Pro, 5=Image Expansion, 6=Intelligent Cropping, 7=HD Upscaling). The system executes the selected capabilities sequentially in a preset order. Because Intelligent Element Detection helps users determine whether an image contains certain specified elements, and the presence of elements affects subsequent AI capability selection, an additional input is provided that allows users to choose whether to filter images out of or retain images in the subsequent AI processing pipeline.
     * <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/bddb522a-0795-4b5c-b25d-10e933426367.svg" alt="ai-pipeline-flowchart.svg">
     * Each AI capability is described as follows:</p>
     * <ol>
     * <li><p><strong>Intelligent Element Detection:</strong> An element detection capability designed specifically for e-commerce images. Detects text, logos, watermarks, and text-bearing color blocks in both the image subject and background, and returns Boolean detection results. Supports filtering images based on detection results (for example, processing only images with watermarks). Works in conjunction with subsequent capabilities — first identifies the types of elements that need optimization, then precisely executes removal and other operations.</p>
     * </li>
     * <li><p><strong>Intelligent Matting:</strong> Automatically identifies the product subject in an image and precisely separates it from the background. Based on deep learning models, supports accurate segmentation of complex edges such as hair strands and transparent objects. Outputs images with transparent or white backgrounds, supports custom background colors and target size cropping, and directly generates product display images that comply with e-commerce platform specifications.</p>
     * </li>
     * <li><p><strong>Intelligent Removal:</strong> Automatically identifies and removes non-compliant elements from e-commerce images, including text, specific names (brand/store names), transparent text blocks, and ad patches. Supports specifying removal of elements in the subject area or non-subject area separately, and also supports precise removal area specification through the Mask parameter for efficient batch compliance cleanup.</p>
     * </li>
     * <li><p><strong>Image Translation Pro:</strong> Leverages multimodal large model technology to translate text in images into the target language and render it directly at the corresponding position in the original image. Supports over 100 language pairs. Provides product subject text protection, brand name protection, and translation intervention glossaries to prevent mistranslation of embedded product information. After translation, returns layout information such as text position, font, and color to support secondary editing.</p>
     * </li>
     * <li><p><strong>Intelligent Image Expansion:</strong> Expands the image canvas using AI generation technology to broaden the image field of view without cropping the subject. Supports multiple expansion methods: by aspect ratio (1:1, 3:4, 4:3, 9:16, 16:9), by horizontal/vertical scaling ratio (1.0–3.0×), and by pixel offset in up/down/left/right directions. AI automatically fills in naturally transitioning background content.</p>
     * </li>
     * <li><p><strong>Intelligent Cropping:</strong> Intelligently crops images to specified dimensions, automatically identifies the image subject area, and precisely preserves core content. Supports custom output width and height (100–5000 pixels) to meet the image dimension requirements of different e-commerce platforms and ad placements, ensuring the subject remains prominent and the composition stays balanced after cropping.</p>
     * </li>
     * <li><p><strong>HD Upscaling:</strong> Enhances details and reduces noise while upscaling images, supporting 2–4× magnification. Suitable for improving the clarity of low-resolution product images and optimizing visual presentation. Supports output in PNG, JPG, BMP, and other formats.</p>
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
     * <li><p>HD upscaling | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/95d29e79-8622-45fb-b284-cd580fe40ea0.jpeg" alt="R2.jpeg"> |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Users upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous)</p>
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
     * <p>A one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Users upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous)</p>
     * <h1>2. Applicable scenarios</h1>
     * <p>Applicable to batch optimization of product images in cross-platform listing scenarios. Adapts source product images into main images, SKU images, and detail images required by listing platforms. Supported capabilities include:</p>
     * <ul>
     * <li><p>Detecting low-quality images that contain text, watermarks, logos, or ad patches, allowing users to filter images that need processing</p>
     * </li>
     * <li><p>Removing non-compliant elements such as watermarks, logos, ad patches, and Chinese text from original images</p>
     * </li>
     * <li><p>Removing the background around the product subject edges</p>
     * </li>
     * <li><p>Translating text within images into other languages</p>
     * </li>
     * <li><p>Expanding images to other dimensions (by ratio, size, etc.) with automatic background fill</p>
     * </li>
     * <li><p>Cropping images to specified dimensions</p>
     * </li>
     * <li><p>Upscaling image pixels by a specified factor</p>
     * </li>
     * </ul>
     * <h1>3. Feature overview</h1>
     * <p>Users provide a product image URL and select the desired AI capability combination through the Ability parameter (1=Intelligent Element Detection, 2=Intelligent Matting, 3=Intelligent Removal, 4=Image Translation Pro, 5=Image Expansion, 6=Intelligent Cropping, 7=HD Upscaling). The system executes the selected capabilities sequentially in a preset order. Because Intelligent Element Detection helps users determine whether an image contains certain specified elements, and the presence of elements affects subsequent AI capability selection, an additional input is provided that allows users to choose whether to filter images out of or retain images in the subsequent AI processing pipeline.
     * <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/bddb522a-0795-4b5c-b25d-10e933426367.svg" alt="ai-pipeline-flowchart.svg">
     * Each AI capability is described as follows:</p>
     * <ol>
     * <li><p><strong>Intelligent Element Detection:</strong> An element detection capability designed specifically for e-commerce images. Detects text, logos, watermarks, and text-bearing color blocks in both the image subject and background, and returns Boolean detection results. Supports filtering images based on detection results (for example, processing only images with watermarks). Works in conjunction with subsequent capabilities — first identifies the types of elements that need optimization, then precisely executes removal and other operations.</p>
     * </li>
     * <li><p><strong>Intelligent Matting:</strong> Automatically identifies the product subject in an image and precisely separates it from the background. Based on deep learning models, supports accurate segmentation of complex edges such as hair strands and transparent objects. Outputs images with transparent or white backgrounds, supports custom background colors and target size cropping, and directly generates product display images that comply with e-commerce platform specifications.</p>
     * </li>
     * <li><p><strong>Intelligent Removal:</strong> Automatically identifies and removes non-compliant elements from e-commerce images, including text, specific names (brand/store names), transparent text blocks, and ad patches. Supports specifying removal of elements in the subject area or non-subject area separately, and also supports precise removal area specification through the Mask parameter for efficient batch compliance cleanup.</p>
     * </li>
     * <li><p><strong>Image Translation Pro:</strong> Leverages multimodal large model technology to translate text in images into the target language and render it directly at the corresponding position in the original image. Supports over 100 language pairs. Provides product subject text protection, brand name protection, and translation intervention glossaries to prevent mistranslation of embedded product information. After translation, returns layout information such as text position, font, and color to support secondary editing.</p>
     * </li>
     * <li><p><strong>Intelligent Image Expansion:</strong> Expands the image canvas using AI generation technology to broaden the image field of view without cropping the subject. Supports multiple expansion methods: by aspect ratio (1:1, 3:4, 4:3, 9:16, 16:9), by horizontal/vertical scaling ratio (1.0–3.0×), and by pixel offset in up/down/left/right directions. AI automatically fills in naturally transitioning background content.</p>
     * </li>
     * <li><p><strong>Intelligent Cropping:</strong> Intelligently crops images to specified dimensions, automatically identifies the image subject area, and precisely preserves core content. Supports custom output width and height (100–5000 pixels) to meet the image dimension requirements of different e-commerce platforms and ad placements, ensuring the subject remains prominent and the composition stays balanced after cropping.</p>
     * </li>
     * <li><p><strong>HD Upscaling:</strong> Enhances details and reduces noise while upscaling images, supporting 2–4× magnification. Suitable for improving the clarity of low-resolution product images and optimizing visual presentation. Supports output in PNG, JPG, BMP, and other formats.</p>
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
     * <li><p>HD upscaling | <img src="https://alidocs.oss-cn-zhangjiakou.aliyuncs.com/res/NpQlK5jRe9w5jqDv/img/95d29e79-8622-45fb-b284-cd580fe40ea0.jpeg" alt="R2.jpeg"> |</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a one-stop AI-powered image processing service for e-commerce sellers. Orchestrates seven atomic capabilities — element detection, intelligent matting, intelligent removal, Image Translation Pro, image expansion, intelligent cropping, and HD upscaling — into an image processing workflow. Users upload an image once, select the desired capabilities, and complete multiple image optimizations sequentially in a single call to produce product images that meet listing platform requirements. (Asynchronous)</p>
     * 
     * @param request VisionFlowRequest
     * @return VisionFlowResponse
     */
    public VisionFlowResponse visionFlow(VisionFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.visionFlowWithOptions(request, runtime);
    }
}
