// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePrinterEventsResponseBody extends TeaModel {
    /**
     * <p>The user events.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribePrinterEventsResponseBodyEvents> events;

    /**
     * <p>The pagination token for the next query. If NextToken is empty, no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E54EB497-D7B7-5F04-B744-D8DFA7B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrinterEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrinterEventsResponseBody self = new DescribePrinterEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrinterEventsResponseBody setEvents(java.util.List<DescribePrinterEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribePrinterEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribePrinterEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePrinterEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePrinterEventsResponseBodyEvents extends TeaModel {
        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-8fupvkhg0aayu****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop-001</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5651188b-3070-d1cc-5311-75753d59****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The printer driver name.</p>
         * 
         * <strong>example:</strong>
         * <p>HP LaserJet PCL 6</p>
         */
        @NameInMap("PrinterDriver")
        public String printerDriver;

        /**
         * <p>The number of copies to print.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrinterJobCopies")
        public Integer printerJobCopies;

        /**
         * <p>The print job name.</p>
         * 
         * <strong>example:</strong>
         * <p>report.pdf</p>
         */
        @NameInMap("PrinterJobName")
        public String printerJobName;

        /**
         * <p>The total number of pages in the print job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrinterJobPages")
        public Integer printerJobPages;

        /**
         * <p>The number of printed pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrinterJobPrintedPages")
        public Integer printerJobPrintedPages;

        /**
         * <p>The print job size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2632446</p>
         */
        @NameInMap("PrinterJobSize")
        public Long printerJobSize;

        /**
         * <p>The print job time, in millisecond-precision UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1706140800000</p>
         */
        @NameInMap("PrinterJobTime")
        public Long printerJobTime;

        /**
         * <p>The printer name.</p>
         * 
         * <strong>example:</strong>
         * <p>HP LaserJet Pro</p>
         */
        @NameInMap("PrinterName")
        public String printerName;

        /**
         * <p>The printer port.</p>
         * 
         * <strong>example:</strong>
         * <p>USB001</p>
         */
        @NameInMap("PrinterPort")
        public String printerPort;

        /**
         * <p>The printer redirection type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrinterRedirType")
        public Integer printerRedirType;

        public static DescribePrinterEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribePrinterEventsResponseBodyEvents self = new DescribePrinterEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribePrinterEventsResponseBodyEvents setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribePrinterEventsResponseBodyEvents setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribePrinterEventsResponseBodyEvents setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribePrinterEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterDriver(String printerDriver) {
            this.printerDriver = printerDriver;
            return this;
        }
        public String getPrinterDriver() {
            return this.printerDriver;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterJobCopies(Integer printerJobCopies) {
            this.printerJobCopies = printerJobCopies;
            return this;
        }
        public Integer getPrinterJobCopies() {
            return this.printerJobCopies;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterJobName(String printerJobName) {
            this.printerJobName = printerJobName;
            return this;
        }
        public String getPrinterJobName() {
            return this.printerJobName;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterJobPages(Integer printerJobPages) {
            this.printerJobPages = printerJobPages;
            return this;
        }
        public Integer getPrinterJobPages() {
            return this.printerJobPages;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterJobPrintedPages(Integer printerJobPrintedPages) {
            this.printerJobPrintedPages = printerJobPrintedPages;
            return this;
        }
        public Integer getPrinterJobPrintedPages() {
            return this.printerJobPrintedPages;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterJobSize(Long printerJobSize) {
            this.printerJobSize = printerJobSize;
            return this;
        }
        public Long getPrinterJobSize() {
            return this.printerJobSize;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterJobTime(Long printerJobTime) {
            this.printerJobTime = printerJobTime;
            return this;
        }
        public Long getPrinterJobTime() {
            return this.printerJobTime;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterName(String printerName) {
            this.printerName = printerName;
            return this;
        }
        public String getPrinterName() {
            return this.printerName;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterPort(String printerPort) {
            this.printerPort = printerPort;
            return this;
        }
        public String getPrinterPort() {
            return this.printerPort;
        }

        public DescribePrinterEventsResponseBodyEvents setPrinterRedirType(Integer printerRedirType) {
            this.printerRedirType = printerRedirType;
            return this;
        }
        public Integer getPrinterRedirType() {
            return this.printerRedirType;
        }

    }

}
