// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Instance")
    public java.util.List<ListInvocationResultsRequestInstance> instance;

    public static ListInvocationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationResultsRequest self = new ListInvocationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListInvocationResultsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListInvocationResultsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public ListInvocationResultsRequest setInvokeRecordStatus(String invokeRecordStatus) {
        this.invokeRecordStatus = invokeRecordStatus;
        return this;
    }
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
    }

    public ListInvocationResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInvocationResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInvocationResultsRequest setInstance(java.util.List<ListInvocationResultsRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<ListInvocationResultsRequestInstance> getInstance() {
        return this.instance;
    }

    public static class ListInvocationResultsRequestInstance extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static ListInvocationResultsRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationResultsRequestInstance self = new ListInvocationResultsRequestInstance();
            return TeaModel.build(map, self);
        }

        public ListInvocationResultsRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
