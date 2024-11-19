// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnFullDomainsBlockIPConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <p>The value of Code is not 0 in the following scenarios:</p>
     * <ul>
     * <li>The format of the IP address is invalid.</li>
     * <li>The number of IP addresses exceeds the upper limit.</li>
     * <li>Other abnormal scenarios.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned results. If the operation is successful, URLs of OSS objects are returned. If the operation fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx-api.oss-cn-hangzhou.aliyuncs.com/blocklist%2Fxxxxxxxxxxxx.txt?Expires=1682663947&OSSAccessKeyId=xxxxxxxxxx&Signature=xxxxxx">http://xxxx-api.oss-cn-hangzhou.aliyuncs.com/blocklist%2Fxxxxxxxxxxxx.txt?Expires=1682663947&amp;OSSAccessKeyId=xxxxxxxxxx&amp;Signature=xxxxxx</a></p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95994621-8382-464B-8762-C708E73568D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnFullDomainsBlockIPConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnFullDomainsBlockIPConfigResponseBody self = new DescribeCdnFullDomainsBlockIPConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnFullDomainsBlockIPConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCdnFullDomainsBlockIPConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCdnFullDomainsBlockIPConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
