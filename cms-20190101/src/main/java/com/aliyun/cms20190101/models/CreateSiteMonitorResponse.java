// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AlertRule")
    @Validation(required = true)
    public String alertRule;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateSiteMonitorResponseData data;

    public static CreateSiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorResponse self = new CreateSiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateSiteMonitorResponseDataAttachAlertResultContact extends TeaModel {
        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("RequestId")
        @Validation(required = true)
        public String requestId;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Success")
        @Validation(required = true)
        public String success;

        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        public static CreateSiteMonitorResponseDataAttachAlertResultContact build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseDataAttachAlertResultContact self = new CreateSiteMonitorResponseDataAttachAlertResultContact();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateSiteMonitorResponseDataAttachAlertResult extends TeaModel {
        @NameInMap("Contact")
        @Validation(required = true)
        public java.util.List<CreateSiteMonitorResponseDataAttachAlertResultContact> contact;

        public static CreateSiteMonitorResponseDataAttachAlertResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseDataAttachAlertResult self = new CreateSiteMonitorResponseDataAttachAlertResult();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateSiteMonitorResponseData extends TeaModel {
        @NameInMap("AttachAlertResult")
        @Validation(required = true)
        public CreateSiteMonitorResponseDataAttachAlertResult attachAlertResult;

        public static CreateSiteMonitorResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseData self = new CreateSiteMonitorResponseData();
            return TeaModel.build(map, self);
        }

    }

}
