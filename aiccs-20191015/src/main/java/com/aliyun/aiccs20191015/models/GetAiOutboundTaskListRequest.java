// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskListRequest extends TeaModel {
    /**
     * <p>The end time for job creation. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1617761765000</p>
     */
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    /**
     * <p>The start time for job creation. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1615083365000</p>
     */
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <p>The page number to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page size. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filter condition.</p>
     * <blockquote>
     * <p>Matches job ID or performs fuzzy matching on job name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1763****</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>Job status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not started.</li>
     * <li><strong>1</strong>: In progress.</li>
     * <li><strong>2</strong>: Paused by the system.</li>
     * <li><strong>3</strong>: Manually paused.</li>
     * <li><strong>4</strong>: Completed.</li>
     * <li><strong>5</strong>: Stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Task Type. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Predictive outbound call.</li>
     * <li><strong>3</strong>: Automated outbound call.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static GetAiOutboundTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskListRequest self = new GetAiOutboundTaskListRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskListRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public GetAiOutboundTaskListRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public GetAiOutboundTaskListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAiOutboundTaskListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAiOutboundTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAiOutboundTaskListRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public GetAiOutboundTaskListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetAiOutboundTaskListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
