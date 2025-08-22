// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetGovernanceReportStatusResponseBody extends TeaModel {
    @NameInMap("GovernanceItemsStatus")
    public GetGovernanceReportStatusResponseBodyGovernanceItemsStatus governanceItemsStatus;

    /**
     * <strong>example:</strong>
     * <p>F2CE9688-AA85-5F23-8C22-0EC23473405A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Progressing</p>
     */
    @NameInMap("WholeReportStatus")
    public String wholeReportStatus;

    public static GetGovernanceReportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceReportStatusResponseBody self = new GetGovernanceReportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGovernanceReportStatusResponseBody setGovernanceItemsStatus(GetGovernanceReportStatusResponseBodyGovernanceItemsStatus governanceItemsStatus) {
        this.governanceItemsStatus = governanceItemsStatus;
        return this;
    }
    public GetGovernanceReportStatusResponseBodyGovernanceItemsStatus getGovernanceItemsStatus() {
        return this.governanceItemsStatus;
    }

    public GetGovernanceReportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGovernanceReportStatusResponseBody setWholeReportStatus(String wholeReportStatus) {
        this.wholeReportStatus = wholeReportStatus;
        return this;
    }
    public String getWholeReportStatus() {
        return this.wholeReportStatus;
    }

    public static class GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccountRecentUsingAccessKey</p>
         */
        @NameInMap("GovernanceItem")
        public String governanceItem;

        /**
         * <strong>example:</strong>
         * <p>Progressing</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus self = new GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus();
            return TeaModel.build(map, self);
        }

        public GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus setGovernanceItem(String governanceItem) {
            this.governanceItem = governanceItem;
            return this;
        }
        public String getGovernanceItem() {
            return this.governanceItem;
        }

        public GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetGovernanceReportStatusResponseBodyGovernanceItemsStatus extends TeaModel {
        @NameInMap("GovernanceItemStatus")
        public java.util.List<GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus> governanceItemStatus;

        public static GetGovernanceReportStatusResponseBodyGovernanceItemsStatus build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceReportStatusResponseBodyGovernanceItemsStatus self = new GetGovernanceReportStatusResponseBodyGovernanceItemsStatus();
            return TeaModel.build(map, self);
        }

        public GetGovernanceReportStatusResponseBodyGovernanceItemsStatus setGovernanceItemStatus(java.util.List<GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus> governanceItemStatus) {
            this.governanceItemStatus = governanceItemStatus;
            return this;
        }
        public java.util.List<GetGovernanceReportStatusResponseBodyGovernanceItemsStatusGovernanceItemStatus> getGovernanceItemStatus() {
            return this.governanceItemStatus;
        }

    }

}
