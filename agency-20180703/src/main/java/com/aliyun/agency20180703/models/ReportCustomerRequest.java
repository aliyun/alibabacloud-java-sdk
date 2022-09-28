// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class ReportCustomerRequest extends TeaModel {
    @NameInMap("ReportCustomerInfoList")
    public java.util.List<ReportCustomerRequestReportCustomerInfoList> reportCustomerInfoList;

    public static ReportCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportCustomerRequest self = new ReportCustomerRequest();
        return TeaModel.build(map, self);
    }

    public ReportCustomerRequest setReportCustomerInfoList(java.util.List<ReportCustomerRequestReportCustomerInfoList> reportCustomerInfoList) {
        this.reportCustomerInfoList = reportCustomerInfoList;
        return this;
    }
    public java.util.List<ReportCustomerRequestReportCustomerInfoList> getReportCustomerInfoList() {
        return this.reportCustomerInfoList;
    }

    public static class ReportCustomerRequestReportCustomerInfoList extends TeaModel {
        @NameInMap("AliyunPk")
        public Long aliyunPk;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("CustomerSubTrade")
        public String customerSubTrade;

        @NameInMap("CustomerTrade")
        public String customerTrade;

        @NameInMap("CustomerType")
        public Integer customerType;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("RamUid")
        public Long ramUid;

        public static ReportCustomerRequestReportCustomerInfoList build(java.util.Map<String, ?> map) throws Exception {
            ReportCustomerRequestReportCustomerInfoList self = new ReportCustomerRequestReportCustomerInfoList();
            return TeaModel.build(map, self);
        }

        public ReportCustomerRequestReportCustomerInfoList setAliyunPk(Long aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public Long getAliyunPk() {
            return this.aliyunPk;
        }

        public ReportCustomerRequestReportCustomerInfoList setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public ReportCustomerRequestReportCustomerInfoList setCustomerSubTrade(String customerSubTrade) {
            this.customerSubTrade = customerSubTrade;
            return this;
        }
        public String getCustomerSubTrade() {
            return this.customerSubTrade;
        }

        public ReportCustomerRequestReportCustomerInfoList setCustomerTrade(String customerTrade) {
            this.customerTrade = customerTrade;
            return this;
        }
        public String getCustomerTrade() {
            return this.customerTrade;
        }

        public ReportCustomerRequestReportCustomerInfoList setCustomerType(Integer customerType) {
            this.customerType = customerType;
            return this;
        }
        public Integer getCustomerType() {
            return this.customerType;
        }

        public ReportCustomerRequestReportCustomerInfoList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ReportCustomerRequestReportCustomerInfoList setRamUid(Long ramUid) {
            this.ramUid = ramUid;
            return this;
        }
        public Long getRamUid() {
            return this.ramUid;
        }

    }

}
