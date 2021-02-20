// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortAutoCcStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PortAutoCcStatus")
    public java.util.List<DescribePortAutoCcStatusResponseBodyPortAutoCcStatus> portAutoCcStatus;

    public static DescribePortAutoCcStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortAutoCcStatusResponseBody self = new DescribePortAutoCcStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortAutoCcStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortAutoCcStatusResponseBody setPortAutoCcStatus(java.util.List<DescribePortAutoCcStatusResponseBodyPortAutoCcStatus> portAutoCcStatus) {
        this.portAutoCcStatus = portAutoCcStatus;
        return this;
    }
    public java.util.List<DescribePortAutoCcStatusResponseBodyPortAutoCcStatus> getPortAutoCcStatus() {
        return this.portAutoCcStatus;
    }

    public static class DescribePortAutoCcStatusResponseBodyPortAutoCcStatus extends TeaModel {
        @NameInMap("Switch")
        public String _switch;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("WebSwitch")
        public String webSwitch;

        @NameInMap("WebMode")
        public String webMode;

        public static DescribePortAutoCcStatusResponseBodyPortAutoCcStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribePortAutoCcStatusResponseBodyPortAutoCcStatus self = new DescribePortAutoCcStatusResponseBodyPortAutoCcStatus();
            return TeaModel.build(map, self);
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus set_switch(String _switch) {
            this._switch = _switch;
            return this;
        }
        public String get_switch() {
            return this._switch;
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus setWebSwitch(String webSwitch) {
            this.webSwitch = webSwitch;
            return this;
        }
        public String getWebSwitch() {
            return this.webSwitch;
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus setWebMode(String webMode) {
            this.webMode = webMode;
            return this;
        }
        public String getWebMode() {
            return this.webMode;
        }

    }

}
