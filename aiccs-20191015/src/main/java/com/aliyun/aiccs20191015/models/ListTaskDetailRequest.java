// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskDetailRequest extends TeaModel {
    /**
     * <p>The callee number. You can view the callee number on the <strong>Detail</strong> interface of <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a>.</p>
     * 
     * <strong>example:</strong>
     * <p>186****0000</p>
     */
    @NameInMap("Called")
    public String called;

    /**
     * <p>The detail ID. You can view the detail ID on the <strong>Detail</strong> interface of <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a>.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Detail status. Valid values:</p>
     * <ul>
     * <li><strong>SUCCESS</strong>: The outbound call succeeded.</li>
     * <li><strong>FAIL</strong>: The outbound call failed.</li>
     * <li><strong>INIT</strong>: The outbound call has not been made.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The call status code. For more information, see <a href="https://help.aliyun.com/document_detail/112804.html">Call Status Codes</a> in Voice Service.</p>
     * 
     * <strong>example:</strong>
     * <p>200100</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    /**
     * <p>The job ID. You can view the job ID on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or obtain it by using the <a href="https://help.aliyun.com/document_detail/2718008.html">ListTask</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ListTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskDetailRequest self = new ListTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskDetailRequest setCalled(String called) {
        this.called = called;
        return this;
    }
    public String getCalled() {
        return this.called;
    }

    public ListTaskDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListTaskDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTaskDetailRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListTaskDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTaskDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTaskDetailRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTaskDetailRequest setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public ListTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
