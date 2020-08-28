// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcubeWhitelistsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ListWhitelistResult")
    @Validation(required = true)
    public ListMcubeWhitelistsResponseListWhitelistResult listWhitelistResult;

    public static ListMcubeWhitelistsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeWhitelistsResponse self = new ListMcubeWhitelistsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMcubeWhitelistsResponseListWhitelistResultWhitelists extends TeaModel {
        @NameInMap("AppCode")
        @Validation(required = true)
        public String appCode;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("WhitelistType")
        @Validation(required = true)
        public String whitelistType;

        @NameInMap("WhiteListCount")
        @Validation(required = true)
        public Long whiteListCount;

        @NameInMap("WhiteListName")
        @Validation(required = true)
        public String whiteListName;

        public static ListMcubeWhitelistsResponseListWhitelistResultWhitelists build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeWhitelistsResponseListWhitelistResultWhitelists self = new ListMcubeWhitelistsResponseListWhitelistResultWhitelists();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMcubeWhitelistsResponseListWhitelistResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Whitelists")
        @Validation(required = true)
        public java.util.List<ListMcubeWhitelistsResponseListWhitelistResultWhitelists> whitelists;

        public static ListMcubeWhitelistsResponseListWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeWhitelistsResponseListWhitelistResult self = new ListMcubeWhitelistsResponseListWhitelistResult();
            return TeaModel.build(map, self);
        }

    }

}
