// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetCommonLogDetailRequest extends TeaModel {
    /**
     * <p>The start time of the time range within which the logs that you want to query were generated. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1703821542</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <p>Specifies whether to hide the process of each step. Valid values:</p>
     * <ul>
     * <li>true: hides the process and returns only the result log of each step.</li>
     * <li>false: does not hide the process and displays the start and result logs of each step.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HiddenProcess")
    public Boolean hiddenProcess;

    /**
     * <p>The request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("LogRequestId")
    public String logRequestId;

    /**
     * <p>The end time of the time range within which the logs that you want to query were generated. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
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
