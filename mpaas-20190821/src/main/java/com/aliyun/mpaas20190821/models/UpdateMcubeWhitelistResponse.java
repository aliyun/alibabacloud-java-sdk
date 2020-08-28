// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class UpdateMcubeWhitelistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("AddWhitelistResult")
    @Validation(required = true)
    public UpdateMcubeWhitelistResponseAddWhitelistResult addWhitelistResult;

    public static UpdateMcubeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeWhitelistResponse self = new UpdateMcubeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateMcubeWhitelistResponseAddWhitelistResultAddWhitelistInfo extends TeaModel {
        @NameInMap("FailNum")
        @Validation(required = true)
        public Long failNum;

        @NameInMap("FailUserIds")
        @Validation(required = true)
        public String failUserIds;

        @NameInMap("SuccessNum")
        @Validation(required = true)
        public Long successNum;

        public static UpdateMcubeWhitelistResponseAddWhitelistResultAddWhitelistInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcubeWhitelistResponseAddWhitelistResultAddWhitelistInfo self = new UpdateMcubeWhitelistResponseAddWhitelistResultAddWhitelistInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateMcubeWhitelistResponseAddWhitelistResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("AddWhitelistInfo")
        @Validation(required = true)
        public UpdateMcubeWhitelistResponseAddWhitelistResultAddWhitelistInfo addWhitelistInfo;

        public static UpdateMcubeWhitelistResponseAddWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcubeWhitelistResponseAddWhitelistResult self = new UpdateMcubeWhitelistResponseAddWhitelistResult();
            return TeaModel.build(map, self);
        }

    }

}
