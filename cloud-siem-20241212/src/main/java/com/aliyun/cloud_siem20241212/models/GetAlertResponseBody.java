// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetAlertResponseBody extends TeaModel {
    /**
     * <p>If this value is true, the minor engine version is not the latest version.</p>
     * <blockquote>
     * <p>If the minor engine version of your server is not the latest version, the sampling logs may be inaccurate, which causes inaccurate IP statistics. We recommend that you upgrade the minor engine version at your earliest convenience.</p>
     * </blockquote>
     */
    @NameInMap("Alert")
    public GetAlertResponseBodyAlert alert;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertResponseBody self = new GetAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertResponseBody setAlert(GetAlertResponseBodyAlert alert) {
        this.alert = alert;
        return this;
    }
    public GetAlertResponseBodyAlert getAlert() {
        return this.alert;
    }

    public GetAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlertResponseBodyAlert extends TeaModel {
        /**
         * <p>The alert content.</p>
         * 
         * <strong>example:</strong>
         * <p>{***}</p>
         */
        @NameInMap("AlertRecord")
        public String alertRecord;

        /**
         * <p>The alert UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_1175554881779200_e59368b3ce1690eae7978f7712a69050</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        public static GetAlertResponseBodyAlert build(java.util.Map<String, ?> map) throws Exception {
            GetAlertResponseBodyAlert self = new GetAlertResponseBodyAlert();
            return TeaModel.build(map, self);
        }

        public GetAlertResponseBodyAlert setAlertRecord(String alertRecord) {
            this.alertRecord = alertRecord;
            return this;
        }
        public String getAlertRecord() {
            return this.alertRecord;
        }

        public GetAlertResponseBodyAlert setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

    }

}
