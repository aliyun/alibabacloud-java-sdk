// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    @NameInMap("UserProjectName")
    public String userProjectName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsUserProjectLogstoreExist")
    public Integer isUserProjectLogstoreExist;

    @NameInMap("IsEtlMetaExist")
    public Integer isEtlMetaExist;

    public static DescribeMongoDBLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMongoDBLogConfigResponseBody self = new DescribeMongoDBLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMongoDBLogConfigResponseBody setUserProjectName(String userProjectName) {
        this.userProjectName = userProjectName;
        return this;
    }
    public String getUserProjectName() {
        return this.userProjectName;
    }

    public DescribeMongoDBLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMongoDBLogConfigResponseBody setIsUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
        this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
        return this;
    }
    public Integer getIsUserProjectLogstoreExist() {
        return this.isUserProjectLogstoreExist;
    }

    public DescribeMongoDBLogConfigResponseBody setIsEtlMetaExist(Integer isEtlMetaExist) {
        this.isEtlMetaExist = isEtlMetaExist;
        return this;
    }
    public Integer getIsEtlMetaExist() {
        return this.isEtlMetaExist;
    }

}
