// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifySettingList")
    public java.util.List<DescribeVerifySettingResponseBodyVerifySettingList> verifySettingList;

    public static DescribeVerifySettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySettingResponseBody self = new DescribeVerifySettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifySettingResponseBody setVerifySettingList(java.util.List<DescribeVerifySettingResponseBodyVerifySettingList> verifySettingList) {
        this.verifySettingList = verifySettingList;
        return this;
    }
    public java.util.List<DescribeVerifySettingResponseBodyVerifySettingList> getVerifySettingList() {
        return this.verifySettingList;
    }

    public static class DescribeVerifySettingResponseBodyVerifySettingList extends TeaModel {
        @NameInMap("StepList")
        public java.util.List<String> stepList;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("BizType")
        public String bizType;

        public static DescribeVerifySettingResponseBodyVerifySettingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifySettingResponseBodyVerifySettingList self = new DescribeVerifySettingResponseBodyVerifySettingList();
            return TeaModel.build(map, self);
        }

        public DescribeVerifySettingResponseBodyVerifySettingList setStepList(java.util.List<String> stepList) {
            this.stepList = stepList;
            return this;
        }
        public java.util.List<String> getStepList() {
            return this.stepList;
        }

        public DescribeVerifySettingResponseBodyVerifySettingList setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeVerifySettingResponseBodyVerifySettingList setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeVerifySettingResponseBodyVerifySettingList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

}
