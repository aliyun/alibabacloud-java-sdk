// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetConversationDetailByContactIdRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetConversationDetailByContactIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConversationDetailByContactIdRequest self = new GetConversationDetailByContactIdRequest();
        return TeaModel.build(map, self);
    }

    public GetConversationDetailByContactIdRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetConversationDetailByContactIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetConversationDetailByContactIdRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetConversationDetailByContactIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
