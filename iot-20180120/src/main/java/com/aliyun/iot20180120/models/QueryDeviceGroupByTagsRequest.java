// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByTagsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tag")
    public java.util.List<QueryDeviceGroupByTagsRequestTag> tag;

    public static QueryDeviceGroupByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByTagsRequest self = new QueryDeviceGroupByTagsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceGroupByTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceGroupByTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceGroupByTagsRequest setTag(java.util.List<QueryDeviceGroupByTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QueryDeviceGroupByTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class QueryDeviceGroupByTagsRequestTag extends TeaModel {
        /**
         * <p>The key of each tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDeviceGroupByTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByTagsRequestTag self = new QueryDeviceGroupByTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByTagsRequestTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDeviceGroupByTagsRequestTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
