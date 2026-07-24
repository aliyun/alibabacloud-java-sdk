// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetScanNumResponseBody extends TeaModel {
    /**
     * <p>The upper limit on the number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("LimitNumber")
    public Long limitNumber;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of files pending detection.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ScanNumber")
    public Long scanNumber;

    /**
     * <p>The total number of files.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SumNumber")
    public Long sumNumber;

    /**
     * <p>Indicates whether the user is a whitelisted user.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Tag")
    public Boolean tag;

    public static GetScanNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScanNumResponseBody self = new GetScanNumResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScanNumResponseBody setLimitNumber(Long limitNumber) {
        this.limitNumber = limitNumber;
        return this;
    }
    public Long getLimitNumber() {
        return this.limitNumber;
    }

    public GetScanNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScanNumResponseBody setScanNumber(Long scanNumber) {
        this.scanNumber = scanNumber;
        return this;
    }
    public Long getScanNumber() {
        return this.scanNumber;
    }

    public GetScanNumResponseBody setSumNumber(Long sumNumber) {
        this.sumNumber = sumNumber;
        return this;
    }
    public Long getSumNumber() {
        return this.sumNumber;
    }

    public GetScanNumResponseBody setTag(Boolean tag) {
        this.tag = tag;
        return this;
    }
    public Boolean getTag() {
        return this.tag;
    }

}
