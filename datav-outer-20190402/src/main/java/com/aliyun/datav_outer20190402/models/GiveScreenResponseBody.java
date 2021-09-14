// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GiveScreenResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    // 拷贝后的大屏
    @NameInMap("Screen")
    public GiveScreenResponseBodyScreen screen;

    public static GiveScreenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GiveScreenResponseBody self = new GiveScreenResponseBody();
        return TeaModel.build(map, self);
    }

    public GiveScreenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GiveScreenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GiveScreenResponseBody setScreen(GiveScreenResponseBodyScreen screen) {
        this.screen = screen;
        return this;
    }
    public GiveScreenResponseBodyScreen getScreen() {
        return this.screen;
    }

    public static class GiveScreenResponseBodyScreen extends TeaModel {
        @NameInMap("ID")
        public Long ID;

        @NameInMap("Name")
        public String name;

        public static GiveScreenResponseBodyScreen build(java.util.Map<String, ?> map) throws Exception {
            GiveScreenResponseBodyScreen self = new GiveScreenResponseBodyScreen();
            return TeaModel.build(map, self);
        }

        public GiveScreenResponseBodyScreen setID(Long ID) {
            this.ID = ID;
            return this;
        }
        public Long getID() {
            return this.ID;
        }

        public GiveScreenResponseBodyScreen setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
