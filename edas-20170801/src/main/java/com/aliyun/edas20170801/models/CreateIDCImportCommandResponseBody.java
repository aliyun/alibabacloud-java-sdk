// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateIDCImportCommandResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The generated import command.</p>
     * 
     * <strong>example:</strong>
     * <p>wget -q -O /tmp/install.sh <a href="http://edas-hz.oss-cn-hangzhou-internal.aliyuncs.com/install.sh">http://edas-hz.oss-cn-hangzhou-internal.aliyuncs.com/install.sh</a> &amp;&amp; sh /tmp/install.sh -idcToken xxxx-xxxxx-xxxxx-xxxxxxx -edasId xxxxxxxxxxxxxx</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b197-40ab-9155-7ca7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIDCImportCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIDCImportCommandResponseBody self = new CreateIDCImportCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIDCImportCommandResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIDCImportCommandResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateIDCImportCommandResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIDCImportCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
