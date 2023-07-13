// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the command.</p>
     * <br>
     * <p>You can call the [ListCommands](~~87388~~) operation to query the command ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The status of the command that you want to query. Valid values:</p>
     * <br>
     * <p>*   Finished</p>
     * <p>*   Running</p>
     * <p>*   Failed</p>
     * <p>*   Stopped</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("Instance")
    public java.util.List<ListInvocationResultsRequestInstance> instance;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Page numbers start from 1.</p>
     * <br>
     * <p>Default value: 1</p>
     */
    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the node on which the command is run.</p>
     * <br>
     * <p>>  The Instance.N.Id parameter specifies the node on which the command is run. If it is not specified, the command is run on all nodes of the cluster.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    public ListInvocationResultsRequest setInstance(java.util.List<ListInvocationResultsRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<ListInvocationResultsRequestInstance> getInstance() {
        return this.instance;
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

    public static class ListInvocationResultsRequestInstance extends TeaModel {
        /**
         * <p>The number of entries returned per page.</p>
         */
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
