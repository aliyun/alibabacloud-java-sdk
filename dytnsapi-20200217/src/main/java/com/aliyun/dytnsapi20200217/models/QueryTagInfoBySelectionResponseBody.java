// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagInfoBySelectionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryTagInfoBySelectionResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
         * <p>英文名</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>中文名</p>
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
         * <p>参数英文名</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>输入提示</p>
         */
        @NameInMap("Hint")
        public String hint;

        /**
         * <p>是否必填</p>
         */
        @NameInMap("Must")
        public Boolean must;

        /**
         * <p>参数中文名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>类型EnumUIWidgetTypes对应的code</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>枚举值定义，code:desc</p>
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
         * <p>可用的授权码列表</p>
         */
        @NameInMap("AuthCodeList")
        public java.util.List<String> authCodeList;

        /**
         * <p>API demo链接</p>
         */
        @NameInMap("DemoAddress")
        public String demoAddress;

        /**
         * <p>API文档链接</p>
         */
        @NameInMap("DocAddress")
        public String docAddress;

        /**
         * <p>枚举值定义链接</p>
         */
        @NameInMap("EnumDefinitionAddress")
        public String enumDefinitionAddress;

        /**
         * <p>流程名称</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>行业id</p>
         */
        @NameInMap("IndustryId")
        public Long industryId;

        /**
         * <p>行业名称</p>
         */
        @NameInMap("IndustryName")
        public String industryName;

        /**
         * <p>标签参数列表</p>
         */
        @NameInMap("ParamList")
        public java.util.List<QueryTagInfoBySelectionResponseBodyDataParamList> paramList;

        /**
         * <p>场景id</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>场景名称</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>标签id</p>
         */
        @NameInMap("TagId")
        public Long tagId;

        /**
         * <p>标签名称</p>
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
