// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetFoundationVersionResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetFoundationVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationVersionResponseBody self = new GetFoundationVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoundationVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFoundationVersionResponseBody setData(GetFoundationVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFoundationVersionResponseBodyData getData() {
        return this.data;
    }

    public GetFoundationVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetFoundationVersionResponseBodyDataSiteSurveyTool extends TeaModel {
        @NameInMap("clusterCheckerURL")
        public String clusterCheckerURL;

        @NameInMap("clusterInfoBrief")
        public String clusterInfoBrief;

        public static GetFoundationVersionResponseBodyDataSiteSurveyTool build(java.util.Map<String, ?> map) throws Exception {
            GetFoundationVersionResponseBodyDataSiteSurveyTool self = new GetFoundationVersionResponseBodyDataSiteSurveyTool();
            return TeaModel.build(map, self);
        }

        public GetFoundationVersionResponseBodyDataSiteSurveyTool setClusterCheckerURL(String clusterCheckerURL) {
            this.clusterCheckerURL = clusterCheckerURL;
            return this;
        }
        public String getClusterCheckerURL() {
            return this.clusterCheckerURL;
        }

        public GetFoundationVersionResponseBodyDataSiteSurveyTool setClusterInfoBrief(String clusterInfoBrief) {
            this.clusterInfoBrief = clusterInfoBrief;
            return this;
        }
        public String getClusterInfoBrief() {
            return this.clusterInfoBrief;
        }

    }

    public static class GetFoundationVersionResponseBodyData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("features")
        public java.util.List<String> features;

        @NameInMap("isDefault")
        public Boolean isDefault;

        @NameInMap("labels")
        public String labels;

        @NameInMap("name")
        public String name;

        @NameInMap("platforms")
        public java.util.List<Platform> platforms;

        @NameInMap("siteSurveyTool")
        public GetFoundationVersionResponseBodyDataSiteSurveyTool siteSurveyTool;

        @NameInMap("specName")
        public String specName;

        @NameInMap("status")
        public String status;

        @NameInMap("type")
        public String type;

        @NameInMap("uid")
        public String uid;

        /**
         * <p>version</p>
         */
        @NameInMap("version")
        public String version;

        public static GetFoundationVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFoundationVersionResponseBodyData self = new GetFoundationVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFoundationVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFoundationVersionResponseBodyData setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        public GetFoundationVersionResponseBodyData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetFoundationVersionResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetFoundationVersionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFoundationVersionResponseBodyData setPlatforms(java.util.List<Platform> platforms) {
            this.platforms = platforms;
            return this;
        }
        public java.util.List<Platform> getPlatforms() {
            return this.platforms;
        }

        public GetFoundationVersionResponseBodyData setSiteSurveyTool(GetFoundationVersionResponseBodyDataSiteSurveyTool siteSurveyTool) {
            this.siteSurveyTool = siteSurveyTool;
            return this;
        }
        public GetFoundationVersionResponseBodyDataSiteSurveyTool getSiteSurveyTool() {
            return this.siteSurveyTool;
        }

        public GetFoundationVersionResponseBodyData setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public GetFoundationVersionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFoundationVersionResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetFoundationVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetFoundationVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
