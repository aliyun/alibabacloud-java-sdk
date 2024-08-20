// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineRelatedDomainsResponseBody extends TeaModel {
    /**
     * <p>The domain names associated with a routine.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Domains&quot;: [
     *             &quot;xxx.com&quot;,
     *             &quot;yyy.com&quot;,
     *             ...
     *         ]</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FC0E34AC-0239-44A7-AB0E-800DE522C8DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRoutineRelatedDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineRelatedDomainsResponseBody self = new DescribeRoutineRelatedDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineRelatedDomainsResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeRoutineRelatedDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
