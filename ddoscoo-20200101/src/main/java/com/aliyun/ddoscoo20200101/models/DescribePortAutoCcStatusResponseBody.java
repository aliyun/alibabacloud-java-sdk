// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortAutoCcStatusResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the configurations of the Intelligent Protection policy.</p>
     */
    @NameInMap("PortAutoCcStatus")
    public java.util.List<DescribePortAutoCcStatusResponseBodyPortAutoCcStatus> portAutoCcStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortAutoCcStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortAutoCcStatusResponseBody self = new DescribePortAutoCcStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortAutoCcStatusResponseBody setPortAutoCcStatus(java.util.List<DescribePortAutoCcStatusResponseBodyPortAutoCcStatus> portAutoCcStatus) {
        this.portAutoCcStatus = portAutoCcStatus;
        return this;
    }
    public java.util.List<DescribePortAutoCcStatusResponseBodyPortAutoCcStatus> getPortAutoCcStatus() {
        return this.portAutoCcStatus;
    }

    public DescribePortAutoCcStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortAutoCcStatusResponseBodyPortAutoCcStatus extends TeaModel {
        /**
         * <p>The mode of the Intelligent Protection policy. Valid values:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **loose**</p>
         * <p>*   **strict**</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The status of the Intelligent Protection policy. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
         */
        @NameInMap("Switch")
        public String _switch;

        /**
         * <p>The protection mode for ports 80 and 443. Valid values:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **loose**</p>
         * <p>*   **strict**</p>
         */
        @NameInMap("WebMode")
        public String webMode;

        /**
         * <p>The status of the Intelligent Protection policy for ports 80 and 443. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
         */
        @NameInMap("WebSwitch")
        public String webSwitch;

        public static DescribePortAutoCcStatusResponseBodyPortAutoCcStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribePortAutoCcStatusResponseBodyPortAutoCcStatus self = new DescribePortAutoCcStatusResponseBodyPortAutoCcStatus();
            return TeaModel.build(map, self);
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus set_switch(String _switch) {
            this._switch = _switch;
            return this;
        }
        public String get_switch() {
            return this._switch;
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus setWebMode(String webMode) {
            this.webMode = webMode;
            return this;
        }
        public String getWebMode() {
            return this.webMode;
        }

        public DescribePortAutoCcStatusResponseBodyPortAutoCcStatus setWebSwitch(String webSwitch) {
            this.webSwitch = webSwitch;
            return this;
        }
        public String getWebSwitch() {
            return this.webSwitch;
        }

    }

}
