// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationRequest extends TeaModel {
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("PortRanges")
    public java.util.List<UpdatePrivateAccessApplicationRequestPortRanges> portRanges;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static UpdatePrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationRequest self = new UpdatePrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public UpdatePrivateAccessApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePrivateAccessApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePrivateAccessApplicationRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdatePrivateAccessApplicationRequest setPortRanges(java.util.List<UpdatePrivateAccessApplicationRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<UpdatePrivateAccessApplicationRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public UpdatePrivateAccessApplicationRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdatePrivateAccessApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrivateAccessApplicationRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static class UpdatePrivateAccessApplicationRequestPortRanges extends TeaModel {
        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        public static UpdatePrivateAccessApplicationRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateAccessApplicationRequestPortRanges self = new UpdatePrivateAccessApplicationRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateAccessApplicationRequestPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public UpdatePrivateAccessApplicationRequestPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
