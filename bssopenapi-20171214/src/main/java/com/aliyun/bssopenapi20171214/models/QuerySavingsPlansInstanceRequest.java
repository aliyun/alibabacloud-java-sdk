// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the savings plan instance.</p>
     * 
     * <strong>example:</strong>
     * <p>spn-xxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the return data. Valid values:</p>
     * <ul>
     * <li>ZH: Chinese</li>
     * <li>EN: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ZH</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the Instance. </p>
     * <ul>
     * <li>NORMAL</li>
     * <li>RELEASE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<QuerySavingsPlansInstanceRequestTag> tag;

    public static QuerySavingsPlansInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansInstanceRequest self = new QuerySavingsPlansInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansInstanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySavingsPlansInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public QuerySavingsPlansInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySavingsPlansInstanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuerySavingsPlansInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySavingsPlansInstanceRequest setTag(java.util.List<QuerySavingsPlansInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QuerySavingsPlansInstanceRequestTag> getTag() {
        return this.tag;
    }

    public static class QuerySavingsPlansInstanceRequestTag extends TeaModel {
        /**
         * <p>The key of the tag to query.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag to query.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
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
