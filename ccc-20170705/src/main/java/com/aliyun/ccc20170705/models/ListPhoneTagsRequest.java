// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListPhoneTagsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Number")
    public String number;

    @NameInMap("NumberGroupIds")
    public java.util.List<String> numberGroupIds;

    @NameInMap("OutboundOnly")
    public Boolean outboundOnly;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListPhoneTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneTagsRequest self = new ListPhoneTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListPhoneTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPhoneTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPhoneTagsRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ListPhoneTagsRequest setNumberGroupIds(java.util.List<String> numberGroupIds) {
        this.numberGroupIds = numberGroupIds;
        return this;
    }
    public java.util.List<String> getNumberGroupIds() {
        return this.numberGroupIds;
    }

    public ListPhoneTagsRequest setOutboundOnly(Boolean outboundOnly) {
        this.outboundOnly = outboundOnly;
        return this;
    }
    public Boolean getOutboundOnly() {
        return this.outboundOnly;
    }

    public ListPhoneTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
