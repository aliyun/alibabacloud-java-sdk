// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ElectronicItineraryBatchApplyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apply_itinerary_list")
    public java.util.List<ElectronicItineraryBatchApplyRequestApplyItineraryList> applyItineraryList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("can_reprint")
    public Boolean canReprint;

    public static ElectronicItineraryBatchApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        ElectronicItineraryBatchApplyRequest self = new ElectronicItineraryBatchApplyRequest();
        return TeaModel.build(map, self);
    }

    public ElectronicItineraryBatchApplyRequest setApplyItineraryList(java.util.List<ElectronicItineraryBatchApplyRequestApplyItineraryList> applyItineraryList) {
        this.applyItineraryList = applyItineraryList;
        return this;
    }
    public java.util.List<ElectronicItineraryBatchApplyRequestApplyItineraryList> getApplyItineraryList() {
        return this.applyItineraryList;
    }

    public ElectronicItineraryBatchApplyRequest setCanReprint(Boolean canReprint) {
        this.canReprint = canReprint;
        return this;
    }
    public Boolean getCanReprint() {
        return this.canReprint;
    }

    public static class ElectronicItineraryBatchApplyRequestApplyItineraryList extends TeaModel {
        @NameInMap("purchaser_name")
        public String purchaserName;

        /**
         * <strong>example:</strong>
         * <p>tax3213132131</p>
         */
        @NameInMap("purchaser_tax_no")
        public String purchaserTaxNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("purchaser_type")
        public Integer purchaserType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>781-2205431917</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        public static ElectronicItineraryBatchApplyRequestApplyItineraryList build(java.util.Map<String, ?> map) throws Exception {
            ElectronicItineraryBatchApplyRequestApplyItineraryList self = new ElectronicItineraryBatchApplyRequestApplyItineraryList();
            return TeaModel.build(map, self);
        }

        public ElectronicItineraryBatchApplyRequestApplyItineraryList setPurchaserName(String purchaserName) {
            this.purchaserName = purchaserName;
            return this;
        }
        public String getPurchaserName() {
            return this.purchaserName;
        }

        public ElectronicItineraryBatchApplyRequestApplyItineraryList setPurchaserTaxNo(String purchaserTaxNo) {
            this.purchaserTaxNo = purchaserTaxNo;
            return this;
        }
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        public ElectronicItineraryBatchApplyRequestApplyItineraryList setPurchaserType(Integer purchaserType) {
            this.purchaserType = purchaserType;
            return this;
        }
        public Integer getPurchaserType() {
            return this.purchaserType;
        }

        public ElectronicItineraryBatchApplyRequestApplyItineraryList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

}
