// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetProhibitedSoftwareRequest extends TeaModel {
    /**
     * <p>The ID of the prohibited software.</p>
     */
    @NameInMap("SoftwareId")
    public GetProhibitedSoftwareRequestSoftwareId softwareId;

    public static GetProhibitedSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProhibitedSoftwareRequest self = new GetProhibitedSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public GetProhibitedSoftwareRequest setSoftwareId(GetProhibitedSoftwareRequestSoftwareId softwareId) {
        this.softwareId = softwareId;
        return this;
    }
    public GetProhibitedSoftwareRequestSoftwareId getSoftwareId() {
        return this.softwareId;
    }

    public static class GetProhibitedSoftwareRequestSoftwareId extends TeaModel {
        /**
         * <p>Specifies whether the prohibited software is a built-in prohibited software. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The software is a built-in prohibited software. It is shared by all Alibaba Cloud accounts and cannot be modified or deleted.</li>
         * <li><strong>false</strong>: The software is a custom prohibited software within the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the prohibited software. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Queries prohibited software in batches.</li>
         * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>swb-3e6a1f9c4b28****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static GetProhibitedSoftwareRequestSoftwareId build(java.util.Map<String, ?> map) throws Exception {
            GetProhibitedSoftwareRequestSoftwareId self = new GetProhibitedSoftwareRequestSoftwareId();
            return TeaModel.build(map, self);
        }

        public GetProhibitedSoftwareRequestSoftwareId setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetProhibitedSoftwareRequestSoftwareId setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

}
