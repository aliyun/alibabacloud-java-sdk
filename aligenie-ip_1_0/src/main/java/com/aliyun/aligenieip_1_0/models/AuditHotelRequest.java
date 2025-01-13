// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AuditHotelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuditHotelReq")
    public AuditHotelRequestAuditHotelReq auditHotelReq;

    public static AuditHotelRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditHotelRequest self = new AuditHotelRequest();
        return TeaModel.build(map, self);
    }

    public AuditHotelRequest setAuditHotelReq(AuditHotelRequestAuditHotelReq auditHotelReq) {
        this.auditHotelReq = auditHotelReq;
        return this;
    }
    public AuditHotelRequestAuditHotelReq getAuditHotelReq() {
        return this.auditHotelReq;
    }

    public static class AuditHotelRequestAuditHotelReq extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("AuditOpinion")
        public String auditOpinion;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static AuditHotelRequestAuditHotelReq build(java.util.Map<String, ?> map) throws Exception {
            AuditHotelRequestAuditHotelReq self = new AuditHotelRequestAuditHotelReq();
            return TeaModel.build(map, self);
        }

        public AuditHotelRequestAuditHotelReq setAuditOpinion(String auditOpinion) {
            this.auditOpinion = auditOpinion;
            return this;
        }
        public String getAuditOpinion() {
            return this.auditOpinion;
        }

        public AuditHotelRequestAuditHotelReq setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public AuditHotelRequestAuditHotelReq setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
