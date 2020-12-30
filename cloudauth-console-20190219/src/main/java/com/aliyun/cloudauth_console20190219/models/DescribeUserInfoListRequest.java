// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUserInfoListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CertificateNo")
    public String certificateNo;

    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("UserGroupId")
    public Long userGroupId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeUserInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoListRequest self = new DescribeUserInfoListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUserInfoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserInfoListRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeUserInfoListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUserInfoListRequest setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

    public DescribeUserInfoListRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public DescribeUserInfoListRequest setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    public DescribeUserInfoListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
