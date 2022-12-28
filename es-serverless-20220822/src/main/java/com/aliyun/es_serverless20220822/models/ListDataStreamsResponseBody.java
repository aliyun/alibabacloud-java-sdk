// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class ListDataStreamsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListDataStreamsResponseBodyResult> result;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDataStreamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataStreamsResponseBody self = new ListDataStreamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataStreamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataStreamsResponseBody setResult(java.util.List<ListDataStreamsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataStreamsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListDataStreamsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataStreamsResponseBodyResultTemplate extends TeaModel {
        // 索引字段设置
        @NameInMap("mappings")
        public java.util.List<DataStreamMapping> mappings;

        public static ListDataStreamsResponseBodyResultTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListDataStreamsResponseBodyResultTemplate self = new ListDataStreamsResponseBodyResultTemplate();
            return TeaModel.build(map, self);
        }

        public ListDataStreamsResponseBodyResultTemplate setMappings(java.util.List<DataStreamMapping> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.List<DataStreamMapping> getMappings() {
            return this.mappings;
        }

    }

    public static class ListDataStreamsResponseBodyResult extends TeaModel {
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
        public ListDataStreamsResponseBodyResultTemplate template;

        @NameInMap("timeStampKey")
        public String timeStampKey;

        // 数据流类型
        @NameInMap("type")
        public String type;

        public static ListDataStreamsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataStreamsResponseBodyResult self = new ListDataStreamsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataStreamsResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDataStreamsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataStreamsResponseBodyResult setDataStreamId(String dataStreamId) {
            this.dataStreamId = dataStreamId;
            return this;
        }
        public String getDataStreamId() {
            return this.dataStreamId;
        }

        public ListDataStreamsResponseBodyResult setDataStreamName(String dataStreamName) {
            this.dataStreamName = dataStreamName;
            return this;
        }
        public String getDataStreamName() {
            return this.dataStreamName;
        }

        public ListDataStreamsResponseBodyResult setDeletePhase(String deletePhase) {
            this.deletePhase = deletePhase;
            return this;
        }
        public String getDeletePhase() {
            return this.deletePhase;
        }

        public ListDataStreamsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDataStreamsResponseBodyResult setTemplate(ListDataStreamsResponseBodyResultTemplate template) {
            this.template = template;
            return this;
        }
        public ListDataStreamsResponseBodyResultTemplate getTemplate() {
            return this.template;
        }

        public ListDataStreamsResponseBodyResult setTimeStampKey(String timeStampKey) {
            this.timeStampKey = timeStampKey;
            return this;
        }
        public String getTimeStampKey() {
            return this.timeStampKey;
        }

        public ListDataStreamsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
