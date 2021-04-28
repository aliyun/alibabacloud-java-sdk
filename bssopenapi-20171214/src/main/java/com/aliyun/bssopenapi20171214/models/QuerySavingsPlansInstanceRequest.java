// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Tag")
    public java.util.List<QuerySavingsPlansInstanceRequestTag> tag;

    public static QuerySavingsPlansInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansInstanceRequest self = new QuerySavingsPlansInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySavingsPlansInstanceRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public QuerySavingsPlansInstanceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QuerySavingsPlansInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySavingsPlansInstanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuerySavingsPlansInstanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySavingsPlansInstanceRequest setTag(java.util.List<QuerySavingsPlansInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QuerySavingsPlansInstanceRequestTag> getTag() {
        return this.tag;
    }

    public static class QuerySavingsPlansInstanceRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QuerySavingsPlansInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceRequestTag self = new QuerySavingsPlansInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QuerySavingsPlansInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
