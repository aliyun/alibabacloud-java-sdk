// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopDataSourceResponseBody extends TeaModel {
    /**
     * <p>The returned message. If the service failed, an error message is returned. Otherwise, a pair of double quotation marks (&quot;&quot;) is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>serivce unavaliable</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li>Running</li>
     * <li>Failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckHadoopDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckHadoopDataSourceResponseBody self = new CheckHadoopDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckHadoopDataSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckHadoopDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckHadoopDataSourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
