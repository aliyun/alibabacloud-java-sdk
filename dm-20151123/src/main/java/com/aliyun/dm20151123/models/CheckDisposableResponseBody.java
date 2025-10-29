// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckDisposableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDisposable")
    public String isDisposable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFormatValid")
    public String isFormatValid;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMxValid")
    public String isMxValid;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOkToSend")
    public String isOkToSend;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckDisposableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDisposableResponseBody self = new CheckDisposableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDisposableResponseBody setIsDisposable(String isDisposable) {
        this.isDisposable = isDisposable;
        return this;
    }
    public String getIsDisposable() {
        return this.isDisposable;
    }

    public CheckDisposableResponseBody setIsFormatValid(String isFormatValid) {
        this.isFormatValid = isFormatValid;
        return this;
    }
    public String getIsFormatValid() {
        return this.isFormatValid;
    }

    public CheckDisposableResponseBody setIsMxValid(String isMxValid) {
        this.isMxValid = isMxValid;
        return this;
    }
    public String getIsMxValid() {
        return this.isMxValid;
    }

    public CheckDisposableResponseBody setIsOkToSend(String isOkToSend) {
        this.isOkToSend = isOkToSend;
        return this;
    }
    public String getIsOkToSend() {
        return this.isOkToSend;
    }

    public CheckDisposableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
