// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class GetDataStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetDataStreamResponseBodyResult result;

    public static GetDataStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataStreamResponseBody self = new GetDataStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataStreamResponseBody setResult(GetDataStreamResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDataStreamResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDataStreamResponseBodyResultTemplate extends TeaModel {
        // 索引字段设置
        @NameInMap("mappings")
        public java.util.List<DataStreamMapping> mappings;

        public static GetDataStreamResponseBodyResultTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetDataStreamResponseBodyResultTemplate self = new GetDataStreamResponseBodyResultTemplate();
            return TeaModel.build(map, self);
        }

        public GetDataStreamResponseBodyResultTemplate setMappings(java.util.List<DataStreamMapping> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.List<DataStreamMapping> getMappings() {
            return this.mappings;
        }

    }

    public static class GetDataStreamResponseBodyResult extends TeaModel {
        // 关联的应用AppId
        @NameInMap("appName")
        public String appName;

        // 代表创建时间的资源属性字段
        @NameInMap("createTime")
        public String createTime;

        // 代表资源一级ID的资源属性字段
        @NameInMap("dataStreamId")
        public String dataStreamId;

        // 代表资源名称的资源属性字段
        @NameInMap("dataStreamName")
        public String dataStreamName;

        // 删除时间
        @NameInMap("deletePhase")
        public String deletePhase;

        // 代表region的资源属性字段
        @NameInMap("regionId")
        public String regionId;

        // 数据流模板
        @NameInMap("template")
        public GetDataStreamResponseBodyResultTemplate template;

        @NameInMap("timeStampKey")
        public String timeStampKey;

        // 数据流类型
        @NameInMap("type")
        public String type;

        public static GetDataStreamResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataStreamResponseBodyResult self = new GetDataStreamResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDataStreamResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetDataStreamResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDataStreamResponseBodyResult setDataStreamId(String dataStreamId) {
            this.dataStreamId = dataStreamId;
            return this;
        }
        public String getDataStreamId() {
            return this.dataStreamId;
        }

        public GetDataStreamResponseBodyResult setDataStreamName(String dataStreamName) {
            this.dataStreamName = dataStreamName;
            return this;
        }
        public String getDataStreamName() {
            return this.dataStreamName;
        }

        public GetDataStreamResponseBodyResult setDeletePhase(String deletePhase) {
            this.deletePhase = deletePhase;
            return this;
        }
        public String getDeletePhase() {
            return this.deletePhase;
        }

        public GetDataStreamResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetDataStreamResponseBodyResult setTemplate(GetDataStreamResponseBodyResultTemplate template) {
            this.template = template;
            return this;
        }
        public GetDataStreamResponseBodyResultTemplate getTemplate() {
            return this.template;
        }

        public GetDataStreamResponseBodyResult setTimeStampKey(String timeStampKey) {
            this.timeStampKey = timeStampKey;
            return this;
        }
        public String getTimeStampKey() {
            return this.timeStampKey;
        }

        public GetDataStreamResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
