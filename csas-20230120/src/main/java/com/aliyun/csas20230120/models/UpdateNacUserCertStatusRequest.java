// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateNacUserCertStatusRequest extends TeaModel {
    /**
     * <p>A collection of end user IDs and device IDs.</p>
     */
    @NameInMap("IdList")
    public java.util.List<UpdateNacUserCertStatusRequestIdList> idList;

    /**
     * <p>The certificate status for the end user device. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong></p>
     * </li>
     * <li><p><strong>Disabled</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateNacUserCertStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacUserCertStatusRequest self = new UpdateNacUserCertStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacUserCertStatusRequest setIdList(java.util.List<UpdateNacUserCertStatusRequestIdList> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<UpdateNacUserCertStatusRequestIdList> getIdList() {
        return this.idList;
    }

    public UpdateNacUserCertStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class UpdateNacUserCertStatusRequestIdList extends TeaModel {
        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdateNacUserCertStatusRequestIdList build(java.util.Map<String, ?> map) throws Exception {
            UpdateNacUserCertStatusRequestIdList self = new UpdateNacUserCertStatusRequestIdList();
            return TeaModel.build(map, self);
        }

        public UpdateNacUserCertStatusRequestIdList setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public UpdateNacUserCertStatusRequestIdList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
