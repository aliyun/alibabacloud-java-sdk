// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUserInfoListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserInfoList")
    public java.util.List<DescribeUserInfoListResponseBodyUserInfoList> userInfoList;

    public static DescribeUserInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoListResponseBody self = new DescribeUserInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeUserInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserInfoListResponseBody setUserInfoList(java.util.List<DescribeUserInfoListResponseBodyUserInfoList> userInfoList) {
        this.userInfoList = userInfoList;
        return this;
    }
    public java.util.List<DescribeUserInfoListResponseBodyUserInfoList> getUserInfoList() {
        return this.userInfoList;
    }

    public static class DescribeUserInfoListResponseBodyUserInfoList extends TeaModel {
        @NameInMap("Sex")
        public Integer sex;

        @NameInMap("CertificateType")
        public String certificateType;

        @NameInMap("Birthday")
        public Long birthday;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UserGroupId")
        public Long userGroupId;

        @NameInMap("IdentifyingImage")
        public String identifyingImage;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("CertificateNo")
        public String certificateNo;

        @NameInMap("Id")
        public Long id;

        public static DescribeUserInfoListResponseBodyUserInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserInfoListResponseBodyUserInfoList self = new DescribeUserInfoListResponseBodyUserInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeUserInfoListResponseBodyUserInfoList setSex(Integer sex) {
            this.sex = sex;
            return this;
        }
        public Integer getSex() {
            return this.sex;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setBirthday(Long birthday) {
            this.birthday = birthday;
            return this;
        }
        public Long getBirthday() {
            return this.birthday;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setUserGroupId(Long userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Long getUserGroupId() {
            return this.userGroupId;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setIdentifyingImage(String identifyingImage) {
            this.identifyingImage = identifyingImage;
            return this;
        }
        public String getIdentifyingImage() {
            return this.identifyingImage;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setCertificateNo(String certificateNo) {
            this.certificateNo = certificateNo;
            return this;
        }
        public String getCertificateNo() {
            return this.certificateNo;
        }

        public DescribeUserInfoListResponseBodyUserInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
