// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceSignedUrlRequest extends TeaModel {
    /**
     * <p>The period of time for which the URL expires.</p>
     * 
     * <strong>example:</strong>
     * <p>43200</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>Specifies whether to use the VPC connection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Internal")
    public Boolean internal;

    /**
     * <p>The page type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>webview</li>
     * <li>monitor</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>webview</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeServiceSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceSignedUrlRequest self = new DescribeServiceSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceSignedUrlRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeServiceSignedUrlRequest setInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }
    public Boolean getInternal() {
        return this.internal;
    }

    public DescribeServiceSignedUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
