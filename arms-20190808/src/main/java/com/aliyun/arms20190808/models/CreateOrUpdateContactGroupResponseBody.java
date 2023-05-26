// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the alert contact group.</p>
     */
    @NameInMap("AlertContactGroup")
    public CreateOrUpdateContactGroupResponseBodyAlertContactGroup alertContactGroup;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactGroupResponseBody self = new CreateOrUpdateContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactGroupResponseBody setAlertContactGroup(CreateOrUpdateContactGroupResponseBodyAlertContactGroup alertContactGroup) {
        this.alertContactGroup = alertContactGroup;
        return this;
    }
    public CreateOrUpdateContactGroupResponseBodyAlertContactGroup getAlertContactGroup() {
        return this.alertContactGroup;
    }

    public CreateOrUpdateContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrUpdateContactGroupResponseBodyAlertContactGroup extends TeaModel {
        /**
         * <p>The ID of the alert contact group.</p>
         */
        @NameInMap("ContactGroupId")
        public Float contactGroupId;

        /**
         * <p>The name of the alert contact group.</p>
         */
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        /**
         * <p>The IDs of the contacts that are included in the alert contact group.</p>
         */
        @NameInMap("ContactIds")
        public String contactIds;

        public static CreateOrUpdateContactGroupResponseBodyAlertContactGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateContactGroupResponseBodyAlertContactGroup self = new CreateOrUpdateContactGroupResponseBodyAlertContactGroup();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateContactGroupResponseBodyAlertContactGroup setContactGroupId(Float contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }
        public Float getContactGroupId() {
            return this.contactGroupId;
        }

        public CreateOrUpdateContactGroupResponseBodyAlertContactGroup setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public CreateOrUpdateContactGroupResponseBodyAlertContactGroup setContactIds(String contactIds) {
            this.contactIds = contactIds;
            return this;
        }
        public String getContactIds() {
            return this.contactIds;
        }

    }

}
