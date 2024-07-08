// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagInfoBySelectionResponseBody extends TeaModel {
    /**
     * <p>The response code. <strong>OK</strong> indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryTagInfoBySelectionResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C3B8084-3A7D-570B-BC84-BF945A9CF65E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTagInfoBySelectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagInfoBySelectionResponseBody self = new QueryTagInfoBySelectionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagInfoBySelectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTagInfoBySelectionResponseBody setData(java.util.List<QueryTagInfoBySelectionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTagInfoBySelectionResponseBodyData> getData() {
        return this.data;
    }

    public QueryTagInfoBySelectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTagInfoBySelectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagInfoBySelectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTagInfoBySelectionResponseBodyDataParamListValueDict extends TeaModel {
        /**
         * <p>The English name.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The Chinese name.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        @NameInMap("Desc")
        public String desc;

        public static QueryTagInfoBySelectionResponseBodyDataParamListValueDict build(java.util.Map<String, ?> map) throws Exception {
            QueryTagInfoBySelectionResponseBodyDataParamListValueDict self = new QueryTagInfoBySelectionResponseBodyDataParamListValueDict();
            return TeaModel.build(map, self);
        }

        public QueryTagInfoBySelectionResponseBodyDataParamListValueDict setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryTagInfoBySelectionResponseBodyDataParamListValueDict setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class QueryTagInfoBySelectionResponseBodyDataParamList extends TeaModel {
        /**
         * <p>The English name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>preame</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The input hint.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Hint")
        public String hint;

        /**
         * <p>Indicates whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Must")
        public Boolean must;

        /**
         * <p>The Chinese name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type. The code that corresponds to EnumUIWidgetTypes.</p>
         * 
         * <strong>example:</strong>
         * <p>aqzx</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The definitions of the enumerated values such as Code or Desc.</p>
         */
        @NameInMap("ValueDict")
        public java.util.List<QueryTagInfoBySelectionResponseBodyDataParamListValueDict> valueDict;

        public static QueryTagInfoBySelectionResponseBodyDataParamList build(java.util.Map<String, ?> map) throws Exception {
            QueryTagInfoBySelectionResponseBodyDataParamList self = new QueryTagInfoBySelectionResponseBodyDataParamList();
            return TeaModel.build(map, self);
        }

        public QueryTagInfoBySelectionResponseBodyDataParamList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryTagInfoBySelectionResponseBodyDataParamList setHint(String hint) {
            this.hint = hint;
            return this;
        }
        public String getHint() {
            return this.hint;
        }

        public QueryTagInfoBySelectionResponseBodyDataParamList setMust(Boolean must) {
            this.must = must;
            return this;
        }
        public Boolean getMust() {
            return this.must;
        }

        public QueryTagInfoBySelectionResponseBodyDataParamList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTagInfoBySelectionResponseBodyDataParamList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTagInfoBySelectionResponseBodyDataParamList setValueDict(java.util.List<QueryTagInfoBySelectionResponseBodyDataParamListValueDict> valueDict) {
            this.valueDict = valueDict;
            return this;
        }
        public java.util.List<QueryTagInfoBySelectionResponseBodyDataParamListValueDict> getValueDict() {
            return this.valueDict;
        }

    }

    public static class QueryTagInfoBySelectionResponseBodyData extends TeaModel {
        /**
         * <p>The list of available authorization codes.</p>
         */
        @NameInMap("AuthCodeList")
        public java.util.List<String> authCodeList;

        @NameInMap("ComplexityType")
        public String complexityType;

        /**
         * <p>The URL for the API demo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz">https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz</a></p>
         */
        @NameInMap("DemoAddress")
        public String demoAddress;

        /**
         * <p>The URL for the API documentation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz">https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz</a></p>
         */
        @NameInMap("DocAddress")
        public String docAddress;

        /**
         * <p>The URL for the definitions of the enumerated values.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("EnumDefinitionAddress")
        public String enumDefinitionAddress;

        /**
         * <p>The flow name.</p>
         * 
         * <strong>example:</strong>
         * <p>process name</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>The industry ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        @NameInMap("IndustryId")
        public Long industryId;

        /**
         * <p>The industry name.</p>
         * 
         * <strong>example:</strong>
         * <p>logistics</p>
         */
        @NameInMap("IndustryName")
        public String industryName;

        /**
         * <p>The list of tag parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<QueryTagInfoBySelectionResponseBodyDataParamList> paramList;

        @NameInMap("RichTextDescription")
        public String richTextDescription;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>The scene name.</p>
         * 
         * <strong>example:</strong>
         * <p>General scenario</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("TagId")
        public Long tagId;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Number ownership</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static QueryTagInfoBySelectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTagInfoBySelectionResponseBodyData self = new QueryTagInfoBySelectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTagInfoBySelectionResponseBodyData setAuthCodeList(java.util.List<String> authCodeList) {
            this.authCodeList = authCodeList;
            return this;
        }
        public java.util.List<String> getAuthCodeList() {
            return this.authCodeList;
        }

        public QueryTagInfoBySelectionResponseBodyData setComplexityType(String complexityType) {
            this.complexityType = complexityType;
            return this;
        }
        public String getComplexityType() {
            return this.complexityType;
        }

        public QueryTagInfoBySelectionResponseBodyData setDemoAddress(String demoAddress) {
            this.demoAddress = demoAddress;
            return this;
        }
        public String getDemoAddress() {
            return this.demoAddress;
        }

        public QueryTagInfoBySelectionResponseBodyData setDocAddress(String docAddress) {
            this.docAddress = docAddress;
            return this;
        }
        public String getDocAddress() {
            return this.docAddress;
        }

        public QueryTagInfoBySelectionResponseBodyData setEnumDefinitionAddress(String enumDefinitionAddress) {
            this.enumDefinitionAddress = enumDefinitionAddress;
            return this;
        }
        public String getEnumDefinitionAddress() {
            return this.enumDefinitionAddress;
        }

        public QueryTagInfoBySelectionResponseBodyData setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public QueryTagInfoBySelectionResponseBodyData setIndustryId(Long industryId) {
            this.industryId = industryId;
            return this;
        }
        public Long getIndustryId() {
            return this.industryId;
        }

        public QueryTagInfoBySelectionResponseBodyData setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public QueryTagInfoBySelectionResponseBodyData setParamList(java.util.List<QueryTagInfoBySelectionResponseBodyDataParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<QueryTagInfoBySelectionResponseBodyDataParamList> getParamList() {
            return this.paramList;
        }

        public QueryTagInfoBySelectionResponseBodyData setRichTextDescription(String richTextDescription) {
            this.richTextDescription = richTextDescription;
            return this;
        }
        public String getRichTextDescription() {
            return this.richTextDescription;
        }

        public QueryTagInfoBySelectionResponseBodyData setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public QueryTagInfoBySelectionResponseBodyData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryTagInfoBySelectionResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public QueryTagInfoBySelectionResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
