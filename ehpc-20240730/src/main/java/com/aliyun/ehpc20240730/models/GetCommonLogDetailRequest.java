// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetCommonLogDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1703821542</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HiddenProcess")
    public Boolean hiddenProcess;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("LogRequestId")
    public String logRequestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1703821666</p>
     */
    @NameInMap("To")
    public Long to;

    public static GetCommonLogDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommonLogDetailRequest self = new GetCommonLogDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCommonLogDetailRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetCommonLogDetailRequest setHiddenProcess(Boolean hiddenProcess) {
        this.hiddenProcess = hiddenProcess;
        return this;
    }
    public Boolean getHiddenProcess() {
        return this.hiddenProcess;
    }

    public GetCommonLogDetailRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public GetCommonLogDetailRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
