// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobLogRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. Use the Id parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    /**
     * <p>The failover ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FailoverId")
    public Long failoverId;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6153616438</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The type of the node. This parameter is applicable only to the tasks that are run on serverless resource groups. Valid values:</p>
     * <ul>
     * <li><strong>MASTER</strong>: the master node, which is used to query the logs of JobManagers.</li>
     * <li><strong>WORKER</strong>: the worker node, which is used to query the logs of TaskManagers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The page number of the pagination query. The value is a positive integer greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static GetDIJobLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobLogRequest self = new GetDIJobLogRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public GetDIJobLogRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public GetDIJobLogRequest setFailoverId(Long failoverId) {
        this.failoverId = failoverId;
        return this;
    }
    public Long getFailoverId() {
        return this.failoverId;
    }

    public GetDIJobLogRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDIJobLogRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetDIJobLogRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public GetDIJobLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
