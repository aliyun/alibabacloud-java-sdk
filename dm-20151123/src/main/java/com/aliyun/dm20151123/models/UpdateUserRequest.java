// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("User")
    public UpdateUserRequestUser user;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setUser(UpdateUserRequestUser user) {
        this.user = user;
        return this;
    }
    public UpdateUserRequestUser getUser() {
        return this.user;
    }

    public static class UpdateUserRequestUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableEventbridge")
        public Boolean enableEventbridge;

        public static UpdateUserRequestUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserRequestUser self = new UpdateUserRequestUser();
            return TeaModel.build(map, self);
        }

        public UpdateUserRequestUser setEnableEventbridge(Boolean enableEventbridge) {
            this.enableEventbridge = enableEventbridge;
            return this;
        }
        public Boolean getEnableEventbridge() {
            return this.enableEventbridge;
        }

    }

}
