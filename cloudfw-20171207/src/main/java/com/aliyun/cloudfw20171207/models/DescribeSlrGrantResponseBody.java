// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSlrGrantResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsGranted")
    public Boolean isGranted;

    /**
     * <strong>example:</strong>
     * <p>1BD3D277-AE2F-5609-893F-FF7A72A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>sub</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static DescribeSlrGrantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlrGrantResponseBody self = new DescribeSlrGrantResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlrGrantResponseBody setIsGranted(Boolean isGranted) {
        this.isGranted = isGranted;
        return this;
    }
    public Boolean getIsGranted() {
        return this.isGranted;
    }

    public DescribeSlrGrantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlrGrantResponseBody setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
