// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeLogResponseBody extends TeaModel {
    /**
     * <p>The content of the log.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <p>stdout:n++++++++++++++++++executing sql: MSCK REPAIR TABLE  <code>footprint_ethereum</code>.<code>dwd_eth_eth_txr_v2_di</code> n++n</p>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     */
    @NameInMap("Log")
    public String log;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request was successful, <strong>Success</strong> is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CD65640-9963-5D60-929C-118F2C84070E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSparkCodeLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeLogResponseBody self = new DescribeSparkCodeLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeLogResponseBody setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public DescribeSparkCodeLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSparkCodeLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSparkCodeLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
