// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the command.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87388.html">ListCommands</a> operation to query the command ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz01v8x80o3****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The information of nodes on which the command is run.</p>
     */
    @NameInMap("Instance")
    public java.util.List<ListInvocationResultsRequestInstance> instance;

    /**
     * <p>The status of the command that you want to query. Valid values:</p>
     * <ul>
     * <li>Finished</li>
     * <li>Running</li>
     * <li>Failed</li>
     * <li>Stopped</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    /**
     * <p>The number of the page to return.</p>
     * <p>Page numbers start from 1.</p>
     * <p>Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * <p>Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The ID of the node on which the command is run.</p>
         * <blockquote>
         * <p> The Instance.N.Id parameter specifies the node on which the command is run. If it is not specified, the command is run on all nodes of the cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-uf65bh2113hlqvyr****</p>
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
