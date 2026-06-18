// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordDetailRequest extends TeaModel {
    /**
     * <p>A unique ID for the customer request. Used for idempotency validation and can be generated using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The start time when the hotline call ends. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614582000000</p>
     */
    @NameInMap("CloseTimeEnd")
    public Long closeTimeEnd;

    /**
     * <p>The end time when the hotline call ends. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614578400000</p>
     */
    @NameInMap("CloseTimeStart")
    public Long closeTimeStart;

    /**
     * <p>Current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page size. Default value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListHotlineRecordDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordDetailRequest self = new ListHotlineRecordDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordDetailRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListHotlineRecordDetailRequest setCloseTimeEnd(Long closeTimeEnd) {
        this.closeTimeEnd = closeTimeEnd;
        return this;
    }
    public Long getCloseTimeEnd() {
        return this.closeTimeEnd;
    }

    public ListHotlineRecordDetailRequest setCloseTimeStart(Long closeTimeStart) {
        this.closeTimeStart = closeTimeStart;
        return this;
    }
    public Long getCloseTimeStart() {
        return this.closeTimeStart;
    }

    public ListHotlineRecordDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHotlineRecordDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHotlineRecordDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
