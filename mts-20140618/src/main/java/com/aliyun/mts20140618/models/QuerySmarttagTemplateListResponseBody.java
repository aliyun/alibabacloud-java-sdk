// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagTemplateListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5210DBB0-E327-4D45-ADBC-0B83C8796E26</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The templates.</p>
     */
    @NameInMap("Templates")
    public QuerySmarttagTemplateListResponseBodyTemplates templates;

    public static QuerySmarttagTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagTemplateListResponseBody self = new QuerySmarttagTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmarttagTemplateListResponseBody setTemplates(QuerySmarttagTemplateListResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public QuerySmarttagTemplateListResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public static class QuerySmarttagTemplateListResponseBodyTemplatesTemplate extends TeaModel {
        /**
         * <p>The analysis types that are used in the template. One or more values are returned. Valid values:</p>
         * <ul>
         * <li><strong>ocr</strong>: text recognition</li>
         * <li><strong>asr</strong>: speech recognition</li>
         * <li><strong>classification</strong>: video classification</li>
         * <li><strong>shows</strong>: program recognition</li>
         * <li><strong>face</strong>: facial recognition</li>
         * <li><strong>role</strong>: figure recognition</li>
         * <li><strong>object</strong>: object recognition</li>
         * <li><strong>tvstation</strong>: logo recognition</li>
         * <li><strong>action</strong>: action recognition</li>
         * <li><strong>emotion</strong>: facial expression recognition</li>
         * <li><strong>landmark</strong>: landmark recognition</li>
         * <li><strong>scene</strong>: scene recognition</li>
         * <li><strong>movieip</strong>: movie intellectual property recognition</li>
         * <li><strong>subtitle</strong>: subtitle extraction</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ocr,asr,classification,shows,face,role,object,tvstation,action,emotion,landmark,scene</p>
         */
        @NameInMap("AnalyseTypes")
        public String analyseTypes;

        /**
         * <p>The IDs of the system facial image libraries that are used in the template. One or more values are returned. Valid values:</p>
         * <ul>
         * <li>celebrity: the facial image library of celebrities</li>
         * <li>politician: the facial image library of politicians</li>
         * <li>sensitive: the facial image library of sensitive figures</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>politician,sensitive,celebrity</p>
         */
        @NameInMap("FaceCategoryIds")
        public String faceCategoryIds;

        /**
         * <p>The configurations of face-related algorithms. The value of this parameter is a JSON string and consists of the thresholds set for face detection and facial recognition. Valid values:</p>
         * <ul>
         * <li><strong>faceDetThreshold</strong>: The default threshold for face detection is 0.999. The threshold takes effect only for the faces that are strange to the system.</li>
         * <li><strong>faceRegThreshold</strong>: The default threshold for facial recognition is 0.9.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;faceDetThreshold&quot;:0.999, &quot;faceRegThreshold&quot;:0.9 }</p>
         */
        @NameInMap("FaceCustomParamsConfig")
        public String faceCustomParamsConfig;

        /**
         * <p>The industry to which the template applies. Default value: <strong>common</strong>. Valid values:</p>
         * <ul>
         * <li><strong>microVideo</strong>: short video industry</li>
         * <li><strong>common</strong>: general industries</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Indicates whether the template is the default template. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The template is the default template.</li>
         * <li><strong>false</strong>: The template is not the default template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The configuration of keyword tags. The type field specifies the category of a keyword tag. You can specify one or more values and separate the values with commas (,). Valid values:</p>
         * <ul>
         * <li>name</li>
         * <li>location</li>
         * <li>organization</li>
         * <li>other</li>
         * </ul>
         * <blockquote>
         * <p>Keyword tags of all the categories are returned in one of the following scenarios: The KeywordConfig parameter is not specified or the Keyword field is invalid because it is not a JSON string, or the KeywordConfig parameter does not contain the type field or the type field is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;type&quot;: &quot;name,location,organization,other&quot; }</p>
         */
        @NameInMap("KeywordConfig")
        public String keywordConfig;

        /**
         * <p>The fields to be identified as knowledge graph information when tags are returned in Smart tagging V2.0 and Smart tagging V2.0-custom modes. For more information, see <a href="https://help.aliyun.com/document_detail/356383.html">Knowledge graph fields in smart tagging jobs</a>. If this parameter is not specified or the specified value is NULL or invalid because it is not a JSON string, the following fields are returned:</p>
         * <ul>
         * <li><p>movie-related fields:</p>
         * <ul>
         * <li>name: the name of the intellectual property that is featured in the movie</li>
         * <li>alias: the alias of the intellectual property that is featured in the movie</li>
         * <li>chnl: the category of the movie</li>
         * <li>genre: the genre of the movie</li>
         * <li>country: the country or region in which the movie was produced</li>
         * <li>language: the language of the movie</li>
         * <li>releaseYear: the year when the movie was released</li>
         * </ul>
         * </li>
         * <li><p>music-related fields:</p>
         * <ul>
         * <li>songName: the name of the song</li>
         * <li>artistName: the name of the singer</li>
         * <li>artistArea: the region to which the singer belongs, such as China, Japan, Korea, Europe, and America, or others.</li>
         * <li>albumName: the name of the album</li>
         * </ul>
         * </li>
         * <li><p>person-related fields:</p>
         * <ul>
         * <li>name: the name of the person</li>
         * <li>gender: the gender of the person</li>
         * <li>citizenship: the nationality of the person</li>
         * <li>occupation: the occupation of the person</li>
         * <li>classification: the type into which the person is classified</li>
         * <li>nationality: the ethnic group of the person</li>
         * <li>birthPlace: the place where the person was born</li>
         * <li>birthDate: the date when the person was born</li>
         * </ul>
         * </li>
         * <li><p>landmark-related fields:</p>
         * <ul>
         * <li>name: the display name of the landmark</li>
         * <li>nameEn: the English name of the landmark</li>
         * <li>Description: the description of the parameter</li>
         * <li>address: the address of the landmark</li>
         * </ul>
         * </li>
         * <li><p>item-related fields:</p>
         * <ul>
         * <li>brandName: the brand of the item</li>
         * <li>finegrainName: the fine-grained description of the item</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;movie&quot;:&quot;name,alias,chnl,genre&quot;, &quot;music&quot;:&quot;songName,artistName&quot;, &quot;person&quot;:&quot;name,gender&quot; }</p>
         */
        @NameInMap("KnowledgeConfig")
        public String knowledgeConfig;

        /**
         * <p>The type of the tagging. Default value: <strong>auto</strong>. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: machine tagging</li>
         * <li><strong>hmi</strong>: tagging by human and machine</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hmi</p>
         */
        @NameInMap("LabelType")
        public String labelType;

        /**
         * <p>The version of the smart tagging feature. Default value: 1.0. Valid values:</p>
         * <ul>
         * <li>1.0: Smart tagging V1.0</li>
         * <li>2.0: Smart tagging V2.0 (CPV tagging)</li>
         * <li>2.0-custom: Smart tagging V2.0-custom (CPV tagging by using custom models)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("LabelVersion")
        public String labelVersion;

        /**
         * <p>The IDs of the landmark libraries that are used in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("LandmarkGroupIds")
        public String landmarkGroupIds;

        /**
         * <p>The IDs of the object libraries that are used in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>general,item,weapon,animal</p>
         */
        @NameInMap("ObjectGroupIds")
        public String objectGroupIds;

        /**
         * <p>The scenario in which the template is used. Valid values:</p>
         * <ul>
         * <li><strong>search</strong>: search scenarios</li>
         * <li><strong>recommend</strong>: recommendation scenarios</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>search</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>05de22f255284c7a8d2aab535dde****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>example-****</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static QuerySmarttagTemplateListResponseBodyTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagTemplateListResponseBodyTemplatesTemplate self = new QuerySmarttagTemplateListResponseBodyTemplatesTemplate();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setAnalyseTypes(String analyseTypes) {
            this.analyseTypes = analyseTypes;
            return this;
        }
        public String getAnalyseTypes() {
            return this.analyseTypes;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setFaceCategoryIds(String faceCategoryIds) {
            this.faceCategoryIds = faceCategoryIds;
            return this;
        }
        public String getFaceCategoryIds() {
            return this.faceCategoryIds;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setFaceCustomParamsConfig(String faceCustomParamsConfig) {
            this.faceCustomParamsConfig = faceCustomParamsConfig;
            return this;
        }
        public String getFaceCustomParamsConfig() {
            return this.faceCustomParamsConfig;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setKeywordConfig(String keywordConfig) {
            this.keywordConfig = keywordConfig;
            return this;
        }
        public String getKeywordConfig() {
            return this.keywordConfig;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setKnowledgeConfig(String knowledgeConfig) {
            this.knowledgeConfig = knowledgeConfig;
            return this;
        }
        public String getKnowledgeConfig() {
            return this.knowledgeConfig;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setLabelVersion(String labelVersion) {
            this.labelVersion = labelVersion;
            return this;
        }
        public String getLabelVersion() {
            return this.labelVersion;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setLandmarkGroupIds(String landmarkGroupIds) {
            this.landmarkGroupIds = landmarkGroupIds;
            return this;
        }
        public String getLandmarkGroupIds() {
            return this.landmarkGroupIds;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setObjectGroupIds(String objectGroupIds) {
            this.objectGroupIds = objectGroupIds;
            return this;
        }
        public String getObjectGroupIds() {
            return this.objectGroupIds;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class QuerySmarttagTemplateListResponseBodyTemplates extends TeaModel {
        @NameInMap("Template")
        public java.util.List<QuerySmarttagTemplateListResponseBodyTemplatesTemplate> template;

        public static QuerySmarttagTemplateListResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagTemplateListResponseBodyTemplates self = new QuerySmarttagTemplateListResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagTemplateListResponseBodyTemplates setTemplate(java.util.List<QuerySmarttagTemplateListResponseBodyTemplatesTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<QuerySmarttagTemplateListResponseBodyTemplatesTemplate> getTemplate() {
            return this.template;
        }

    }

}
