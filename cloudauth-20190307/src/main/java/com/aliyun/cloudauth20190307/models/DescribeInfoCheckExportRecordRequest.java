// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeInfoCheckExportRecordRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-11 21:24:48</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification.</li>
     * <li><strong>ID_PERIOD</strong>: ID card validity period verification.</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration.</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status.</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition).</li>
     * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition).</li>
     * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification.</li>
     * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition).</li>
     * <li><strong>MOBILE_DETECT</strong>: phone number detection.</li>
     * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition).</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition.</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition.</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query.</li>
     * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ID_CARD_2_META</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-11 21:24:48</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeInfoCheckExportRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInfoCheckExportRecordRequest self = new DescribeInfoCheckExportRecordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInfoCheckExportRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInfoCheckExportRecordRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeInfoCheckExportRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInfoCheckExportRecordRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeInfoCheckExportRecordRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
