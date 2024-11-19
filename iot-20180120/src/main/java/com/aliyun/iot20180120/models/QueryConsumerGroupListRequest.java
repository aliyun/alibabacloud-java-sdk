// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to perform a fuzzy search. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a fuzzy search. You must specify the <strong>GroupName</strong> parameter.</li>
     * <li><strong>false</strong>: queries all consumer groups of the current account.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Fuzzy")
    public Boolean fuzzy;

    /**
     * <p>The name of the consumer group to be queried. This parameter is required if the <strong>Fuzzy</strong> parameter is set to <strong>true</strong>.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

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
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SubBizCode")
    public String subBizCode;

    @NameInMap("Type")
    public String type;

    public static QueryConsumerGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupListRequest self = new QueryConsumerGroupListRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryConsumerGroupListRequest setFuzzy(Boolean fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public Boolean getFuzzy() {
        return this.fuzzy;
    }

    public QueryConsumerGroupListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public QueryConsumerGroupListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryConsumerGroupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryConsumerGroupListRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

    public QueryConsumerGroupListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
