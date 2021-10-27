// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySettingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VerifySettingList")
    @Validation(required = true)
    public java.util.List<DescribeVerifySettingResponseVerifySettingList> verifySettingList;

    public static DescribeVerifySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySettingResponse self = new DescribeVerifySettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySettingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifySettingResponse setVerifySettingList(java.util.List<DescribeVerifySettingResponseVerifySettingList> verifySettingList) {
        this.verifySettingList = verifySettingList;
        return this;
    }
    public java.util.List<DescribeVerifySettingResponseVerifySettingList> getVerifySettingList() {
        return this.verifySettingList;
    }

    public static class DescribeVerifySettingResponseVerifySettingList extends TeaModel {
        @NameInMap("BizName")
        @Validation(required = true)
        public String bizName;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("Solution")
        @Validation(required = true)
        public String solution;

        @NameInMap("StepList")
        @Validation(required = true)
        public java.util.List<String> stepList;

        public static DescribeVerifySettingResponseVerifySettingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifySettingResponseVerifySettingList self = new DescribeVerifySettingResponseVerifySettingList();
            return TeaModel.build(map, self);
        }

        public DescribeVerifySettingResponseVerifySettingList setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeVerifySettingResponseVerifySettingList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeVerifySettingResponseVerifySettingList setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeVerifySettingResponseVerifySettingList setStepList(java.util.List<String> stepList) {
            this.stepList = stepList;
            return this;
        }
        public java.util.List<String> getStepList() {
            return this.stepList;
        }

    }

}
